package com.trent.movierentalsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trent.movierentalsystem.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
