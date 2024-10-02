package com.finaxys.technicaltest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StockTrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private Integer userId;
    private String symbol;
    private Integer shares;
    private Integer price;
    private Long timestamp;

    public StockTrade() {

    }

    public StockTrade(Integer id, String type, Integer userId, String symbol, Integer shares, Integer price, Long timestamp) {
        this.id = id;
        this.type = type;
        this.userId = userId;
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
        this.timestamp = timestamp;
    }

    public StockTrade(String type, Integer userId, String symbol, Integer shares, Integer price, Long timestamp) {
        this.type = type;
        this.userId = userId;
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
        this.timestamp = timestamp;
    }
}
