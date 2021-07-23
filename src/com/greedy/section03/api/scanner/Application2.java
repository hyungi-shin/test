package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 
		 * Scanner의 nextLine() 과 next()
		 * nextLine() : 공백을 포함한 한 줄을 입력을 위한 개형문자 전까지 읽어서 문자열로 반환한다.
		 *                  (공백문자 포함)
		 * next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환한다.(공백문자 불포함)
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력
		// nextLine()
		System.out.print("인사말을 입력해주세요 : ");
		String greeting1 = sc.nextLine(); // 안녕하세요 반갑습니다
		
	    System.out.println(greeting1);
	    
	    // next
	    System.out.print("인사말을 입력해주세요 : ");
	    String greeting2 = sc.next(); // 안녕하세요 반갑습니다
	    
	    System.out.println(greeting2);
	    
	    sc.close();
	}
}
