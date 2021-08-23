package com.esaharaggab.payementmicroservice.Repository;

import com.esaharaggab.payementmicroservice.Entity.TransactionPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionPayment,Long> {
}
