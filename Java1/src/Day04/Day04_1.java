package Day04;

import java.util.Scanner;

public class Day04_1 {// c s

	public static void main(String[] args) { //m s
		
		//���: if, switch
		//�ݺ��� : for, while
			//1. �ʱⰪ 2. ���ǽ� 3. ������. ���๮
		//for ��1)
		
		for(int  i = 1; i <=10 ; i++) {
			System.out.println(i + " ");
		}
		//while ��1)
		int i = 1 ; 
		while (i <= 10) {
			System.out.println(i + " ");
			i++;
		}
		
		//for ��2) 1 ~ 100 �����հ�
		int sum = 0;
		for (int j = 1; j <= 100 ; j++) {
			sum += j;
		}
		System.out.println("�����հ� :" + sum);
		
		//while ��2) 1~ 100 �����հ�
		
		int k = 1; //�ʱⰪ
		int sum2 = 0;
		while (k <= 100) { //���ǽ� [true �� ����]
			sum2 += k;	//���๮
			k++;		//������
		}
		System.out.println("�����հ�2 :" + sum2);
		
		//while ��3) ���ѷ���
		while(true) {
			System.out.println("���ѷ���");
			Scanner sc = new Scanner(System.in);
			int exit = sc.nextInt();
			if(exit ==3 ) {
				break;
			}
		}
	}//m e

}// c e
