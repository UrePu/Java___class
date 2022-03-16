package test;

import java.util.Scanner;

public class 테스트 {
	
	public static void main(String[] args) {
		
		// 배열 
		학생[] 학생배열 = new 학생[100];
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			try {
				System.out.println(" **** 학생 목록 ****");
				// 학생들 점수 출력 [ 모든 배열 출력  ]
				
				System.out.print(" 1. 학생등록 2.학생삭제 : ");
				int ch = scanner.nextInt();
				if( ch==1 ) {   } // 학생 등록 
				else if( ch== 2 ) {   } // 학생 삭제 
				else {   }
			}
			catch( Exception e ) {     }
		}
	}
}
