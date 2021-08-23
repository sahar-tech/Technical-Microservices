package com.esaharaggab.payementmicroservice;

import com.esaharaggab.payementmicroservice.Entity.TransactionPayment;
import com.esaharaggab.payementmicroservice.Repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PayementMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayementMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(TransactionRepository transactionRepository) {
        return args -> {
            transactionRepository.save(new TransactionPayment(null, "RFD465DF5G", 1326, 5846, 1,"2021/08/02","Dhahabia","SUCCESS"));
            transactionRepository.save(new TransactionPayment(null, "65F5D6F30F", 1235, 1230, 2, "2021/03/11","Bank","FAILED"));
            transactionRepository.save(new TransactionPayment(null, "R58DR5F21G",2013, 1044, 3, "2021/06/23","Virement","CANCEL"));
            transactionRepository.findAll().forEach(System.out::println);
        };
    }
}
