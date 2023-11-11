package vn.edu.iuh.fit.wwwlabweek07.backend.repositories;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, LocalDateTime> {

}