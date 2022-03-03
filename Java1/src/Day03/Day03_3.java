package Day03;

import java.util.Scanner;

public class Day03_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제6
				// 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 
				
		System.out.print("점수 입력: "); int score = sc.nextInt();
		
		if (score >= 90) System.out.println("합격");
		else System.out.println("불합격");
		
		//문제7
				// 점수를 입력받아 점수가 90점 이상이면 A등급
				//				점수가 80점 이상이면 B등급
				//				점수가 70점 이상이면 C등급
				//				그외 재시험
		
		System.out.print("점수 입력: "); int score2 = sc.nextInt();
		
		if (score2 >= 90) System.out.println("A등급");
		else if(score2 >= 80) System.out.println("B등급");
		else if(score2 >= 70) System.out.println("C등급");
		else System.out.println("재시험");
		
		//문제8 로그인페이지
				// [ 입력 ] : 아이디와 비밀번호를 입력받기
				// [ 조건 ] : 회원아이디가 admin 이고 
				//           비밀번호가 1234 일 경우에는 
				//          로그인 성공 아니면 로그인 실패 출력
		System.out.print("아이디 입력: "); String id = sc.next();
		System.out.print("비밀번호 입력: "); String pw = sc.next();
		
		if(id.equals("admin")) {
			if(pw.equals("1234"))System.out.println("로그인 성공");
			else System.out.println("로그인 실패");
		}else System.out.println("로그인 실패");
		
		/* 문제9
		 * [입력] : 국어, 영어, 수학 입력받기
		 * [조건]
		 * 		평균이 90점 이상이면서 
		 * 		국어점수 100점이면 국어우수출력
		 * 		영어점수 100점이면 영어 우수 출력
		 * 		수학점수 100점이면 수학 우수 출력 
		 */
		
		System.out.print("국어점수 입력: "); int k = sc.nextInt();
		System.out.print("영어점수 입력: "); int e = sc.nextInt();
		System.out.print("수학점수 입력: "); int m = sc.nextInt();
		
		double sum = (k + e + m )/3;
		
		if (sum >= 90) {
			if ( k == 100 ) System.out.println("국어 우수");
			if ( e == 100 ) System.out.println("영어 우수");
			if ( m == 100 ) System.out.println("수학 우수");
		}else if (sum >= 80) {
			if( k >= 90) System.out.println("국어 장려");
			if( e >= 90) System.out.println("영어 장려");
			if( m >= 90) System.out.println("수학");
		}else System.out.println("재시험");
		
		
	}
}
