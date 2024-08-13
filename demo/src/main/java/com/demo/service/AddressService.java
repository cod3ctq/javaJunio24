package com.demo.service;

import java.util.List;

import com.demo.entity.Address;
import com.demo.request.AdressRequest;

public interface AddressService {

	Address guardar(Address request);
	Address actualizar(int id, Address request );
	Address buscar(int id);
	void eliminar(int id);
	List mostrar();
	
}
