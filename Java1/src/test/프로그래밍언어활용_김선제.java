package test;

import java.util.Scanner;

public class ���α׷��־��Ȱ��_�輱�� {
	
	public static void main(String[] args) {
		
		// �迭 
		�л�[] �л��迭 = new �л�[100];
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			try {
				for(int j = 0; j < �л��迭.length ; j++) {
					if(�л��迭[j] !=null && �л��迭[j + 1] != null) {
						if(�л��迭[j].get���() < �л��迭[j + 1].get���() ) {
							�л� temp = �л��迭[j];
							�л��迭[j] = �л��迭[j+1];
							�л��迭[j + 1] = temp;
							j = -1;
						}
					}
				}
				System.out.println(" --------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ");
				System.out.println(" --------------------------------------------------");
				System.out.println("   ��ȣ   �̸�   ����   ����   ����   ����   ���   ����");
				System.out.println(" --------------------------------------------------");
				// �л��� ���� ��� [ ��� �迭 ���  ]
				int index = 1;
				for(�л� temp : �л��迭) {
					if (temp != null) {
					System.out.printf("    %d   %s   %d    %d    %d   %d   %.2f   %d\n", index, temp.get�̸�(), temp.get����() , temp.get����(), temp.get����(), temp.get����(), temp.get���(), index);
					index++ ;
					}
				}
				
				System.out.print(" 1. �л���� 2.�л����� : ");
				int ch = scanner.nextInt();
				if( ch==1 ) {
					//���� ���
						System.out.print("�̸� �Է�: "); String name = scanner.next();
						System.out.print("���� ���� �Է�: "); int korean = scanner.nextInt();
						System.out.print("���� ���� �Է�: "); int english = scanner.nextInt();
						System.out.print("���� ���� �Է�: "); int math = scanner.nextInt();
					
						�л� �й� = new �л�(name, korean, english, math, (korean + english + math) , ((double)(korean + english + math) / 3));
						int i = 0;

						for(�л� temp : �л��迭) {
							if(temp == null) {
								�л��迭[i] = �й�;
								break;
							}
							i++;						
						}
					
				
					
				} // �л� ��� 
				else if( ch== 2 ) {
					System.out.print("������ ��ȣ �Է�: "); int ch2 = scanner.nextInt();
					
					try {
						�л��迭[ch2 - 1] = null;
						for(int x = ch2 - 1; x < �л��迭.length ; x++ ) {
							if(�л��迭[x + 1] == null) {
								break;
							}else {
								�л��迭[x] = �л��迭[x + 1];
								�л��迭[x + 1] = null;
							}
						}
					}catch(Exception e) {
						System.err.println("����)) �߸��� ��ȣ");
						scanner.next();
					}
				} // �л� ���� 
				else {   }
			}
			catch( Exception e ) {
				System.err.println("�߸� �Է� �Ͽ����ϴ�");
				scanner.next();
			}
		}
	}
}
