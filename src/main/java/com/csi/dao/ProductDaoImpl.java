package com.csi.dao;

import com.csi.model.Product;
import com.csi.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    ProductRepository productRepositoryImpl;


    @Override
    public Product saveData(Product product) {
        return productRepositoryImpl.save(product);
    }

    @Override
    public List<Product> saveBulkOfData(List<Product> products) {

        return productRepositoryImpl.saveAll(products);
    }

    @Override
    public Optional<Product> getDataById(Long productId) {
        return productRepositoryImpl.findById(productId);
    }

    @Override
    public List<Product> getAllData() {
        return productRepositoryImpl.findAll();
    }

    @Override
    public Product updateData(Long ProductId, Product product) {
        return productRepositoryImpl.save(product);
    }

    @Override
    public Product getDataByLaunchDate(Date productLaunchDate) {
        return productRepositoryImpl.findByProductLaunchDate(productLaunchDate);
    }

    @Override
    public Product getDataByName(String productName) {
        return productRepositoryImpl.findByProductName(productName);
    }

    @Override
    public Product getDataByCode(long productCode) {
        return productRepositoryImpl.findByProductCode(productCode);
    }

    @Override
    public void deleteDataById(long productId) {
        productRepositoryImpl.deleteById(productId);
    }

    @Override
    public List<Product> filterData(double productPrice) {
        return productRepositoryImpl.findAll().stream().filter(prod -> prod.getProductPrice() >= productPrice).collect(Collectors.toList());
    }

    @Override
    public long getProductCount() {
        return productRepositoryImpl.findAll().stream().collect(Collectors.counting());
    }

    @Override
    public void deleteAllData() {
        productRepositoryImpl.deleteAll();
    }
}
