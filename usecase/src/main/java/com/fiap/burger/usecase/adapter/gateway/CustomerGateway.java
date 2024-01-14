package com.fiap.burger.usecase.adapter.gateway;

import com.fiap.burger.entity.customer.Customer;

public interface CustomerGateway {
    Customer findById(Long id);

    Customer save(Customer customer);

    Customer findByCpf(String cpf);
}
