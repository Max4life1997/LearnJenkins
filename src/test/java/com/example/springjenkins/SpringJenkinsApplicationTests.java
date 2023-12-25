package com.example.springjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {


    @Value("${test.stand}")
    public String standName;

    @Test
    void contextLoads() {
        System.out.println("HI " + standName);
    }

}
