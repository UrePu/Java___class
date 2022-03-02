package Day02;

import java.util.Scanner;

public class Day02_3 {
	public static void main(String[] args) {
		//문제 1 : 급여계상
		/*
		 * [ 입력조건 ]
		 * 		기본급 , 수당
		 * 	[조건]
		 * 		실수령액 = 기본급 + 수당 - 세금[기본급 10%]
		 * 	[출력조건]
		 * 		실수령액 출력
		 */
		
		//* 입력 -> 저장 -> 계산 -> 출력
		// 1. 입력 객체 만든다.
		// 2. 입력받은 값을 변수에 저장한다. [ 입력객체는 입력 받을대마다 기존 데이터가 사라진다.]
		// 3. 변수를 연산 한다.
		// 4. 출력한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기본급을 입력하세요 :"); int value1 = sc.nextInt();
		System.out.print("수당을 입력하세요 :"); int value2 = sc.nextInt();

		
		double sum = value1 + value2 - (value1 * 0.1);
		
		System.out.println("회원님의 실 수령액 : " + sum);
		
		
		
		
	}
}
