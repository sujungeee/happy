package com.sujung.happy.domain.inventory.entity;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@EqualsAndHashCode
public class InventoryId implements Serializable {
    private Long storeId;

    private Long productId;
}