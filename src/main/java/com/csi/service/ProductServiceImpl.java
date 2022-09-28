package com.csi.service;

import com.csi.dao.ProductDao;
import com.csi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDaoImpl;

    @Override
    public Product saveData(Product product) {
        return productDaoImpl.saveData(product);
    }

    @Override
    public List<Product> saveBulkOfData(List<Product> products) {
        return productDaoImpl.saveBulkOfData(products);
    }

    @Override
    public Optional<Product> getDataById(Long productId) {
        return productDaoImpl.getDataById(productId);
    }

    @Override
    public List<Product> getAllData() {
        return productDaoImpl.getAllData();
    }

    @Override
    public Product updateData(Long ProductId, Product product) {
        return productDaoImpl.updateData(ProductId ,product);
    }

    @Override
    public Product getDataByLaunchDate(Date productLaunchDate) {
        return productDaoImpl.getDataByLaunchDate(productLaunchDate);
    }

    @Override
    public Product getDataByName(String productName) {
        return productDaoImpl.getDataByName(productName);
    }

    @Override
    public Product getDataByCode(long productCode) {
        return productDaoImpl.getDataByCode(productCode);
    }

    @Override
    public void deleteDataById(long productId) {
        productDaoImpl.deleteDataById(productId);
    }

    @Override
    public List<Product> filterData(double productPrice) {
        return productDaoImpl.filterData(productPrice);
    }

    @Override
    public long getProductCount() {
        return productDaoImpl.getProductCount();
    }

    @Override
    public void deleteAllData() {
        productDaoImpl.deleteAllData();
    }
}
