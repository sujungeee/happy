package com.sujung.happy.domain.inventory.entity;

import com.sujung.happy.domain.product.entity.Product;
import com.sujung.happy.domain.store.entity.Store;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventory")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@IdClass(Inventory.class)
public class Inventory {
    @Id
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int amount;
}