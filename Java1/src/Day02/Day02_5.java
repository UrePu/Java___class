package Day02;

import java.util.Scanner;

public class Day02_5 {
	
	public static void main(String[] args) {

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
		Scanner sc = new Scanner(System.in);
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
		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
		
		System.out.println("���� �Է� : " ); int y1 = sc.nextInt();
		boolean answ = y1 % 7 == 0;
		System.out.println("������ 7�� ����ΰ� : " + answ);
		
		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
		System.out.println("���� �Է� : " ); int x1 = sc.nextInt();
		
		boolean ans1 = x1 % 2 != 0;
		System.out.println("������ Ȧ���ΰ�? : " + ans1);
		
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]

		System.out.println("���� �Է� : " ); int x2 = sc.nextInt();
		boolean ans2 = x1 % 7 == 0 && x1 % 2 == 0;
		System.out.println("������ 7�� ������� ¦���ΰ�? : " + ans2);
		
		//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
		
		System.out.println("����1 �Է� : " ); int x3 = sc.nextInt();
		System.out.println("����2 �Է� : " ); int x4 = sc.nextInt();
		System.out.println("�� ū ���� : " + (x3 > x4 ? x3 : x4));
		
		//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
		
		System.out.println("������ �Է� : " ); int x5 = sc.nextInt();
		System.out.println("���� ���̴� : " + x5 * x5 * 3.14);
		
		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�

		System.out.println("�� �Ǽ� �Է� : " ); int x6 = sc.nextInt();
		System.out.println("�� �Ǽ� �Է� : " ); int x7 = sc.nextInt();
		System.out.printf("�� �Ǽ��� ���� ���� : %.1f %%  \n", (x6 / x7 * 100) );
		
		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
		

		System.out.println("���� �Է� : "); int x8 = sc.nextInt();
		System.out.println("�غ� �Է� : "); int x9 = sc.nextInt();
		System.out.println("���� �Է� : "); int x10 = sc.nextInt();
		System.out.println("��ٸ����� ���� : " + (x8 * x9) * x10 / 2 );
		
		//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
		

		System.out.println("Ű �Է� : "); int x11 = sc.nextInt();
		System.out.println("ǥ�� ü�� : " + (x11 - 100) * 0.9 );
		
		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
		

		System.out.println("Ű �Է� : "); int x12 = sc.nextInt();
		System.out.println("������ �Է� : "); int x13 = sc.nextInt();
		System.out.println("BMI ��ġ : " + x13 / (x12 / 100) * (x12 / 100));
		
		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 

		System.out.println("inch �Է� : "); int x14 = sc.nextInt();
		System.out.println("BMI ��ġ : " + x14 * 2.54 + "cm");
		
		//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
		//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
		//�߰���� �ݿ����� => 30 %
		//�⸻��� �ݿ����� => 30 %
		//������ �ݿ����� => 40 %
		
		System.out.println("�߰���� ���� �Է� : "); int x15 = sc.nextInt();
		System.out.println("�⸻��� ���� �Է� : "); int x16 = sc.nextInt();
		System.out.println("������ ���� �Է� : "); int x17 = sc.nextInt();
		System.out.printf("�߰���� �ݿ� ���� : %.2f ��, �⸻��� �ݿ� ���� : %.2f ��, ������ �ݿ� ���� %.2f ��", (x15 * 0.3) , (x16 * 0.3) , (x17 * 0.4)) ;
		
		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
	 		int x = 10;
			int y = x-- + 5 + --x; //23
			System.out.printf(" x�� �� : %d , y�ǰ� :  %d ", x, y);
		

		//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
			System.out.println("���� �Է� :"); int ����15 = sc.nextInt();
			System.out.println("����� : " + (����15 >= 40 ? "�߳�" : ����15 >= 20 ? "����" :  "�л�") + "�Դϴ�" );
		
		//����16 : 3���� ������ �Է¹޾� ������������ ���� 


			System.out.println("���� �Է�: "); int ����16_1 = sc.nextInt();
			System.out.println("���� �Է� :"); int ����16_2 = sc.nextInt();
			System.out.println("���� �Է�: "); int ����16_3= sc.nextInt();
			int ū�� = (����16_1 > ����16_2 && ����16_1 > ����16_2 ? ����16_1 : ����16_2 > ����16_1 && ����16_2 > ����16_3 ? ����16_2 : ����16_3 );
			int ������ = (����16_1 < ����16_2 && ����16_1 < ����16_2 ? ����16_1 : ����16_2 < ����16_1 && ����16_2 < ����16_3 ? ����16_2 : ����16_3 );
			int �߰��� = (����16_1 > ������ && ����16_1 < ū�� ? ����16_1 : ����16_2 > ������ && ����16_2 < ū�� ? ����16_2 : ����16_3);
			System.out.println(������ + ", " + �߰��� + ", " + ū��);
		
		//����17 : 4���� ������ �Է¹޾� ������������ ���� 
//			System.out.println("���� �Է�: "); int ����17_1 = sc.nextInt();
//			System.out.println("���� �Է� :"); int ����17_2 = sc.nextInt();
//			System.out.println("���� �Է�: "); int ����17_3= sc.nextInt();
//			System.out.println("���� �Է�: "); int ����17_4= sc.nextInt();
//			int ����1 = (����17_1 > ����17_2 && ����17_1 > ����17_2 && ����17_1 > ����17_4 ? ����17_1 : ����17_2 > ����17_1 && ����17_2 > ����17_3 && ����17_2 > ����17_4 ? ����17_2 : ����17_3 > ����17_1 && ����17_3 > ����17_2 && ����17_3 > ����17_4 ? ����17_3 : ����17_4 );
//			int ����2 = (
//			int ����3 = (����17_1 > ������ && ����17_1 < ū�� ? ����17_1 : ����17_2 > ������ && ����17_2 < ū�� ? ����17_2 : ����17_3);
//			int ����4 = (����17_1 < ����17_2 && ����17_1 < ����17_2 && ����17_1 < ����17_4 ? ����17_1 : ����17_2 < ����17_1 && ����17_2 < ����17_3 && ����17_2 < ����17_4 ? ����17_2 : ����17_3 < ����17_1 && ����17_3 < ����17_2 && ����17_3 < ����17_4 ? ����17_3 : ����17_4 );
//			System.out.println(������ + ", " + �߰��� + ", " + ū��);
		
		// p. 102 Ȯ�ι���
		/*
		 * 1. 3
		 * 2. 31
		 * 3. ��
		 * 4. 
		 * 		#1. pencils / students
		 * 		#2. pencils % students
		 * 5. (int)( value / 100 ) * 100
		 * 6. (lengthTop + lenghtBottom) * height / 2
		 * 7. #1 true #2 false
		 * 8.
		 */
		
	}

}
