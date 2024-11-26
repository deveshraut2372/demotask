package com.task.Employee.Service;

import com.task.Employee.Dao.EmployeeDao;
import com.task.Employee.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeDao employeeDao;


    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }


    public Employee getById(Integer id) {
        Optional<Employee> employee=employeeDao.findById(id);
        Employee employee1=new Employee();
        if(employee.isPresent())
        {
            employee1=employee.get();
        }else {
            throw new RuntimeException(" Employee Does Not Found !");
        }
        return employee1;
    }


    public void save(Employee employee) {
        employeeDao.save(employee);
    }


    public void deleteEmployee(Integer id) {
        employeeDao.deleteById(id);
    }


}
