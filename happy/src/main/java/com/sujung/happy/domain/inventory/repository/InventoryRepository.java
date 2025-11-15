package com.sujung.happy.domain.inventory.repository;

import com.sujung.happy.domain.inventory.entity.Inventory;
import com.sujung.happy.domain.inventory.entity.InventoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, InventoryId> {
}