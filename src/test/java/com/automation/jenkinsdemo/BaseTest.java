package com.automation.jenkinsdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        System.out.println("===== Setting up test environment =====");
    }

    @AfterAll
    public static void teardown() {
        System.out.println("===== Cleaning up after tests =====");
    }
}
