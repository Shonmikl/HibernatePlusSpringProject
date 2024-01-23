package com.example.hibernateplusspringproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString(exclude = "employees")
@Table(name = "department")
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @Column(name = "d_id")
    private int id;

    @Column(name = "d_name")
    private String name;

    @OneToMany
    @JoinColumn(name = "fk_d_id", referencedColumnName = "d_id")
    private Set<Employee> employees;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employees);
    }
}