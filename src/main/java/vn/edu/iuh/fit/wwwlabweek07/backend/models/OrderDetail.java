package vn.edu.iuh.fit.wwwlabweek07.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.wwwlabweek07.backend.pks.OrderDetailPK;

@Entity
@Table(name = "OrderDetail")
@IdClass(OrderDetailPK.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private Product product;
    @Column(name = "quantity")

    private double quantity;
    @Column(name = "price")

    private double price;
    @Column(name = "note")

    private String note;
}
