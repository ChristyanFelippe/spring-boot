package com.example.demo.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coin {
    
    private int id;
    private String name;
    private BigDecimal price;
    private BigDecimal amount;
    private Timestamp dateTime;


}
