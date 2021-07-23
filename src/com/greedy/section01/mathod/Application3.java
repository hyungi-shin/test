package com.greedy.section01.mathod;

public class Application3 {
	
	public static void main(String[] args) {
		
		/*
		 * 전달인자(argument)의 매개변수(parameter)를 이용한 메소드 호출
		 * =====상수 선언 브레이스? 클래스?
		 * 변수의 종류
		 * 1. 지역변수 (ex. int inum;)
		 * 2. 매개변수 (ex. println(String x))
		 * 3. 전역변수(필드)
		 * 4. 클래스(static)변수
		 * 
		 * 지역변수는 선언한 메소드 블럭 내부에서만 사용 가능
		 * 다른 메소드 간 서로 공유해야하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해 값 전달 가능
		 * 이 때 전달하는 값을 전달인자(argument)라고 부르고,
		 * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
		 * */
		Application3 app3 = new Application3();
		
		app3.testMethod(20);
		
		/* 2. 변수에 저장한 값을 전달 */
		int age = 20;
		app3.testMethod(age);
		
		/* 2-1. 자동형변환을 이용하여 값을 전달할 수 있다.*/
		byte byteAge = 10;
		app3.testMethod(byteAge);
		
		/* 2-2. 강제형변환을 이용해서 값을 전달할 수 있다 */
		long longAge = 80;
		app3.testMethod((int)longAge);
		
		/* 2-3. 연산 결과를 이용해서 값을 전달할 수 있다. */
		app3.testMethod(age * 3);
		
	}

	
	
	
	public void testMethod(int age) {
		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}
}
