package com.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestItems {
    Main main = new Main();
    @Test
    public void test_printHelloWorld() {
        String expected = "Hello World!";
        String actual = main.printHelloWorld(); //remember that main is invoking method from main class

        assertEquals(expected, actual);
    }







}
