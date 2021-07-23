package com.greedy.section02.package_and_import;

public class Application1 {

	public static void main(String[] args) {
		// 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없다.
		
		/* 다른 패키지의 클래스도 호출 가능 */
		com.greedy.section01.mathod.Calculator calc 
		= new com.greedy.section01.mathod.Calculator();
	
		int min = calc.minNumber0f(30, 20);
		System.out.println(min);
		
		/* static 메소드의 경우 */
		int max = com.greedy.section01.mathod.Calculator.maxNumber0f(30, 20);
		System.out.println(max);
	}
}
