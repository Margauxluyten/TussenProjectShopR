package com.vdab.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderArticle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Double price = getPrice();

//    @OneToMany(fetch = FetchType.EAGER)
//    private Article article;

//    private Long articleId;

    @ManyToOne
    private ShoppingOrder shoppingOrder;

    private double quantity = getQuantity();

    private double totalPrice;

    public double getTotalPrice() {
        totalPrice= price * quantity;
        return totalPrice;
    }
}
