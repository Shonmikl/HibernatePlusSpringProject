package com.example.hibernateplusspringproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Objects;
//POJO
@Entity
@Getter
@Setter
@ToString
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "e_id")
    private int id;

    @Column(name = "e_name")
    private String name;

    @Column(name = "e_surname")
    private String surName;

    @Column(name = "e_phone_number")
    private String phoneNumber;

    @Column(name = "e_email")
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id
                && Objects.equals(name, employee.name)
                && Objects.equals(surName, employee.surName)
                && Objects.equals(phoneNumber, employee.phoneNumber)
                && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName, phoneNumber, email);
    }
}
