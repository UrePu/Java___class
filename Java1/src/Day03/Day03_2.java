package Day03;

import java.util.Scanner;

public class Day03_2 {
	

	public static void main(String[] args) {

//		//����1 : 2���� ������ �Է¹޾Ƽ� �� ū�� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է�: ");
		int num2 = sc.nextInt();
		
		
		if (num1 > num2 ) System.out.println("���� 1�� �� ũ��"); 		// ���࿡ num1 �� num2 ���� ũ�� ���� 
		else if (num2 > num1) System.out.println("���� 2�� �� ũ��.");	//���࿡ num2 �� num1 ���� ũ�� ����
		else System.out.println("����."); 							//�ƴϸ� ���ٸ� ����
		
//		//���� 2: ������ ������ �Է¹޾Ƽ� ���� ū �� ���.

		System.out.print("����1 �Է�: ");		int n1 = sc.nextInt();
		System.out.print("����2 �Է�: ");		int n2 = sc.nextInt();
		System.out.print("����3 �Է�: ");		int n3 = sc.nextInt();
		int max = n1;
		if (n2 > max) max = n2;
		 if (n3 > max) max = n3;
		
		System.out.println("���� ū ����: " + max);
	
//		//���� 3: �װ��� ������ �Է� �޾Ƽ� ���� ū �� ���.
		

		System.out.print("����1 �Է�: ");		int nu1 = sc.nextInt();
		System.out.print("����2 �Է�: ");		int nu2 = sc.nextInt();
		System.out.print("����3 �Է�: ");		int nu3 = sc.nextInt();
		System.out.print("����3 �Է�: ");		int nu4 = sc.nextInt();
		int max2 = nu1;
		if (nu2 > max2) max2 = nu2;
		if (nu3 > max2) max2 = nu3;
		if (nu4 > max2) max2 = nu4;
		
		System.out.println("���� ū ����: " + max2);
		
		//����4: 3���� ������ �Է¹޾Ƽ� ��������

		System.out.print("����1 �Է�: ");		int numb1 = sc.nextInt();
		System.out.print("����2 �Է�: ");		int numb2 = sc.nextInt();
		System.out.print("����3 �Է�: ");		int numb3 = sc.nextInt();
		
		if (numb1 > numb2) {
			int  temp = numb1;
			numb1 = numb2;
			numb2 = temp;
		}
		if (numb1 > numb3) {
			int temp = numb1;
			numb1 = numb3;
			numb3 = temp;
		}
		if (numb2 > numb3) {
			int temp = numb2;
			numb2 = numb3;
			numb3 = temp;
		}
		System.out.printf("�Է��� �� �������� : %d %d %d \n", numb1 , numb2, numb3);
		System.out.printf("�Է��� �� �������� : %d %d %d \n", numb3, numb2 , numb1);
		
		// ����5 : 4���� ������ �Է¹޾Ƽ� �������� / �������� 
		

		System.out.print("����1 �Է�: ");		int ����5_1 = sc.nextInt();
		System.out.print("����2 �Է�: ");		int ����5_2 = sc.nextInt();
		System.out.print("����3 �Է�: ");		int ����5_3 = sc.nextInt();
		System.out.print("����4 �Է�: ");		int ����5_4 = sc.nextInt();
		
		if (����5_1 > ����5_2) {
			int temp = ����5_1;
			����5_1 = ����5_2;
			����5_2 = temp;
		}
		
		if (����5_1 > ����5_3) {
			int temp = ����5_1;
			����5_1 = ����5_3;
			����5_3 = temp;
		}
		if (����5_1 > ����5_4) {
			int temp = ����5_1;
			����5_1 = ����5_4;
			����5_4 = temp;
		}
		if( ����5_2 > ����5_3) {
			int temp = ����5_2;
			����5_2 = ����5_3;
			����5_3 = temp;
		}
		if(����5_2 > ����5_4) {
			int temp = ����5_2;
			����5_2 = ����5_4;
			����5_4 = temp;
		}
		if(����5_3 > ����5_4) {
			int temp = ����5_3;
			����5_3 = ����5_4;
			����5_4 = temp;
		}
		System.out.printf("�Է��� �� �������� : %d %d %d %d \n", ����5_1 , ����5_2, ����5_3, ����5_4);
		System.out.printf("�Է��� �� �������� : %d %d %d %d \n", ����5_4 , ����5_3, ����5_2, ����5_1);
		
	}

}
