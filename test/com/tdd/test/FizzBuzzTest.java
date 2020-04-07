package com.tdd.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.tdd.prod.FizzBuzzCode;

public class FizzBuzzTest {

	FizzBuzzCode fb= new FizzBuzzCode();
	
	@Test
	public void testNumbers() {
		String value = fb.getFizzBuzz(1);
		Assert.assertEquals(value, "1");
	}
	
	@Test
	public void testFizz() {
		String value = fb.getFizzBuzz(3);
		Assert.assertEquals(value, "Fizz");
	}
	
	@Test
	public void testBuzz() {
		String value = fb.getFizzBuzz(5);
		Assert.assertEquals(value, "Buzz");
	}
	
	@Test
	public void testFizzBuzz() {
		String value = fb.getFizzBuzz(30);
		Assert.assertEquals(value, "FizzBuzz");
	}
	
	
}
