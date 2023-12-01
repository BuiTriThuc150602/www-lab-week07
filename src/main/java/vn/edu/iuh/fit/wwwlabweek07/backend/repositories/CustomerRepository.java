package vn.edu.iuh.fit.wwwlabweek07.backend.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  Optional<Customer> findByEmailAndPassword(String email, String password);

  boolean existsByEmailAndPassword(
      String email, String password);

}