package com.example.livewell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionTest implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            jdbcTemplate.execute("SELECT 1");
            System.out.println("Database connection successful!");
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
