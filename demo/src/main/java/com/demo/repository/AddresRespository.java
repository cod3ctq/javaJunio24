package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Address;

public interface AddresRespository extends JpaRepository<Address, Integer>{

}
