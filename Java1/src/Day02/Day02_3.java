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
		
		
		
		
	}
}
