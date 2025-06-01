package com.softwareschool.model;

import lombok.Data;


// create a rest api

@Data

public class CloudVendor {

private String vendorId;
private String vendorName;
private String vendorAddress;
private String vendorPhoneNumber;

public CloudVendor() {
    }

//constructor
    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }




}
