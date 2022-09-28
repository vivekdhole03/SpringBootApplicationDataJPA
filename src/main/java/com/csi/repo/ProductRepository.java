package com.csi.repo;

import com.csi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long>{

    public  Product findByProductLaunchDate(Date productLaunchDate);
    public Product findByProductCode(Long productCode);
    public Product findByProductName(String productName);





}
