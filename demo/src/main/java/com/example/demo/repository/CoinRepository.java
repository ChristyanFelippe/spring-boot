package com.example.demo.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Coin;

@Repository
@EnableAutoConfiguration
public class CoinRepository {

    private static String INSERT = "insert into coin(name, price, amount, datetime) values (?,?,?,?)";
    
    private JdbcTemplate jdbcTemplate;

    public CoinRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Coin insertCoin (Coin coin) {
        Object[] attr = new Object[] {
            coin.getName(),
            coin.getPrice(),
            coin.getAmount(),
            coin.getDateTime()
        };
        jdbcTemplate.update(INSERT, attr);
        return coin;
    }
}
