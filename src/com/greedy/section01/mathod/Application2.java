package com.greedy.section01.mathod;

public class Application2 {

	public static void main(String[] args) {
		
		System.out.println("main() 시작됨..");
		
		Application2 app2 = new Application2();
		app2.mathodA();
		app2.mathodB();
        app2.mathodC();
        
		System.out.println("main() 종료됨..");
	}
	
	public void mathodA() {
		System.out.println("mathodA() 호출됨..");
		
		System.out.println("mathodA() 종료됨..");
	}
	
	public void mathodB() {
		System.out.println("mathodB() 호출됨..");
		
		System.out.println("mathodB() 종료됨..");
	}
	
	public void mathodC() {
		System.out.println("mathodC() 호출됨..");
		
		System.out.println("mathodC() 종료됨..");
	}
}
