package vn.edu.iuh.fit.wwwlabweek07.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}