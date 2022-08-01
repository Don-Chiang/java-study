package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryPowTest {

    @Test
    void testBinPow() {
        assertEquals(4, BinaryPow.binPow(2, 2));
        assertEquals(256, BinaryPow.binPow(4, 4));
        assertEquals(729, BinaryPow.binPow(9, 3));
        assertEquals(262144, BinaryPow.binPow(8, 6));
    }
}
