package com.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.junitDemo.Calculator;

public class CalculatorTest {

	Calculator cal = new Calculator();

	@BeforeAll
	// equals to @before class
	public static void beforeall() {
		System.out.println("beforeall");
	}

	@AfterAll
	// equals to @after class
	public static void afterall() {
		System.out.println("afterall");
	}

	@Test
	@Disabled
	// equals to @ignore
	public void test1() {
		System.out.println("test1");
		int actual = cal.addition(10, 10);
		int expected = -20;
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	@BeforeEach
	// equals to @before
	public  void beforeEach() {
		System.out.println("beforeEach");
	}
	
	@AfterEach
	// equals to @after
	public  void afteEach() {
		System.out.println("aftereach");
	}


}
