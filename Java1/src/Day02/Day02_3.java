package Day02;

import java.util.Scanner;

public class Day02_3 {
	public static void main(String[] args) {
		//���� 1 : �޿����
		/*
		 * [ �Է����� ]
		 * 		�⺻�� , ����
		 * 	[����]
		 * 		�Ǽ��ɾ� = �⺻�� + ���� - ����[�⺻�� 10%]
		 * 	[�������]
		 * 		�Ǽ��ɾ� ���
		 */
		
		//* �Է� -> ���� -> ��� -> ���
		// 1. �Է� ��ü �����.
		// 2. �Է¹��� ���� ������ �����Ѵ�. [ �Է°�ü�� �Է� �����븶�� ���� �����Ͱ� �������.]
		// 3. ������ ���� �Ѵ�.
		// 4. ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⺻���� �Է��ϼ��� :"); int value1 = sc.nextInt();
		System.out.print("������ �Է��ϼ��� :"); int value2 = sc.nextInt();

		
		double sum = value1 + value2 - (value1 * 0.1);
		
		System.out.println("ȸ������ �� ���ɾ� : " + sum);
		
		
		
		
		//����2 : ���� ����
		/* 
		 * [�Է�����]
		 * 		�ݾ�
		 * [ ���� ]
		 * 		�ʸ��� ���� �豸������� ���� ����
		 * [ ������� ]
		 * 		��) 356789 �Է½�
		 * 		�ʸ���3��
		 * 		���� 5��
		 * 		õ�� 6��
		 * 		��� 7��
		 */
		
		System.out.print("�ݾ��� �Է��ϼ��� :"); String value3 = sc.next();
		int num3 = Integer.parseInt(value3);
		
		int val1 = (int)(num3 / 100000) ;
		
		num3 = num3 - val1 * 100000 ;
		
		int val2 = (int)(num3/10000);
		
		num3 = num3 - val2 * 10000 ;
		
		int val3 = (int)(num3/1000);
		
		num3 = num3 - val3 * 1000 ;
		
		int val4 = (int)(num3/100);
		
		System.out.println("10����: " + val1 + "��\n1����: " + val2 + "��\n1õ��: " + val3 + "��\n1���: " + val4+ "��" );
		
	}
}
