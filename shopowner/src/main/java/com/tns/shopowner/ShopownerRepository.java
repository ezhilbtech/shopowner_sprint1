package com.tns.shopowner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopownerRepository extends JpaRepository<Shopowner, Long> {
}
