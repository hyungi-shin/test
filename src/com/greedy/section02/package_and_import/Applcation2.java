package com.greedy.section02.package_and_import;

import com.greedy.section01.mathod.Calculator;
/* static improt의 경우 사용하려는 static mathod를 전부 써줘야 한다. */
import static com.greedy.section01.mathod.Calculator.maxNumber0f;

public class Applcation2 {

	public static void main(String[] args) {

		/* 
		 * import : 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을
		 *             포함한 풀 클래스 이름을 사용해야 한다.
		 *             하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
		 *             그래서 패키지명을 생략하고 사용할 수 있도록 해주는 구문이 import 구문이다.
		 *             
		 * [선언위치]
		 * import 는 package 선언문과 class 선언문 사이에 작성하며
		 * 어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
		 * */ 
		/* non-static method의 경우*/
		Calculator calc = new Calculator();
		int min = calc.minNumber0f(50, 60);

		System.out.println("50과 60중 더 작은 값은 : " + min);

		/* static method의 경우*/
		int max = Calculator.maxNumber0f(50, 60);

		System.out.println("50과 60중 더 큰 값은 : " + max);

		int max2 = maxNumber0f(100, 200);

		System.out.println("100과 200중 더 큰 값은 : " + max2);

		System.out.println(Math.max(10, 20));

	}
}
