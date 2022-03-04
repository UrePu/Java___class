package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {
	public static void main(String[] args) {
		
		int p1 ;
		int pc;
		int games;
		int pwins; int cwins; 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("가위바위보 게임");
			System.out.println("가위(0) 바위 (1) 보(2) 종료(3) 선택:");
			p1 = sc.nextInt();
			System.out.println("플레이어가 입력한 수: " +p1);
			Random random = new Random();
				//random.nextInt(): int 가 표현할 수 있는 범위내 난수 발생
				//random.nextInt(수): 0 ~ 수 전꺼지 범위내 난수 발생
					//random.nextInt(10): 0 ~ 9 중 난수 발생
					//random,nextInt(11)+10 : 10~20중 난수 발생
			pc = random.nextInt(3);
			System.out.println("pc의 수: " + pc);
			if(p1 == 0) { // 0일때
				if(p1 == pc) System.out.println("비김");
				else if (pc == 1) System.out.println("패배");
				else System.out.println("승리");
			}else if(p1 == 1) { // 1일때 
				if(p1 == pc) System.out.println("비김");
				else if (pc == 2) System.out.println("패배");
				else System.out.println("승리");
			}
			else if(p1 == 2){
				if(p1 == pc) System.out.println("비김");
				else if (pc == 0) System.out.println("패배");
				else System.out.println("승리"); // 2일때 		
			}
		}
	}
}
