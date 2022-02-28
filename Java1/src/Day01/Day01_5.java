package Day01;

import java.util.Scanner;

public class Day01_5 {//c s

	public static void main(String[] args) {// m s
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");		String 아이디 = sc.next();
		System.out.print("비밀번호 입력 : ");	String 비밀번호 = sc.next();
		System.out.print("성명 입력 : ");		String 성명 = sc.next();
		System.out.print("이메일 입력 : ");		String 이메일 = sc.next();
		
		System.out.println(">>>>>>>>>회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>>>>");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.println(아이디 + "\t" + 비밀번호 + "\t" + 성명 + "\t" + 이메일);
	}// m e
}//c e
