package com.suraj.fetch.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.suraj.fetch.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
