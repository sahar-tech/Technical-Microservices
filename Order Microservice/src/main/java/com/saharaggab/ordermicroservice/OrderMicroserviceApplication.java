package com.saharaggab.ordermicroservice;

import com.saharaggab.ordermicroservice.Entity.OrderNet;
import com.saharaggab.ordermicroservice.Repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class OrderMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(OrderRepository OrderRepository) {
        return args -> {
            OrderRepository.save(new OrderNet(null,  1326, 5846,"Computers order", "DRG5R854DF84", 195000, 190000, 5000));
            OrderRepository.save(new OrderNet(null, 1235, 1230, "Cloths order", "KL540854KJ51", 25000, 20000, 5000));
            OrderRepository.save(new OrderNet(null,  2013, 1044,"Food order", "J012K625J280", 15000, 10000, 5000));
            OrderRepository.findAll().forEach(System.out::println);
    };
    }
}