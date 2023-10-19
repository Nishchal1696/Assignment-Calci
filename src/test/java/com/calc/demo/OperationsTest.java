package com.calc.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calc.demo.operations.Operartions;


public class OperationsTest {
	
	Operartions operartions;
	
	@BeforeEach
	void setup() {
		operartions=new Operartions();
	}

	@Test
	public void testAddition() {
		assertEquals(14, operartions.doAddition(7, 7));
	}
	
	@Test
	public void testSubstarct() {
		assertEquals(3, operartions.doSubstract(7, 4));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(21, operartions.doMultiply(7, 3));
	}
	
	@Test
	public void testDivide() {
		assertEquals(5, operartions.doDivide(15, 3));
	}
	
	@Test
	public void testSquare() {
		assertEquals(25, operartions.doSquare(5));
	}
	
	@Test
	public void testSquareRoot() {
		assertEquals(5, operartions.doSquareRoot(25));
	}
	
	@Test
	public void testFactorial() {
		assertEquals(6,operartions.doFactorial(3));
	}
}
