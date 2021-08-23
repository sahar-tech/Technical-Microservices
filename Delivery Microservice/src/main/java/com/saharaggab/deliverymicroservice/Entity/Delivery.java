package com.saharaggab.deliverymicroservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numDelivery;
    private int idSeller;
    private int idBuyer;
    private int idOrder;
    private int idAddress;
    private int duration;
    private String status;
}
