package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/*
		 * java.util.Scanner 클래스를 이용한 다양한 값 입력받기
		 * 콘솔 화면에 값을 입력 받아 출력해보기
		 * */
		
		/* 1. Scanner 객체 생성 */
//		java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
		
		Scanner sc = new Scanner(System.in);
		
		/* 2. 자료형별 값 입력 받기 */
		
		/* 2-1. 문자열 입력 받기 */
		/* nextLine() : 입력 받은 값을 문자열로 변환해준다. */
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("입력하신 이름은 " + name + "입니다.");
		
		/* 2-2. 정수형 값 입력 받기 */
		/* nextInt() : 입력 받은 값을 int 형으로 반환한다.*/
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("입력하신 나이는 " + age + "세 입니다.");
		
		/* nextLong() : 입력 받은 값을 long 형으로 반환한다. */
		System.out.print("금액을 입력해주세요 : ");
		long money = sc.nextLong();
		System.out.println("입력하신 금액은 " + money + "원 입니다.");
		
		/* 2-3. 실수형 값 입력 받기 */
		/* nextFloat() : 입력 받은 값을 float 형으로 반환한다. */
		System.out.print("키를 입력해주세요 : ");
		float height = sc.nextFloat();
		System.out.println("입력하신 키는 " + height + "cm 입니다.");
		
		/* nextDouble() : 입력 받은 값을 double 형으로 반환한다. */
		System.out.print("원하는 실수를 입력해주세요 : ");
		double number = sc.nextDouble();
		System.out.println("입력하신 실수는 " + number + " 입니다.");
		
		/* 2-4. 논리형 값 입력 받기 */
		/* nextBoolean() : 입력 받은 값을 boolean형으로 반환한다. */
		System.out.print("true or false를 입력해주세요 : ");
		boolean isTrue = sc.nextBoolean();
		System.out.println("입력하신 논리값은 " + isTrue + " 입니다.");
		
		/* 2-5. 문자형 값 입력 받기 */
		/* 문자를 직접 입력 받는 기능을 제공하지는 않는다.
		 * 따라서 문자열 형태로 입력을 받고, 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야 한다.
		 * java.lang.String에 charAt(int index)를 사용한다.
		 * index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 정수를 문자형으로 변환해준다.
		 * ex) 문자열 : helloWorld  는 한번에 들어오는게 아니라 문자 하나씩 들어온다.
		 *                0123456789
		 *      입력 받은 문자열에서 문자 'w'를 가져오고 싶다. sc.charAt(5);
		 * index는 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용하는 방식이다.
		 * */
		sc.nextLine();
		System.out.print("아무 문자나 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("입력하신 문자는 " + ch + "입니다.");
		
		sc.close();
	}
}
