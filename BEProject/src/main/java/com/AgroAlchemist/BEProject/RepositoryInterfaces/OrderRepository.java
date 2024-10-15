package com.AgroAlchemist.BEProject.RepositoryInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgroAlchemist.BEProject.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}