package Day03;

import java.util.Scanner;

public class Day03_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����6
				// ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ��� 
				
		System.out.print("���� �Է�: "); int score = sc.nextInt();
		
		if (score >= 90) System.out.println("�հ�");
		else System.out.println("���հ�");
		
		//����7
				// ������ �Է¹޾� ������ 90�� �̻��̸� A���
				//				������ 80�� �̻��̸� B���
				//				������ 70�� �̻��̸� C���
				//				�׿� �����
		
		System.out.print("���� �Է�: "); int score2 = sc.nextInt();
		
		if (score2 >= 90) System.out.println("A���");
		else if(score2 >= 80) System.out.println("B���");
		else if(score2 >= 70) System.out.println("C���");
		else System.out.println("�����");
		
		//����8 �α���������
				// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
				// [ ���� ] : ȸ�����̵� admin �̰� 
				//           ��й�ȣ�� 1234 �� ��쿡�� 
				//          �α��� ���� �ƴϸ� �α��� ���� ���
		System.out.print("���̵� �Է�: "); String id = sc.next();
		System.out.print("��й�ȣ �Է�: "); String pw = sc.next();
		
		if(id.equals("admin")) {
			if(pw.equals("1234"))System.out.println("�α��� ����");
			else System.out.println("�α��� ����");
		}else System.out.println("�α��� ����");
		
		/* ����9
		 * [�Է�] : ����, ����, ���� �Է¹ޱ�
		 * [����]
		 * 		����� 90�� �̻��̸鼭 
		 * 		�������� 100���̸� ���������
		 * 		�������� 100���̸� ���� ��� ���
		 * 		�������� 100���̸� ���� ��� ��� 
		 */
		
		System.out.print("�������� �Է�: "); int k = sc.nextInt();
		System.out.print("�������� �Է�: "); int e = sc.nextInt();
		System.out.print("�������� �Է�: "); int m = sc.nextInt();
		
		double sum = (k + e + m )/3;
		
		if (sum >= 90) {
			if ( k == 100 ) System.out.println("���� ���");
			if ( e == 100 ) System.out.println("���� ���");
			if ( m == 100 ) System.out.println("���� ���");
		}else if (sum >= 80) {
			if( k >= 90) System.out.println("���� ���");
			if( e >= 90) System.out.println("���� ���");
			if( m >= 90) System.out.println("����");
		}else System.out.println("�����");
		
		
	}
}
