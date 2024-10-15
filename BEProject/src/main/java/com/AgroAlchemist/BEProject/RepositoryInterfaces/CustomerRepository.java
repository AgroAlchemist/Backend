package com.AgroAlchemist.BEProject.RepositoryInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgroAlchemist.BEProject.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}