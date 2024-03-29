package com.fiap.burger.usecase.adapter.gateway;

import com.fiap.burger.entity.customer.Customer;

public interface CustomerGateway {
    Customer findById(String id);

    Customer save(Customer customer);

    Customer findByCpf(String cpf);

    void deleteById(String id);
}
