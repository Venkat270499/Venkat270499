package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.CustomerClass;

public interface ICustomerRepo extends JpaRepository<CustomerClass, Integer> {

}
