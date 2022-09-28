package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue

    private long productId;
    private String productName;
    private double productPrice;
    private long productCode;

    @JsonFormat(pattern = "dd-mm-yyyy", timezone = "Asia/Kolkata")
    private Date productLaunchDate;
    private double productDiscount;
    private String productDescription;


}
