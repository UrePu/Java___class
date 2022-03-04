package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 {//cs
	public static void main(String[] args) {//ms
		Scanner sc = new Scanner(System.in);
		String[] game = {"[ ]","[ ]","[ ]","[ ]","[ ]",
		                          "[ ]","[ ]","[ ]","[ ]",};
		String win = "";
		Random rc = new Random();
		while(true) {
			System.out.printf("  %s\t  %s\t  %s\n", game[0], game[1], game[2]);
			System.out.printf("  %s\t  %s\t  %s\n", game[3], game[4], game[5]);
			System.out.printf("  %s\t  %s\t  %s\n", game[6], game[7], game[8]);
			
			/////////////////////////
			while(true) {
				System.out.println("숫자 선택");
				System.out.println(">>>>>>>>>>>>>>>>");  
				int sel1 = sc.nextInt();
				if (sel1 <0 || sel1 > 8) {
					System.out.println("잘못 입력 하셨습니다");
				}else {
						if (game[sel1].equals("[ ]")) {
							game[sel1] = "[o]";
							break;
						}else {
							System.err.println("오류))이미 체크되었습니다");
						}
				}
			}
			///////////////
			while (true) {
				int sel2 = rc.nextInt(9);
				if (sel2 <0 || sel2 > 8) {
				}else {
					if (game[sel2].equals("[ ]")) {
						game[sel2] = "[x]";
						break;
					}else {
						sel2 = rc.nextInt();
					}
				}
			}
			/////////////////////////// 3. 승리자 판단 ///////////////////////
			// 	1. 가로로 이기는수 
			for( int i =0 ; i<=6 ; i+=3 ) { //* i는 0부터 6까지 3씩증가 -> 0 3 6 -> 3회
				if( game[i].equals(game[i+1]) && game[i+1].equals(game[i+2]) ) {
					//   0 인덱스 == 1 인덱스  이면서  1 3인덱스 == 2 인덱스 
					win = game[i]; // 동일한 알을 승리알 변수에 대입 
				}
			}
			// 2. 세로로 이기는수 
			for( int i =0 ; i<3 ; i++ ) { 
				if( game[i].equals(game[i+3]) && game[i+3].equals(game[i+6]) ) {
					
					win = game[i]; // 동일한 알을 승리알 변수에 대입 
				}
			}
			// 3. 대각선으로 이기는수 	
			if ( game[0].equals(game[4]) && game[4].equals(game[8]) ) win= game[0];
			if ( game[2].equals(game[4]) && game[4].equals(game[6]) ) win= game[2];				
			
			//4. 게임종료
			if( win.equals("[o]") ) { 
				System.out.println(" 알림)) 플레이어 승리"); 
				break; // 게임종료 
			}
			if( win.equals("[x]") ) {
				System.out.println(" 알림)) 컴퓨터 승리");
				break; // 게임종료
			}
		}
	}//me
}//ce
