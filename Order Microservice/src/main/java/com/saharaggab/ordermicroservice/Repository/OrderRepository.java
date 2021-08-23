package com.saharaggab.ordermicroservice.Repository;

import com.saharaggab.ordermicroservice.Entity.OrderNet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<OrderNet, Long> {

}
