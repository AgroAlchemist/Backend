package com.AgroAlchemist.BEProject.RepositoryInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgroAlchemist.BEProject.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
