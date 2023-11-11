package vn.edu.iuh.fit.wwwlabweek07.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Order;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Order> {

}