package com.saharaggab.deliverymicroservice.Repository;

import com.saharaggab.deliverymicroservice.Entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
