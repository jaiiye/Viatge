package br.com.joocebox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.joocebox.model.CustomerService;
import br.com.joocebox.repositories.CustomerServiceRepository;

@Service
@Transactional(propagation = Propagation.MANDATORY)
public class CustomerServiceFacade {

	@Autowired
	private CustomerServiceRepository customerServiceRepository;
	
	public CustomerService saveCustomerService(CustomerService customerService){
		return customerServiceRepository.save(customerService);
	}
}