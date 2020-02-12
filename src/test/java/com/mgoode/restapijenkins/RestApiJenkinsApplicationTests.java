package com.mgoode.restapijenkins;

import com.mgoode.restapijenkins.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiJenkinsApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void testCalculator() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(40, calculator.add(20, 20));
        Assertions.assertEquals(60, calculator.multiply(15, 4));
        Assertions.assertEquals(20, calculator.subtract(60, 40));
    }

}
