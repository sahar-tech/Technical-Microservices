package com.saharaggab.ordermicroservice.Entity;

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
public class OrderNet {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private int idSeller;
    private int idBuyer;
    private String nameOrder;
    private String numOrder;
    private float totalOrder;
    private float totalWithoutTax;
    private float tva;

}
