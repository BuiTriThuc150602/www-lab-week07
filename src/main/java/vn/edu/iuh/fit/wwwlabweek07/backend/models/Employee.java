package vn.edu.iuh.fit.wwwlabweek07.backend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.wwwlabweek07.backend.enums.EmployeeStatus;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
@NamedQueries(
    @NamedQuery(name = "Employee.findAll", query = "select e from Employee e where e.status = :status1 or e.status = :status2")
)
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "emp_id")
  private Long id;
  @Column(name = "full_name", length = 150, nullable = false)
  private String fullName;
  @Column(name = "dob", nullable = false)
  private LocalDateTime dob;
  @Column(name = "email", length = 150)
  private String email;
  @Column(name = "phone", length = 15, nullable = false)
  private String phone;
  @Column(name = "address", length = 150, nullable = false)
  private String address;
  @Column(name = "status", nullable = false)
  private EmployeeStatus status;
  @OneToMany(mappedBy = "employee")
  private List<Order> lstOrders;

}
