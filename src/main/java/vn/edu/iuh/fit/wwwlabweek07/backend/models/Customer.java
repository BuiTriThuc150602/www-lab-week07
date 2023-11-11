package vn.edu.iuh.fit.wwwlabweek07.backend.models;

import jakarta.persistence.*;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cust_id")
  private long cust_id;
  @Column(name = "cust_name")
  private String cust_name;
  @Column(name = "email")

  private String email;
  @Column(name = "phone")

  private String Phone;
  @Column(name = "address")

  private String address;
  @OneToMany(mappedBy = "customer")
  private List<Order> order;
}
