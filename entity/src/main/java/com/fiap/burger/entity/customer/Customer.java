package com.fiap.burger.entity.customer;

import com.fiap.burger.entity.common.AuditableEntity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Customer extends AuditableEntity {

    private String id;
    private String cpf;
    private String email;
    private String name;

    public Customer(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(hashCode(), customer.hashCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            getId(),
            getCpf(),
            getEmail(),
            getName(),
            getCreatedAt(),
            getModifiedAt(),
            getDeletedAt()
        );
    }

    public String getId() {
        return id;
    }
    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Customer(String id, String cpf, String email, String name) {
        this.id = id;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
    }

    public Customer(String cpf, String email, String name) {
        this.cpf = cpf;
        this.email = email;
        this.name = name;
    }

    public Customer(
        String id,
        String cpf,
        String email,
        String name,
        LocalDateTime createdAt,
        LocalDateTime modifiedAt,
        LocalDateTime deletedAt
    ) {
        this.id = id;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "cpf='" + cpf + '\'' +
            ", email='" + email + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
