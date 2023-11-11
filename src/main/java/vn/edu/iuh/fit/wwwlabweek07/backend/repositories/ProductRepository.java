package vn.edu.iuh.fit.wwwlabweek07.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}