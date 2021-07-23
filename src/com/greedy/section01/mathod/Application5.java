package com.greedy.section01.mathod;

public class Application5 {

	public static void main(String[] args) {
		
		// 메소드 리턴 테스트
		
		System.out.println("main() 메소드 시작됨..");
		
		Application5 app5 = new Application5();
		app5.testMethod();
		
		System.out.println("main() 메소드 종료됨..");
	}
	
	public void testMethod() {
		
		System.out.println("testMethod() 동작확인");
		// 컴파일러에 의해 자동으로 return; 구문이 추가된다.
		// return 은 가장 마지막에 작성해야한다. 마지막에 작성하지 않을 경우 컴파일 에러 발생
		
	}
}
