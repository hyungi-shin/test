package com.greedy.section03.api.math;

public class Application2 {

	public static void main(String[] args) {
		
		/* 
		 * 난수의 활용 
		 * Math.random() 을 이용해 발생한 난수는 0.0 부터 1.0 전까지의 실수 범위의 난수값을 반환한다.
		 * */
		
		/*
		 * 원하는 범위의 난수를 구하는 공식
		 * (int) (math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최솟값
		 * */
		/* 0 ~ 9 까지의 난수 발생 */
		int random1 = (int) (Math.random() * 10);
		System.out.println("0 ~ 9 사이의 난수 : " + random1);
		
//		0.0 <= (Math.random * 10) < 1.0 
		
		/* 1 ~ 10 까지의 난수 발생 */
		int random2 = (int)(Math.random() * 10) + 1;
		System.out.println("1 ~ 10 사이의 난수 : " + random2);
		
		/* 10 ~ 15 까지의 난수 발생 */
		int random3 = (int)(Math.random() * 6) + 10;
		System.out.println("10 ~ 15 사이의 난수 : " + random3);
		
		/* -128 ~ 127 까지의 난수 발생 */
		int random4 = (int)(Math.random() * 256) - 128;
		System.out.println("-128 ~ 127 사이의 난수 : " + random4);
	}
}
