package com.core.java.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.core.java.spring.entity.Employee;

/**
 * The Interface EmployeeRepo.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-jpa-001 system </BR>
 * com.core.java.spring.repo </BR>
 * EmployeeRepo.java </BR>
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}