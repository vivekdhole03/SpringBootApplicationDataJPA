package com.csi.controller;


import com.csi.model.Product;
import com.csi.service.ProductService;
import com.csi.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/V1")
public class ProductController {

    @Autowired
    ProductService productServiceImpl;

    @GetMapping("/getdata")
    public ResponseEntity<List<Product>> getAllData() {
        return ResponseEntity.ok(productServiceImpl.getAllData());
    }

    @GetMapping("/getdatabyid/{productId}")
    public java.util.Optional<Product> productgetdatabyId(@PathVariable long productId) {
        return productServiceImpl.getDataById(productId);
    }

    @GetMapping("/getdatabyname/{productName}")
    public ResponseEntity<Product> getdatabyname(@PathVariable String productName) {
        return ResponseEntity.ok(productServiceImpl.getDataByName(productName));
    }

    @GetMapping("/getdtabylaunchdate/{productLaunchDate}")
    public ResponseEntity<Product> getdtabylaunchdate(@PathVariable @DateTimeFormat(pattern = "dd-mm-yyyy") Date productLaunchDate) {

        return ResponseEntity.ok(productServiceImpl.getDataByLaunchDate(productLaunchDate));

    }

    @GetMapping("/getdatabycode/{productCode}")

    public ResponseEntity<Product> getdatabyCode(@PathVariable long productCode) {
        return ResponseEntity.ok(productServiceImpl.getDataByCode(productCode));
    }


    @GetMapping("/filterdata/{productPrice}")
    public ResponseEntity<List<Product>> filter(@PathVariable double productPrice) {
        return ResponseEntity.ok(productServiceImpl.filterData(productPrice));
    }


    @GetMapping("/getproductcount")
    public ResponseEntity<Long> getcount() {
        return ResponseEntity.ok(productServiceImpl.getProductCount());

    }

    @PostMapping("/savedata")

    public ResponseEntity<Product> saveData(@RequestBody Product product) {
        return ResponseEntity.ok(productServiceImpl.saveData(product));

    }

    @PostMapping("/savebulkofdata")
    public ResponseEntity<List<Product>> saveBulkOfData(@RequestBody List<Product> products) {
        return ResponseEntity.ok(productServiceImpl.saveBulkOfData(products));
    }


    @PutMapping("/updatedata/{productId}")

    public ResponseEntity<Product> updateData(@PathVariable long productId, Product product) {
        return ResponseEntity.ok(productServiceImpl.updateData(productId, product));
    }

    @DeleteMapping("/deletedatabyid/{productId}")
    public ResponseEntity<String> deleteDataById(@PathVariable long productId) {

        productServiceImpl.deleteDataById(productId);
        return ResponseEntity.ok("Data Deleted Successfully");

    }

    @DeleteMapping("/deletdata")
    public ResponseEntity<String> deleteAllData() {
        productServiceImpl.deleteAllData();
        return ResponseEntity.ok("All Data Deleted Successfully");
    }
}
