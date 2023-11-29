package vn.edu.iuh.fit.wwwlabweek07.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.wwwlabweek07.backend.pks.ProductPricePK;

@Entity
@Table(name = "ProductPrice")
@IdClass(ProductPricePK.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPrice {

  @Id
  @Column(name = "price_date_time", columnDefinition = "Timestamp")
  private LocalDateTime price_date_time;
  @Id
  @ManyToOne
  @JoinColumn(name = "product_id", nullable = false)
  private Product product;
  @Column(name = "price")
  private double price;
  @Column(name = "note")

  private String note;

}
