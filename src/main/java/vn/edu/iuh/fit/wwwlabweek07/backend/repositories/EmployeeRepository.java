package vn.edu.iuh.fit.wwwlabweek07.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}