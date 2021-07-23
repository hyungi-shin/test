package com.greedy.section01.mathod;

public class Test {

	public static void main(String[] args) {
		/* 반환형 String ,
		 * 두 수를 더한 결과 : 30
		 * 두 수를 뺀 결과 : 10
		 * 두 수를 곱한 결과 : 200
		 * 두 수를 나눈 결과 : 2
		 *  위 결과값 나타내기
		 * */ 
		int first = 20;
		int second = 10;
		
		Test appt = new Test();
		appt.plus(first, second);
		appt.minus(first, second);
		appt.multiple(first, second);
		appt.divide(first, second);
	
		System.out.println(appt.plus(first, second));
		System.out.println(appt.minus(first, second));
		System.out.println(appt.multiple(first, second));
		System.out.println(appt.divide(first, second));
  }
	
	public String plus(int first, int second) {
		int result1 = first + second;
		return "두 수를 더한 결과 : " + result1;
	}
	
	public String minus(int first, int second) {
		int result2 = first - second;
		return "두 수를 뺀 결과 : " + result2;
	}
	
	public String multiple(int first, int second) {
		return "두 수를 곱한 결과 : " + first * second;
	}
	
	public String divide(int first, int second) {
		return "두 수를 나눈 결과 : " + first / second;
	}
}