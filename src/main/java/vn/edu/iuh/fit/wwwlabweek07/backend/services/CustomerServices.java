package vn.edu.iuh.fit.wwwlabweek07.backend.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Customer;
import vn.edu.iuh.fit.wwwlabweek07.backend.repositories.CustomerRepository;

@Service
public class CustomerServices {

  @Autowired
  private CustomerRepository customerRepository;

  public boolean checkCustomer(String email, String password) {
    return customerRepository.existsByEmailAndPassword(email, password);
  }

  public Optional<Customer> findUserByLogin(String email, String pwd) {
    return customerRepository.findByEmailAndPassword(email,pwd);
  }

}
