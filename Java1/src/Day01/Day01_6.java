package Day01;

import java.util.Scanner;

public class Day01_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("순번 입력 : ");		String 순번 = sc.next();
		System.out.print("작성자 입력 : ");		String 작성자 = sc.next();
		System.out.print("내용 입력 : ");		String 내용 = sc.next();
		System.out.print("날짜 입력 : ");		String 날짜 = sc.next();
		
		System.out.println("*-----------방문록---------|");
		System.out.println("*|순번|작성자|내용     | 날짜  |");
		System.out.println("*| " + 순번 + " |" + 작성자 + "|" + 내용 + " |" + 날짜 + "|");
		System.out.println("*------------------------|");
		
	}

}
