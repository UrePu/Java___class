package Day03;

import java.util.Scanner;

public class Day03_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//���� 1: �Է¹��� ������ �����
		System.out.print("����1 ���� �� �Է�: "); int q1 = sc.nextInt();
		for(int i = 1 ; i <= q1 ; i++) {
			System.out.print("*");
		}
		//���� 2: �Է¹��� �� ��ŭ �� ��� [5�� ���� �ٹٲ�]

		System.out.print("����2 ���� �� �Է�: "); int q2 = sc.nextInt();
		for(int i = 1 ; i <= q2 ; i++) {
			if (i % 5 == 0) {
				System.out.println("*");
			}else System.out.print("*");
		}
		//���� 3: �Է¹��� �ٸ�ŭ ���

		System.out.print("����3 ���� �� �� �Է�: "); int q3 = sc.nextInt();
		for(int i = 1 ; i <= q3 ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}		
		// ������ 
		// ����ڰ� 3�� �Է������� 
		// i = 1  i<=3 [true] -> i++
			// s = 1	s<=1 [true] -> * -> s++
			// s = 2 	s<=1 [false] -> for2 �ݺ�������
		// �ٹٲ�
		// i = 2  i<=3 [ true ] -> i++
			// s = 1	s<=2 [true] -> * -> s++
			// s = 2 	s<=2 [true] -> * -> s++
			// s = 3 	s<=2 [false] -> for2 �ݺ������� 
		// �ٹٲ�
		// i = 3  i<=3 [ true ] -> i++
			// s = 1	s<=3 [ true ] -> * -> s++
			// s = 2    s<=3 [ true ] -> * -> s++
			// s = 3 	s<=3 [ true ] -> * -> s++
			// s = 4	s<=3 [ false] -> for2 �ݺ�������
		// �ٹٲ�
		// i = 4 	i<=3 [false ] for1 �ݺ�������
		
		//������ 4 �Է¹��� �ٸ�ŭ ���

		System.out.print("����4 ���� �� �� �Է�: "); int q4 = sc.nextInt();
		for(int i = q4 ; i >= 1 ; i-- ) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}		
		
		//������5 : �Է¹��� �ٸ�ŭ ���
		
		System.out.print("����5 ���� �� �� �Է�: "); int q5 = sc.nextInt();
		for(int i = q5 ; i >= 1 ; i-- ) {
			for(int j = 1; j <= q5 ; j++) {
				if(i > j) {
					System.out.print(" ");					
				}else System.out.print("*");
			}System.out.println(" ");
			
		}
		
		//���� 6: �Է¹��� �� ��ŭ ���
		System.out.print("����6 ���� �� �� �Է�: "); int q6 = sc.nextInt();
		
		for(int k = 1 ; k <= q6 ; k++ ) {
			for(int i = 0; i < k ; i++) {
				System.out.print(" ");
			}
			for(int j = q6; j >= k; j--) {
				System.out.print("*");
			}System.out.println(" ");
		}
		
		//����7
		System.out.print("����7 ���� �� �� �Է�: "); int q7 = sc.nextInt();
		
		for(int k = q7 ; k >= 1 ; k-- ) {
			for(int i = 0; i < k ; i++) {
				System.out.print(" ");
			}
			for(int j = q7; j >= k; j--) {
				System.out.print("*");
			}
			for(int z = 0 ; z < q7 - k; z++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
