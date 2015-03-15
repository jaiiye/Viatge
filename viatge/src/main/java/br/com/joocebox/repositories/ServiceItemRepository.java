package br.com.joocebox.repositories;

import java.util.List;

import br.com.joocebox.model.ServiceItem;

public interface ServiceItemRepository extends BaseRepository<ServiceItem, Long>{
	
	List<ServiceItem> findAll();

}