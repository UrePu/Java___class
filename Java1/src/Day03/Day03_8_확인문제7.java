package Day03;

import java.util.Scanner;

public class Day03_8_Ȯ�ι���7 {
	public static void main(String[] args) {
		boolean run = true; //���� ���� ����
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while ( run ) {
			System.out.println("----------------------");
			System.out.println("1. ���� | 2��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------");
			System.out.println("����> ");
			
			int ���� = sc.nextInt();
			
			if (���� == 1 ) {
				System.out.print("���ݾ�: "); int ���ݾ� = sc.nextInt();
				balance += ���ݾ�;
			}else if(���� == 2) {
				System.out.print("��ݾ�: "); int ��ݾ� = sc.nextInt();
				balance -= ��ݾ�;
			}else if(���� == 3) {
				System.out.println(balance);
			}else if(���� == 4) {
				break;
			}
		}	
	}
}
