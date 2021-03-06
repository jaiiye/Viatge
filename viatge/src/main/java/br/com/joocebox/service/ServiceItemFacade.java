package br.com.joocebox.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.joocebox.model.SaleType;
import br.com.joocebox.model.ServiceItem;
import br.com.joocebox.repositories.ServiceItemRepository;

@Service
@Transactional(propagation = Propagation.MANDATORY)
public class ServiceItemFacade {

	@Autowired
	private ServiceItemRepository serviceItemRepository;

	public Iterable<ServiceItem> saveServiceItem(List<ServiceItem> serviceItem) {
		return serviceItemRepository.save(serviceItem);
	}

	public void saveServiceItem(ServiceItem serviceItem) {
		serviceItemRepository.save(serviceItem);
	}
	
	public List<ServiceItem> getAllServiceItems() {
		return serviceItemRepository.findAll();
	}

	public ServiceItem getServiceItemById(Long id) {
		return serviceItemRepository.findOne(id);
	}

	public void serviceItemUpdate(Date arriveFormated, Date departureFormated,
			Date seeIn, Number price, String observations,
			Boolean isRequestedDestination, SaleType saleType,
			Long serviceItemID) {
		ServiceItem oldServiceItem = serviceItemRepository
				.findOne(serviceItemID);
		oldServiceItem.setArrivalDate(arriveFormated);
		oldServiceItem.setDepartureDate(departureFormated);
		oldServiceItem.setSeeIn(seeIn);
		oldServiceItem.setValueNegotiated(price.doubleValue());
		oldServiceItem.setNegociationObservations(observations);
		oldServiceItem.setRequestedDestination(isRequestedDestination);
		oldServiceItem.setSaleType(saleType);

		serviceItemRepository.save(oldServiceItem);
	}

}
