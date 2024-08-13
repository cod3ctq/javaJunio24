package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Address;
import com.demo.logic.AddressLogic;
import com.demo.repository.AddresRespository;

@SpringBootTest
class DemoApplicationTests {

	 @Mock
	    private AddresRespository repo;

	    @InjectMocks
	    private AddressLogic logic;

	    @Test
	    public void testGuardar() {
	        Address address = new Address();
	        address.setTitle("Title");
	        address.setDescriptio("Descriptio");
	        address.setsCountryISOCode("ISO");
	        address.setCountryName("Country");

	        when(repo.save(any(Address.class))).thenReturn(address);

	        Address result = logic.guardar(address);
	        assertEquals("Title", result.getTitle());
	    }

	    @Test
	    public void testActualizar() {
	    	Address address = new Address();
	    	address.setId(1);
	    	address.setTitle("Title");
	        address.setDescriptio("Descriptio");
	        address.setsCountryISOCode("ISO");
	        address.setCountryName("Country");
	        
	        when(repo.findById(1)).thenReturn(Optional.of(address));
	        when(repo.save(any(Address.class))).thenReturn(address);
	        
	        Address addressUpdate = new Address();
	        addressUpdate.setTitle("nuevo Title");
	        addressUpdate.setDescriptio("new Descriptio");
	        addressUpdate.setsCountryISOCode("new");
	        addressUpdate.setCountryName("new Country");
	        
	        Address resultado = logic.actualizar(1, addressUpdate);
	        
	        assertNotNull(resultado);
	        assertEquals("nuevo Title", resultado.getTitle());
	        assertEquals("new Descriptio", resultado.getDescriptio());
	        assertEquals("new", resultado.getsCountryISOCode());
	        assertEquals("new Country", resultado.getCountryName());
	        
	    }
	    
	    @Test
	    public void testBuscar() {
	    	Address address =  new Address();
	    	
	    	address.setId(1);
	    	address.setTitle("Title");
	    	
	    	when(repo.findById(1)).thenReturn(Optional.of(address));
	    	
	    	Address resultado = logic.buscar(1);
	    	assertNotNull(resultado);
	        assertEquals("Title", resultado.getTitle());
	    }
	    
	    @Test
	    public void testEliminar() {
	    	Address address = new Address();
	    	address.setId(1);
	    	address.setTitle("Title");
	    	
	    	when(repo.findById(1)).thenReturn(Optional.of(address));
	    	doNothing().when(repo).deleteById(1);
	    	
	    	logic.eliminar(1);
	    	
	    	verify(repo, times(1)).deleteById(1);;
	    	    	
	    }
	    @Test
	    public void testMostrar() {
	    	Address address = new Address();
	    	address.setId(1);
	    	address.setTitle("Title");
	    	
	    	Address address2 = new Address();
	    	address2.setId(2);
	    	address2.setTitle("Title2");
	    	
	    	List<Address> addresses = Arrays.asList(address,address2);
	    	
	    	when(repo.findAll()).thenReturn(addresses);
	    	
	    	List<Address> resultado = logic.mostrar();
	    	assertEquals(2, resultado.size());
	    	assertEquals("Title", resultado.get(0).getTitle());
	    	assertEquals("Title2", resultado.get(1).getTitle());
	    }
	    
	    
	    
}
