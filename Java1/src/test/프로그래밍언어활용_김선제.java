package test;

import java.util.Scanner;

public class 프로그래밍언어활용_김선제 {
	
	public static void main(String[] args) {
		
		// 배열 
		학생[] 학생배열 = new 학생[100];
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			try {
				for(int j = 0; j < 학생배열.length ; j++) {
					if(학생배열[j] !=null && 학생배열[j + 1] != null) {
						if(학생배열[j].get평균() < 학생배열[j + 1].get평균() ) {
							학생 temp = 학생배열[j];
							학생배열[j] = 학생배열[j+1];
							학생배열[j + 1] = temp;
							j = -1;
						}
					}
				}
				System.out.println(" --------------------------------------------------");
				System.out.println("\t\t성\t적\t표");
				System.out.println(" --------------------------------------------------");
				System.out.println("   번호   이름   국어   영어   수학   총점   평균   석차");
				System.out.println(" --------------------------------------------------");
				// 학생들 점수 출력 [ 모든 배열 출력  ]
				int index = 1;
				for(학생 temp : 학생배열) {
					if (temp != null) {
					System.out.printf("    %d   %s   %d    %d    %d   %d   %.2f   %d\n", index, temp.get이름(), temp.get국어() , temp.get영어(), temp.get수학(), temp.get총점(), temp.get평균(), index);
					index++ ;
					}
				}
				
				System.out.print(" 1. 학생등록 2.학생삭제 : ");
				int ch = scanner.nextInt();
				if( ch==1 ) {
					//점수 등록
						System.out.print("이름 입력: "); String name = scanner.next();
						System.out.print("국어 점수 입력: "); int korean = scanner.nextInt();
						System.out.print("영어 점수 입력: "); int english = scanner.nextInt();
						System.out.print("수학 점수 입력: "); int math = scanner.nextInt();
					
						학생 학배 = new 학생(name, korean, english, math, (korean + english + math) , ((double)(korean + english + math) / 3));
						int i = 0;

						for(학생 temp : 학생배열) {
							if(temp == null) {
								학생배열[i] = 학배;
								break;
							}
							i++;						
						}
					
				
					
				} // 학생 등록 
				else if( ch== 2 ) {
					System.out.print("삭제할 번호 입력: "); int ch2 = scanner.nextInt();
					
					try {
						학생배열[ch2 - 1] = null;
						for(int x = ch2 - 1; x < 학생배열.length ; x++ ) {
							if(학생배열[x + 1] == null) {
								break;
							}else {
								학생배열[x] = 학생배열[x + 1];
								학생배열[x + 1] = null;
							}
						}
					}catch(Exception e) {
						System.err.println("오류)) 잘못된 번호");
						scanner.next();
					}
				} // 학생 삭제 
				else {   }
			}
			catch( Exception e ) {
				System.err.println("잘못 입력 하였습니다");
				scanner.next();
			}
		}
	}
}
