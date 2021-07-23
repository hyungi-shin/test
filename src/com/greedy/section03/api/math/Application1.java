package com.greedy.section03.api.math;

public class Application1 {

	public static void main(String[] args) {
		
		/*
		 * api란?
		 * application porgraming interface는 응용프로그램에서 사용할 수 있도록,
		 * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
		 * */
		
		/*
		 * java.lang.Math
		 * Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스
		 * */
		
		/* 절댓값 출력 */
		// 클래스의 full-name을 다 적은 경우
		System.out.println("-7의 절댓값 : " + java.lang.Math.abs(-7));
		
		/* java.lang 패키지는 별도로 import하지 않아도 사용할 수 있게 만들어 놓은
		 * 패키지이다. 자주 사용하는 패키지이기 때문에 컴파일러가 자동으로 import 코드를 추가해준다. */
		
		System.out.println("-1.25의 절댓값 : " + Math.abs(-1.25));
		
		// min과 max를 구하는 기능도 이미 제공하고 있다.
		System.out.println("10과 20 중 더 작은 것은 : " + Math.min(10, 30));
		
		// 수학적으로 많이 사용하는 값들도 이미 정의 되어있다.
		System.out.println("원주율 : " + Math.PI);
		
		// 난수를 발생시키는 random()
		System.out.println("1~20 사이의 무작위 값 : " + Math.random());
		
	}
}
