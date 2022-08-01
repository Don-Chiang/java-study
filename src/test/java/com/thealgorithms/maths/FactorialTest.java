package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactorialTest {

    @Test
    public void test() {
        Factorial fact = new Factorial();
        assertEquals(120,fact.factorial(5));
 }

}