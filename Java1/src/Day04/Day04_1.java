package Day04;

import java.util.Scanner;

public class Day04_1 {// c s

	public static void main(String[] args) { //m s
		
		//제어문: if, switch
		//반복문 : for, while
			//1. 초기값 2. 조건식 3. 증감식. 실행문
		//for 예1)
		
		for(int  i = 1; i <=10 ; i++) {
			System.out.println(i + " ");
		}
		//while 예1)
		int i = 1 ; 
		while (i <= 10) {
			System.out.println(i + " ");
			i++;
		}
		
		//for 예2) 1 ~ 100 누적합계
		int sum = 0;
		for (int j = 1; j <= 100 ; j++) {
			sum += j;
		}
		System.out.println("누적합계 :" + sum);
		
		//while 예2) 1~ 100 누적합계
		
		int k = 1; //초기값
		int sum2 = 0;
		while (k <= 100) { //조건식 [true 면 실행]
			sum2 += k;	//실행문
			k++;		//증감식
		}
		System.out.println("누적합계2 :" + sum2);
		
		//while 예3) 무한루프
		while(true) {
			System.out.println("무한루프");
			Scanner sc = new Scanner(System.in);
			int exit = sc.nextInt();
			if(exit ==3 ) {
				break;
			}
		}
	}//m e

}// c e
