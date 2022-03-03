package Day03;

import java.util.Scanner;

public class Day03_8_확인문제7 {
	public static void main(String[] args) {
		boolean run = true; //실행 여부 변수
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while ( run ) {
			System.out.println("----------------------");
			System.out.println("1. 예금 | 2출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.println("선택> ");
			
			int 선택 = sc.nextInt();
			
			if (선택 == 1 ) {
				System.out.print("예금액: "); int 예금액 = sc.nextInt();
				balance += 예금액;
			}else if(선택 == 2) {
				System.out.print("출금액: "); int 출금액 = sc.nextInt();
				balance -= 출금액;
			}else if(선택 == 3) {
				System.out.println(balance);
			}else if(선택 == 4) {
				break;
			}
		}	
	}
}
