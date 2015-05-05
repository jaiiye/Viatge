package br.com.joocebox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.joocebox.model.Goals;
import br.com.joocebox.model.Employee;
import br.com.joocebox.repositories.StaffRepository;

@Service
@Transactional(propagation = Propagation.MANDATORY)
public class StaffFacade {
	
	@Autowired
	private StaffRepository staffRepository;
	
	
	public List<Employee> getListOfStaff() {
		return staffRepository.findAll();
	}


	public Employee save(Employee staff) {
		return staffRepository.save(staff);
		
	}


	public Employee findEmployeeById(Long id) {
		return staffRepository.findOne(id);
		
	}


}
