package com.greedy.section03.api.math;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		System.out.println("===로또 추첨 번호===");
		
		int lotto1 = (int)(Math.random() * 45);
		int lotto2 = (int)(Math.random() * 45);
		int lotto3 = (int)(Math.random() * 45);
		int lotto4 = (int)(Math.random() * 45);
		int lotto5 = (int)(Math.random() * 45);
		int lotto6 = (int)(Math.random() * 45);
		int bonus = (int)(Math.random() * 45);

		System.out.println("1번 자리 : " + lotto1);
		System.out.println("2번 자리 : " + lotto2);
		System.out.println("3번 자리 : " + lotto3);
		System.out.println("4번 자리 : " + lotto4);
		System.out.println("5번 자리 : " + lotto5);
		System.out.println("6번 자리 : " + lotto6);
		System.out.println("보너스 자리 : " + bonus);
		
	}
}
