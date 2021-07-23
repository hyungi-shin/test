package com.greedy.section01.mathod;

public class Application8 {

	public static void main(String[] args) {
		
		/* static 메소드 호출 */
		/*
		 * 메소드에 static이 있는 메소드를 static 메소드라고 하고
		 * static이 붙어있지 않는 메소드를 non-static 메소드라고 한다.
		 * */
		
		/* static 메소드를 호출하는 방법*/
		/* 클래스명.메소드명(); */
		System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10, 20));
		
		//동일한 클래스 내에 작성된 static 메소느는 클래스명 생략 가능
		System.out.println("20과 30의 합 : " + sumTwoNumbers(20, 30));
	}
	
	/**
	 * <pre>
	 * 두 수를 더한 결과를 반환하는 기능을 제공
	 * static 메소드 호출을 위한 메소드
	 * </pre>
	 * @param first 더하기를 할 첫 번째 정수
	 * @param second 더하기를 할 두 번째 정수
	 * @return 두 수를 더한 결과를 리턴
	 */
	public static int sumTwoNumbers(int first, int second) {
		return first + second;
	}
}
