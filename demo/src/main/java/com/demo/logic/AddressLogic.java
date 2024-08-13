package com.demo.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Address;
import com.demo.repository.AddresRespository;
import com.demo.service.AddressService;



@Service
public class AddressLogic implements AddressService{

	@Autowired
	AddresRespository repo;
	
	@Override
	public Address guardar(Address request) {
		if (request ==null) {
			throw new IllegalArgumentException("no puede tener valores null");
		}
		return repo.save(request);
	}

	@Override
	public Address actualizar(int id, Address request) {
		Address address = repo.findById(id).orElse(null);
		
		if (address != null) {
			address.setTitle(request.getTitle());
			address.setDescriptio(request.getDescriptio());
			address.setsCountryISOCode(request.getsCountryISOCode());
			address.setCountryName(request.getCountryName());
			repo.save(address);
		}
		return address;
	}

	@Override
	public Address buscar(int id) {
		Address address = repo.findById(id).orElse(null);
		return address;
	}

	

	@Override
	public void eliminar(int id) {	
			repo.deleteById(id);
	}

	
	@Override
	public List mostrar() {
		
		return repo.findAll();
	}

	
}
