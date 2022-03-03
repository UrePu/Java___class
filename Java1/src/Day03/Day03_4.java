package Day03;

import java.util.Scanner;

public class Day03_4 {
	public static void main(String[] args) {
		/*제어문 : 1. if문 2. switch 문
			if : 논리검사 (true or false)
			switch : 데이터 검사
			형태 
				switch (검사대상){
					case '값': 실행문;
					case '값': 실행문;
					case '값': 실행문;
					default : 실행문
				
		*/
		int 점수 = 90;
		if(점수 == 90)System.out.println("A");
		else if (점수 == 80) System.out.println("B");
		else if (점수 == 70) System.out.println("C");
		else System.out.println("탈락");
		//
		switch( 점수 ) {
			case 90 : System.out.println("A등급");	break;
			case 80 : System.out.println("B등급"); 	break;
			case 70 : System.out.println("C등급");	break;
			default : System.out.println("탈락");		break;
		}
		
		// 예2)
		int 버튼 = 3;
		switch( 버튼 ) {
			case 1 : System.out.println(" 1층으로 이동 "); break;
			case 2 : System.out.println(" 2층으로 이동 "); break;
			case 3 : System.out.println(" 3층으로 이동 "); break;
			case 4 : System.out.println(" 4층으로 이동 "); break;
			default : System.out.println(" 정지 ");
		}
		
		// 예3)
		char 등급 = 'B';
		switch( 등급 ) {
			case 'A' : 
			case 'B' : System.out.println(" 우수 회원 "); break;
			case 'C' : 
			case 'D' : System.out.println(" 일반 회원 "); break;
			default : System.out.println(" 손님 ");
		}
		
		// 예4)
		String 직급 = "과장";
		switch( 직급 ) { // 선택조건이 때문에 .equals 사용 X
			case "부장" : System.out.println("700만원");	break;
			case "과장" : System.out.println("500만원");	break;
			default : System.out.println("300만원");
		}
		
 		// 문제1 ) 국어,영어,수학 점수를 입력받아  
			// 	평균이 90점이상이면 A등급
			//  80점이상이면 B등급 나머지 탈락
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력: "); int 문제1_1 = sc.nextInt();
		System.out.print("영어점수 입력: "); int 문제1_2 = sc.nextInt();
		System.out.print("수학점수 입력: "); int 문제1_3 = sc.nextInt();
		int sum = (문제1_1 + 문제1_2 + 문제1_3) / 3 / 10;
		
		switch(sum) {
		case 9 : System.out.println("A등급");
		case 8 : System.out.println("B등급");
		default : System.out.println("탈락");
		}
		
	}
}
