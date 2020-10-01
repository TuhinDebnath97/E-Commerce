package com.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entity.*;

@Repository
public interface CartRepository extends JpaRepository<EcomCart, Long> {
	List<EcomCart> findByUserId(String userId);
}
