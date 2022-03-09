package com.tcs.controller;

import com.tcs.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {
    //create a customer
    @PostMapping("/createnewcustomer")
    public  String createNewCustomer(@RequestBody Customer customer){
        return "customer created";
    }


    //list all customers
    @GetMapping("/listallcustomers")
    public List<Customer> getAllCustomers(){
        return Arrays.asList(new Customer("vamsi","001","INDIA","AP","retail"));
    }

}