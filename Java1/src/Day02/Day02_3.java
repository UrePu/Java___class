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
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기본급을 입력하세요 :"); String value1 = sc.next();
		int num1 = Integer.parseInt(value1);
		System.out.print("수당을 입력하세요 :"); String value2 = sc.next();
		int num2 = Integer.parseInt(value2);
		
		double sum = num1 + num2 - (num1 * 0.1);
		
		System.out.println(sum);
		
		
		
		
		//문제2 : 지폐 세기
		/* 
		 * [입력조건]
		 * 		금액
		 * [ 조건 ]
		 * 		십만원 부터 배구언까지의 개수 세기
		 * [ 출력조건 ]
		 * 		예) 356789 입력시
		 * 		십만원3장
		 * 		만원 5장
		 * 		천원 6장
		 * 		백원 7개
		 */
		
		System.out.print("금액을 입력하세요 :"); String value3 = sc.next();
		int num3 = Integer.parseInt(value3);
		
		int val1 = (int)(num3 / 100000) ;
		
		num3 = num3 - val1 * 100000 ;
		
		int val2 = (int)(num3/10000);
		
		num3 = num3 - val2 * 10000 ;
		
		int val3 = (int)(num3/1000);
		
		num3 = num3 - val3 * 1000 ;
		
		int val4 = (int)(num3/100);
		
		System.out.println("10만원: " + val1 + "장\n1만원: " + val2 + "장\n1천원: " + val3 + "장\n1백원: " + "개" );
		
	}
}
