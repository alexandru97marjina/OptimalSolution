package com.marjina.csvreader.config;

import com.marjina.csvreader.entity.Customer;
import com.marjina.csvreader.repository.CustomerRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Customer> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void write(List<? extends Customer> customers) throws Exception {

        System.out.println("Data Saved for Customer: " + customers);
        customerRepository.save(customers);
    }
}