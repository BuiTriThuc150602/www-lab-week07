package vn.edu.iuh.fit.wwwlabweek07.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ProductImage")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "image_id")
  private long image_id;
  @ManyToOne
  @JoinColumn(name = "product_id",nullable = false)
  private Product product;
  @Column(name = "path")

  private String path;
  @Column(name = "alternative")

  private String alternative;

}
