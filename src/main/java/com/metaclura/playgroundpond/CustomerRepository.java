package com.metaclura.playgroundpond;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.metaclura.playgroundpond.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    List<Customer> findByLastName(String lastName);
}