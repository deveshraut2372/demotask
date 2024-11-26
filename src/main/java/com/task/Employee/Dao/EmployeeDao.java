package com.task.Employee.Dao;

import com.task.Employee.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends  JpaRepository<Employee,Integer> {
}
