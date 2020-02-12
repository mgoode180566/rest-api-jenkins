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
        Assertions.assertEquals(420, calculator.add(20, 20));
        Assertions.assertEquals(620, calculator.multiply(15, 4));
        Assertions.assertEquals(220, calculator.subtract(60, 40));
        Assertions.assertEquals(120, calculator.subtract(50, 40));
        Assertions.assertEquals(52, calculator.divide(100, 20));
        Assertions.assertEquals(50, calculator.divide(1000, 2));
    }

}
