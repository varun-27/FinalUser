package com.infy.UserMS.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.UserMS.entity.CartEntity;
import com.infy.UserMS.entity.CompositeKey;

@Repository
public interface CartRepository extends JpaRepository<CartEntity,CompositeKey> {
	List<CartEntity> findByBuyerId(int buyerId);
}
