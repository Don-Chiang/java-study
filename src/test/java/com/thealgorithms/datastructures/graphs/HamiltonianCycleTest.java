package com.thealgorithms.datastructures.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HamiltonianCycleTest {

	private HamiltonianCycle hamiltonianCycle = new HamiltonianCycle();

	@Test
	void testFindHamiltonianCycleShouldReturnHamiltonianCycle() {
		int[] expectedArray = {0,1,2,4,3,0};
		int[][] inputArray =  {
				{0, 1, 0, 1, 0},
				{1, 0, 1, 1, 1},
				{0, 1, 0, 0, 1},
				{1, 1, 0, 0, 1},
				{0, 1, 1, 1, 0}
		};

		assertArrayEquals(expectedArray, hamiltonianCycle.findHamiltonianCycle(inputArray));
	}

	@Test
	void testFindHamiltonianCycleShouldReturnInfinityArray() {
		int[] expectedArray = {-1,-1,-1,-1,-1,-1};

		int[][] inputArray =  {
				{0, 1, 0, 1, 0},
				{1, 0, 1, 1, 1},
				{0, 1, 0, 0, 1},
				{1, 1, 0, 0, 0},
				{0, 1, 1, 0, 0}
		};

		assertArrayEquals(expectedArray, hamiltonianCycle.findHamiltonianCycle(inputArray));
	}
}
