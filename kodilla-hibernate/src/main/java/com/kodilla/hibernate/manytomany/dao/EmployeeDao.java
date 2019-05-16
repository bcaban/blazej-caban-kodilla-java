package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    List<Employee> searchByLastname(@Param("LASTNAME") String name);

    List<Employee> searchByFragmentEmployeeLastname(@Param("NAME") String name);
}
