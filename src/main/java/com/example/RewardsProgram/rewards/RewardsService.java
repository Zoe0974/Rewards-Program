package com.example.RewardsProgram.rewards;

import java.util.*;

import com.example.RewardsProgram.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomerAll() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }
}
