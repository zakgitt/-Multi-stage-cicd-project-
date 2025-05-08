package com.example.bankapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // 👈 Tells Spring to use application-test.properties
class BankappApplicationTests {

    @Test
    void contextLoads() {
    }

}
