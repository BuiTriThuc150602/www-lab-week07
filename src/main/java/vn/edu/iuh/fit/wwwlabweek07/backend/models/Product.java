package vn.edu.iuh.fit.wwwlabweek07.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.wwwlabweek07.backend.enums.ProductStatus;

@Entity
@Table(name = "Product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")

  private long product_id;
  @Column(name = "product_name")

  private String name;
  @Column(name = "unit")

  private String unit;
  @Column(name = "status")

  private ProductStatus status;
  @Column(name = "manufacturer")

  private String manufacturer;
  @Column(name = "description")

  private String description;

  @OneToMany(mappedBy = "product")
  private List<OrderDetail> orderDetails;
  @OneToMany(mappedBy = "product")
  private List<ProductImage> productImageList;
  @OneToMany(mappedBy = "product")
  private List<ProductPrice> productPrices;
}
