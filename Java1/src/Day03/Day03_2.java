package Day03;

import java.util.Scanner;

public class Day03_2 {
	

	public static void main(String[] args) {

//		//문제1 : 2개의 정수를 입력받아서 더 큰수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		
		
		if (num1 > num2 ) System.out.println("정수 1이 더 크다"); 		// 만약에 num1 이 num2 보다 크면 실행 
		else if (num2 > num1) System.out.println("정수 2가 더 크다.");	//만약에 num2 이 num1 보다 크면 실행
		else System.out.println("같다."); 							//아니면 같다를 실행
		
//		//문제 2: 세개의 정수를 입력받아서 가장 큰 수 출력.

		System.out.print("정수1 입력: ");		int n1 = sc.nextInt();
		System.out.print("정수2 입력: ");		int n2 = sc.nextInt();
		System.out.print("정수3 입력: ");		int n3 = sc.nextInt();
		int max = n1;
		if (n2 > max) max = n2;
		 if (n3 > max) max = n3;
		
		System.out.println("가장 큰 수는: " + max);
	
//		//문제 3: 네개의 정수를 입력 받아서 가장 큰 수 출력.
		

		System.out.print("정수1 입력: ");		int nu1 = sc.nextInt();
		System.out.print("정수2 입력: ");		int nu2 = sc.nextInt();
		System.out.print("정수3 입력: ");		int nu3 = sc.nextInt();
		System.out.print("정수3 입력: ");		int nu4 = sc.nextInt();
		int max2 = nu1;
		if (nu2 > max2) max2 = nu2;
		if (nu3 > max2) max2 = nu3;
		if (nu4 > max2) max2 = nu4;
		
		System.out.println("가장 큰 수는: " + max2);
		
		//문제4: 3개의 정수를 입력받아서 오름차순

		System.out.print("정수1 입력: ");		int numb1 = sc.nextInt();
		System.out.print("정수2 입력: ");		int numb2 = sc.nextInt();
		System.out.print("정수3 입력: ");		int numb3 = sc.nextInt();
		
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
		System.out.printf("입력한 값 오른차순 : %d %d %d \n", numb1 , numb2, numb3);
		System.out.printf("입력한 값 내림차순 : %d %d %d \n", numb3, numb2 , numb1);
		
		// 문제5 : 4개의 정수를 입력받아서 오름차순 / 내림차순 
		

		System.out.print("정수1 입력: ");		int 문제5_1 = sc.nextInt();
		System.out.print("정수2 입력: ");		int 문제5_2 = sc.nextInt();
		System.out.print("정수3 입력: ");		int 문제5_3 = sc.nextInt();
		System.out.print("정수4 입력: ");		int 문제5_4 = sc.nextInt();
		
		if (문제5_1 > 문제5_2) {
			int temp = 문제5_1;
			문제5_1 = 문제5_2;
			문제5_2 = temp;
		}
		
		if (문제5_1 > 문제5_3) {
			int temp = 문제5_1;
			문제5_1 = 문제5_3;
			문제5_3 = temp;
		}
		if (문제5_1 > 문제5_4) {
			int temp = 문제5_1;
			문제5_1 = 문제5_4;
			문제5_4 = temp;
		}
		if( 문제5_2 > 문제5_3) {
			int temp = 문제5_2;
			문제5_2 = 문제5_3;
			문제5_3 = temp;
		}
		if(문제5_2 > 문제5_4) {
			int temp = 문제5_2;
			문제5_2 = 문제5_4;
			문제5_4 = temp;
		}
		if(문제5_3 > 문제5_4) {
			int temp = 문제5_3;
			문제5_3 = 문제5_4;
			문제5_4 = temp;
		}
		System.out.printf("입력한 값 오른차순 : %d %d %d %d \n", 문제5_1 , 문제5_2, 문제5_3, 문제5_4);
		System.out.printf("입력한 값 내림차순 : %d %d %d %d \n", 문제5_4 , 문제5_3, 문제5_2, 문제5_1);
		
	}

}
