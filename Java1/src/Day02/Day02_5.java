package Day02;

import java.util.Scanner;

public class Day02_5 {
	
	public static void main(String[] args) {

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
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 :"); String value3 = sc.next();
		int num3 = Integer.parseInt(value3);
		
		int val1 = (int)(num3 / 100000) ;
		
		num3 = num3 - val1 * 100000 ;
		
		int val2 = (int)(num3/10000);
		
		num3 = num3 - val2 * 10000 ;
		
		int val3 = (int)(num3/1000);
		
		num3 = num3 - val3 * 1000 ;
		
		int val4 = (int)(num3/100);
		
		System.out.println("10만원: " + val1 + "장\n1만원: " + val2 + "장\n1천원: " + val3 + "장\n1백원: " + val4+ "개" );
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
		
		System.out.println("정수 입력 : " ); int y1 = sc.nextInt();
		boolean answ = y1 % 7 == 0;
		System.out.println("정수는 7의 배수인가 : " + answ);
		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		System.out.println("정수 입력 : " ); int x1 = sc.nextInt();
		
		boolean ans1 = x1 % 2 != 0;
		System.out.println("정수는 홀수인가? : " + ans1);
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]

		System.out.println("정수 입력 : " ); int x2 = sc.nextInt();
		boolean ans2 = x1 % 7 == 0 && x1 % 2 == 0;
		System.out.println("정수는 7의 배수이자 짝수인가? : " + ans2);
		
		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		
		System.out.println("정수1 입력 : " ); int x3 = sc.nextInt();
		System.out.println("정수2 입력 : " ); int x4 = sc.nextInt();
		System.out.println("더 큰 수는 : " + (x3 > x4 ? x3 : x4));
		
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
		
		System.out.println("반지름 입력 : " ); int x5 = sc.nextInt();
		System.out.println("원의 넓이는 : " + x5 * x5 * 3.14);
		
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기

		System.out.println("앞 실수 입력 : " ); int x6 = sc.nextInt();
		System.out.println("뒷 실수 입력 : " ); int x7 = sc.nextInt();
		System.out.printf("앞 실수는 뒤의 값의 : %.1f %%  \n", (x6 / x7 * 100) );
		
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
		

		System.out.println("윗변 입력 : "); int x8 = sc.nextInt();
		System.out.println("밑변 입력 : "); int x9 = sc.nextInt();
		System.out.println("높이 입력 : "); int x10 = sc.nextInt();
		System.out.println("사다리꼴의 넓이 : " + (x8 * x9) * x10 / 2 );
		
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
		

		System.out.println("키 입력 : "); int x11 = sc.nextInt();
		System.out.println("표준 체중 : " + (x11 - 100) * 0.9 );
		
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
		

		System.out.println("키 입력 : "); int x12 = sc.nextInt();
		System.out.println("몸무게 입력 : "); int x13 = sc.nextInt();
		System.out.println("BMI 수치 : " + x13 / (x12 / 100) * (x12 / 100));
		
		//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 

		System.out.println("inch 입력 : "); int x14 = sc.nextInt();
		System.out.println("BMI 수치 : " + x14 * 2.54 + "cm");
		
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
		//소수 둘째 자리 까지 점수 출력하기
		//중간고사 반영비율 => 30 %
		//기말고사 반영비율 => 30 %
		//수행평가 반영비율 => 40 %
		
		System.out.println("중간고사 점수 입력 : "); int x15 = sc.nextInt();
		System.out.println("기말고사 점수 입력 : "); int x16 = sc.nextInt();
		System.out.println("수행평가 점수 입력 : "); int x17 = sc.nextInt();
		System.out.printf("중간고사 반영 점수 : %.2f 점, 기말고사 반영 점수 : %.2f 점, 수행평가 반영 점수 %.2f 점", (x15 * 0.3) , (x16 * 0.3) , (x17 * 0.4)) ;
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
	 		int x = 10;
			int y = x-- + 5 + --x; //23
			System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
		

		//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
			System.out.println("나이 입력 :"); int 문제15 = sc.nextInt();
			System.out.println("당신은 : " + (문제15 >= 40 ? "중년" : 문제15 >= 20 ? "성인" :  "학생") + "입니다" );
		
		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 


			System.out.println("정수 입력: "); int 문제16_1 = sc.nextInt();
			System.out.println("정수 입력 :"); int 문제16_2 = sc.nextInt();
			System.out.println("정수 입력: "); int 문제16_3= sc.nextInt();
			int 큰수 = (문제16_1 > 문제16_2 && 문제16_1 > 문제16_2 ? 문제16_1 : 문제16_2 > 문제16_1 && 문제16_2 > 문제16_3 ? 문제16_2 : 문제16_3 );
			int 작은수 = (문제16_1 < 문제16_2 && 문제16_1 < 문제16_2 ? 문제16_1 : 문제16_2 < 문제16_1 && 문제16_2 < 문제16_3 ? 문제16_2 : 문제16_3 );
			int 중간수 = (문제16_1 > 작은수 && 문제16_1 < 큰수 ? 문제16_1 : 문제16_2 > 작은수 && 문제16_2 < 큰수 ? 문제16_2 : 문제16_3);
			System.out.println(작은수 + ", " + 중간수 + ", " + 큰수);
		
		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
//			System.out.println("정수 입력: "); int 문제17_1 = sc.nextInt();
//			System.out.println("정수 입력 :"); int 문제17_2 = sc.nextInt();
//			System.out.println("정수 입력: "); int 문제17_3= sc.nextInt();
//			System.out.println("정수 입력: "); int 문제17_4= sc.nextInt();
//			int 정렬1 = (문제17_1 > 문제17_2 && 문제17_1 > 문제17_2 && 문제17_1 > 문제17_4 ? 문제17_1 : 문제17_2 > 문제17_1 && 문제17_2 > 문제17_3 && 문제17_2 > 문제17_4 ? 문제17_2 : 문제17_3 > 문제17_1 && 문제17_3 > 문제17_2 && 문제17_3 > 문제17_4 ? 문제17_3 : 문제17_4 );
//			int 정렬2 = (
//			int 정렬3 = (문제17_1 > 작은수 && 문제17_1 < 큰수 ? 문제17_1 : 문제17_2 > 작은수 && 문제17_2 < 큰수 ? 문제17_2 : 문제17_3);
//			int 정렬4 = (문제17_1 < 문제17_2 && 문제17_1 < 문제17_2 && 문제17_1 < 문제17_4 ? 문제17_1 : 문제17_2 < 문제17_1 && 문제17_2 < 문제17_3 && 문제17_2 < 문제17_4 ? 문제17_2 : 문제17_3 < 문제17_1 && 문제17_3 < 문제17_2 && 문제17_3 < 문제17_4 ? 문제17_3 : 문제17_4 );
//			System.out.println(작은수 + ", " + 중간수 + ", " + 큰수);
		
		// p. 102 확인문제
		/*
		 * 1. 3
		 * 2. 31
		 * 3. 가
		 * 4. 
		 * 		#1. pencils / students
		 * 		#2. pencils % students
		 * 5. (int)( value / 100 ) * 100
		 * 6. (lengthTop + lenghtBottom) * height / 2
		 * 7. #1 true #2 false
		 * 8.
		 */
		
	}

}
