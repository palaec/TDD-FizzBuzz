package com.tdd.prod;


public class FizzBuzzCode {

	public String getFizzBuzz(int i) {
		if(i%15 == 0) {
			return "FizzBuzz";
		}else if(i%5 == 0) {
			return "Buzz";
		}else if(i%3 == 0) {
			return "Fizz";
		}else {
			return i+"";
		}
		
	}

	public static void main(String[] args) {
		FizzBuzzCode fb= new FizzBuzzCode();
		for(int i=0 ;i<20; i++) {
			System.out.println(fb.getFizzBuzz(i));
		}
	}
	
}
