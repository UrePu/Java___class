package Day01;

import java.util.Scanner;

public class Day01_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");		String ���� = sc.next();
		System.out.print("�ۼ��� �Է� : ");		String �ۼ��� = sc.next();
		System.out.print("���� �Է� : ");		String ���� = sc.next();
		System.out.print("��¥ �Է� : ");		String ��¥ = sc.next();
		
		System.out.println("*-----------�湮��---------|");
		System.out.println("*|����|�ۼ���|����     | ��¥  |");
		System.out.println("*| " + ���� + " |" + �ۼ��� + "|" + ���� + " |" + ��¥ + "|");
		System.out.println("*------------------------|");
		
	}

}
