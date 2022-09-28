package com.csi.service;

import com.csi.model.Product;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface ProductService {

    public Product saveData(Product product);
    public List<Product> saveBulkOfData(List<Product>products);
    public Optional<Product> getDataById(Long productId);
    public  List<Product> getAllData();
    public Product updateData(Long ProductId ,Product product);
    public  Product getDataByLaunchDate(Date productLaunchDate);
    public Product getDataByName(String productName);
    public Product getDataByCode(long productCode);
    public void deleteDataById(long productId);
    public List<Product>filterData(double productPrice);
    public long getProductCount();
    public void deleteAllData();
}
