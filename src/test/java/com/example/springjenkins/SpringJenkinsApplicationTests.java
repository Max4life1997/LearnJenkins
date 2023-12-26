package com.example.springjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

    @Value("${test.text}")
    public String testVar;

    @Test
    void contextLoads() {
//        System.out.println("Autotest STAND: " + standName);
        System.out.println("Autotest TEST_TEXT var: " + testVar);
    }

}
