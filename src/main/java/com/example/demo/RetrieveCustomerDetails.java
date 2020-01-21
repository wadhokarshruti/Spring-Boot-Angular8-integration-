package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class RetrieveCustomerDetails {

    @RequestMapping("customerDetails/{arn}")
    public Customer getCustomerDetails(@PathVariable String arn) {
        Customer customer = new Customer();
        customer.setArn("101");
        customer.setFirstName("Fss");
        customer.setLastName("Demo");
        customer.setPhoneNumber("43111111");
        customer.setEmailAddress("fssdemo@mail.com");
        return customer;
    }

    @RequestMapping("allProviders")
    public List<String> getCardProviders(){
        String [] providers = {"VISA", "MASTERCARD","AMEX"};
        return Arrays.asList(providers);
    }
}
