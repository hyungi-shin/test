package com.greedy.section01.mathod;

public class Application1 {

	public static void main(String[] args) {
		
		/* 
		 * 메소드란?
		 * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합
		 * */
		System.out.println("main() 시작됨..");
		
		// 작성한 메소드를 호출하는 부분 (main용 코드)
		// 클래스명 사용할이름 = new 클래스명();
		Application1 app1 = new Application1();
		
		// 사용할이름.메소드명();
		app1.mathodA(); // 줄 숫자에 더블클릭을하면 디버깅 브레이크포인트 생성
		
		System.out.println("main() 종료됨..");
	}
	
	// 호출 확인을 위한 메소드
	public void mathodA() {
		
		System.out.println("mathodA() 호출함..");
		
		// 두번째 메소드부터는 아래 코드로 호출
		mathodB();
		
		System.out.println("mathodA() 종료됨..");
		
	}
	
	public void mathodB() {
		
		System.out.println("mathodB() 호출함..");
		
		System.out.println("mathodB() 종료됨..");
		
	}
}
