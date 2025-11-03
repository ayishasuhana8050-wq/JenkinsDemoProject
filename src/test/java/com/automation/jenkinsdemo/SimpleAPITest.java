package com.automation.jenkinsdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleAPITest extends BaseTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 7;
        int result = a + b;
        System.out.println("Running addition test...");
        Assertions.assertEquals(12, result, "Addition result should be 12");
    }

    @Test
    public void testSubtraction() {
        int x = 10;
        int y = 4;
        int result = x - y;
        System.out.println("Running subtraction test...");
        Assertions.assertEquals(6, result, "Subtraction result should be 6");
    }
}
