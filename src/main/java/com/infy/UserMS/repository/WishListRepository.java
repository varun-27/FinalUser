package com.infy.UserMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.UserMS.entity.WishListEntity;
import com.infy.UserMS.entity.WishlistCompositeKey;

@Repository
public interface WishListRepository extends JpaRepository<WishListEntity,WishlistCompositeKey>{
	

}
