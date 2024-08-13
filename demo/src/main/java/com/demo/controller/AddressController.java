package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Address;
import com.demo.logic.AddressLogic;

@RestController
@RequestMapping("rest/address")
public class AddressController {
	
	@Autowired
	AddressLogic logic;
	
	@PostMapping
	public ResponseEntity<Address> guardar (@RequestBody Address address){
		Address add = logic.guardar(address);
		return new ResponseEntity<Address>(add,HttpStatus.OK);
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<Address> actualizar(@PathVariable int id, @RequestBody Address address){
		Address add = logic.actualizar(id, address);
		return new ResponseEntity<Address>(add,HttpStatus.OK);
	}
	@GetMapping("/list")
	public ResponseEntity<List<Address>> mostrar(){
		return new ResponseEntity<>(logic.mostrar(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Address> buscar(@PathVariable int id){
		Address add = logic.buscar(id);
		return new ResponseEntity<Address>(add, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Address> eliminar(@PathVariable int id){
		logic.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
	}

}
