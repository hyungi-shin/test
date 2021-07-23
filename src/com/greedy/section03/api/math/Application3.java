package com.greedy.section03.api.math;

import java.util.Random;

public class Application3 {
public static void main(String[] args) {
	
	/*
	 * java.util.random 클래스
	 * java.util.random 클래스의 nextInt() 메소드를 이용한 난수 발생
	 * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 정수형태로 반환한다.
	 * 
	 * 원하는 범위의 난수를 구하는 공식
	 * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값
	 * */
	
	Random random = new Random();
	
	/* 0 ~ 9 사이의 난수 발생 */
	int randomNumber1 = random.nextInt(10);
	System.out.println(" 0 ~ 9 사이의 난수 : " + randomNumber1);
	
	/* 1 ~ 10 사이의 난수 발생 */
	int randomNumber2 = random.nextInt(10) + 1;
	System.out.println(" 1 ~ 10 사이의 난수 : " + randomNumber2);
	
	/* 20 ~ 45 사이의 난수 발생 */
	int randomNumber3 = random.nextInt(26) + 20;
	System.out.println("20 ~ 45 사이의 난수 : " + randomNumber3);
	
	/* -128 ~ 127 사이의 난수 발생 */
//	int randomNumber4 = random.nextInt(256) - 128;
	int randomNumber4 = new Random().nextInt(256) -128; // <-- 재사용하지 않을 경우 이렇게 쓸 수 있음
	System.out.println("-128 ~ 127 사이의 난수 : " + randomNumber4);
}
}
