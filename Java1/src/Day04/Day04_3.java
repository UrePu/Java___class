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
			System.out.println("���������� ����");
			System.out.println("����(0) ���� (1) ��(2) ����(3) ����:");
			p1 = sc.nextInt();
			System.out.println("�÷��̾ �Է��� ��: " +p1);
			Random random = new Random();
				//random.nextInt(): int �� ǥ���� �� �ִ� ������ ���� �߻�
				//random.nextInt(��): 0 ~ �� ������ ������ ���� �߻�
					//random.nextInt(10): 0 ~ 9 �� ���� �߻�
					//random,nextInt(11)+10 : 10~20�� ���� �߻�
			pc = random.nextInt(3);
			System.out.println("pc�� ��: " + pc);
			if(p1 == 0) { // 0�϶�
				if(p1 == pc) System.out.println("���");
				else if (pc == 1) System.out.println("�й�");
				else System.out.println("�¸�");
			}else if(p1 == 1) { // 1�϶� 
				if(p1 == pc) System.out.println("���");
				else if (pc == 2) System.out.println("�й�");
				else System.out.println("�¸�");
			}
			else if(p1 == 2){
				if(p1 == pc) System.out.println("���");
				else if (pc == 0) System.out.println("�й�");
				else System.out.println("�¸�"); // 2�϶� 		
			}
		}
	}
}
