package com.greedy.section01.mathod;

public class Application7 {

	public static void main(String[] args) {
	
		/*
		 * 숫자 두 개를 매개변수로 입력받아 연산하는 메소드
		 * 사칙연산별로 추가해서 호출
		 * */
		
		int first =20;
		int second = 10;
		
		Application7 app7 = new Application7();
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
		System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
		System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumbers(first, second));
	}
	
	// 반환형 int , plusTwoNumbers(매개변수 두개), minusTwoNumbers(매개변수 두개)
	//                multipleTwoNumbers(매개변수 두개), divideTwoNumbers(매개변수 두개)
	/**
	 * <pre>
	 * 매개변수로 전달받은 두 수를 더하여 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 더하기를 할 첫 번째 정수
	 * @param second 더하기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 더한 결과
	 */
	public int plusTwoNumbers(int first, int second) {
		
		return first + second;
	}
	/**
	 * <pre>
	 * 매개변수로 전달받은 두 수를 빼 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 빼기를 할 첫 번째 정수
	 * @param second 빼기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 뺀 결과
	 */
	public int minusTwoNumbers(int first, int second) {
		return first - second;
	}
	/**
	 * <pre>
	 * 매개변수로 전달받은 두 수를 곱하여 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 곱하기를 할 첫 번째 정수
	 * @param second 곱하기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 곱한 결과
	 */
	public int multipleTwoNumbers(int first, int second) {
		return first * second;
	}
	/**
	 * <pre>
	 * 매개변수로 전달받은 두 수를 나누기하여 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 나누기를 할 첫 번째 정수
	 * @param second 나누기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 나눈 결과
	 */
	public int divideTwoNumbers(int first, int second) {
		return first / second;
	}
}
