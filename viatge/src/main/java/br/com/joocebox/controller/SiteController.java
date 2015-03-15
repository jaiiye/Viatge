package br.com.joocebox.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.joocebox.model.Agency;
import br.com.joocebox.model.Category;
import br.com.joocebox.model.Destination;
import br.com.joocebox.model.Image;
import br.com.joocebox.multitenancy.CurrentTenantResolver;
import br.com.joocebox.service.CategoryFacade;
import br.com.joocebox.service.DashboardFacade;

@Controller
@Transactional(propagation=Propagation.REQUIRED)
public class SiteController {
    final static Logger logger = LoggerFactory.getLogger(SiteController.class);

    @Autowired
    private DashboardFacade dashboardFacade;
    
    @Autowired
    private CurrentTenantResolver<Long> tenantResolver;
    
    
	/**
	 * Método utilizado para apresentar os dados do tenant corrente no site.
	 *  
	 * @return String
	 */
	@RequestMapping("/site")
	public String siteTemplate(Model model){
		
		if (tenantResolver.isMasterTenant() || !tenantResolver.isSubDomainExist()) {
			model.addAttribute("tenant", new Agency());
			return "landing/register";		
		}
		
		Agency agency = dashboardFacade.getAgency();
		String agencyLogo = agency.getAgencyLogo();
		
		String fileName = agencyLogo.replace("/app/joocebox-img/xpto/logo/", "");
		agency.setAgencyLogo(fileName);
		model.addAttribute("tenant", agency);
		getAllCategories(model);
		getDestinationsForWebSite(model);
		logger.info("Buscando agência e adicionando seus atributos");
		return "site/index";	
	}
	
	/**
	 * Método utilizado para-se recuperar todas as categorias do site.
	 * @param Model model
	 */
	public void getAllCategories(Model model){
		List<Category> categoryList = dashboardFacade.getCategoryList();
		model.addAttribute("categoryList", categoryList);		
	}
	
	/**
	 * Método utilizado para-se recuperar todos os destinos de destaque no site.
	 * @param Model model
	 */
	public void getDestinationsForWebSite(Model model){
		List<Destination> destinationList = dashboardFacade.getDestinationList();
		List<Destination> destinationHightlightList = new ArrayList<Destination>();
		List<Destination> destinationAppearInWebSiteList = new ArrayList<Destination>();
				
		for (Destination destination : destinationList) {
			if(destination.getDtHighlightWebsite()){
				destinationHightlightList.add(destination);
			}else if (destination.getDtAppearWebsite()) {
				destinationAppearInWebSiteList.add(destination);
			}
		}
		model.addAttribute("destinationAppearInWebSiteList", destinationAppearInWebSiteList);
		model.addAttribute("destinationHightlightList", destinationHightlightList);
	}
	
	//------------------------------------------------------------------------------------------
	
	@RequestMapping("/destinationDetail/{destinationId}")
	public String getDestinationDetail(@PathVariable Long destinationId,  Model model){
		model.addAttribute("destinationDetail",dashboardFacade.getDestinationId(destinationId));
		model.addAttribute("agencyDetail", dashboardFacade.getAgency());
		return "site/destinationDetail";
		
	}
	
	@RequestMapping("/categoryList/{id}")
	public String getCategoryList(@PathVariable Long id, Model model){
		Category categoryId = dashboardFacade.getCategoryId(id);
		model.addAttribute("listOfDestinationByCategory", categoryId.getDestination());
		return "site/categoryList";
	}
	
    
}