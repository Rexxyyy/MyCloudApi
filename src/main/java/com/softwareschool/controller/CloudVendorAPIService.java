package com.softwareschool.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwareschool.model.CloudVendor;





@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService {

    //method 1: Getting a value
@GetMapping("{vendorId}")
public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {

    

    return new CloudVendor( "c1", "AWS", "123 Cloud St, Cloud City", "123-456-7890");



//Create a cloudvendor details
//return new CloudVendor




    }


@PostMapping("{vendorId}")
    public String createCloudVendorDetails( @RequestBody CloudVendor cloudVendor){

        
        return "Cloud Vendor created successfully: " + cloudVendor.getVendorName();



    }

    @PutMapping("{vendorId}")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        
        return cloudVendor.getVendorName() + " updated successfully";
    }


    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId) {
        
        return "Cloud Vendor with ID: " + vendorId + " deleted successfully";
    }


    
}
