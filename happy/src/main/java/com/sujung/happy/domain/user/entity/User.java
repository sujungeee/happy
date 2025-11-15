package com.sujung.happy.domain.user.entity;

import com.sujung.happy.domain.cart.entity.Cart;
import com.sujung.happy.domain.order.entity.Orders;
import com.sujung.happy.domain.review.entity.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private int point;

    private int cash;

    @OneToMany(mappedBy = "user")
    private List<Orders> orders = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList<>();

    @OneToOne(mappedBy = "user")
    private Cart cart;
}