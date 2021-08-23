package com.saharaggab.deliverymicroservice;

import com.saharaggab.deliverymicroservice.Entity.Delivery;
import com.saharaggab.deliverymicroservice.Repository.DeliveryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeliveryMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(DeliveryRepository DeliveryRepository) {
        return args -> {
            DeliveryRepository.save(new Delivery(null, "FD524G5FG4", 1326, 5846, 1, 107,10,"delivered"));
            DeliveryRepository.save(new Delivery(null, "E54T4F4G25", 1235, 1230, 2, 45,8,"in progress"));
            DeliveryRepository.save(new Delivery(null, "W554DF5840",2013, 1044, 3, 756,14,"waiting"));
            DeliveryRepository.findAll().forEach(System.out::println);
        };
    }
}
