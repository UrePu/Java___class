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
				System.out.println("���� ����");
				System.out.println(">>>>>>>>>>>>>>>>");  
				int sel1 = sc.nextInt();
				if (sel1 <0 || sel1 > 8) {
					System.out.println("�߸� �Է� �ϼ̽��ϴ�");
				}else {
						if (game[sel1].equals("[ ]")) {
							game[sel1] = "[o]";
							break;
						}else {
							System.err.println("����))�̹� üũ�Ǿ����ϴ�");
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
			/////////////////////////// 3. �¸��� �Ǵ� ///////////////////////
			// 	1. ���η� �̱�¼� 
			for( int i =0 ; i<=6 ; i+=3 ) { //* i�� 0���� 6���� 3������ -> 0 3 6 -> 3ȸ
				if( game[i].equals(game[i+1]) && game[i+1].equals(game[i+2]) ) {
					//   0 �ε��� == 1 �ε���  �̸鼭  1 3�ε��� == 2 �ε��� 
					win = game[i]; // ������ ���� �¸��� ������ ���� 
				}
			}
			// 2. ���η� �̱�¼� 
			for( int i =0 ; i<3 ; i++ ) { 
				if( game[i].equals(game[i+3]) && game[i+3].equals(game[i+6]) ) {
					
					win = game[i]; // ������ ���� �¸��� ������ ���� 
				}
			}
			// 3. �밢������ �̱�¼� 	
			if ( game[0].equals(game[4]) && game[4].equals(game[8]) ) win= game[0];
			if ( game[2].equals(game[4]) && game[4].equals(game[6]) ) win= game[2];				
			
			//4. ��������
			if( win.equals("[o]") ) { 
				System.out.println(" �˸�)) �÷��̾� �¸�"); 
				break; // �������� 
			}
			if( win.equals("[x]") ) {
				System.out.println(" �˸�)) ��ǻ�� �¸�");
				break; // ��������
			}
		}
	}//me
}//ce
