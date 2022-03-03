package Day03;

import java.util.Scanner;

public class Day03_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//문제 1: 입력받은 수까지 별출력
		System.out.print("문제1 별의 수 입력: "); int q1 = sc.nextInt();
		for(int i = 1 ; i <= q1 ; i++) {
			System.out.print("*");
		}
		//문제 2: 입력받은 수 만큼 별 출력 [5개 마다 줄바꿈]

		System.out.print("문제2 별의 수 입력: "); int q2 = sc.nextInt();
		for(int i = 1 ; i <= q2 ; i++) {
			if (i % 5 == 0) {
				System.out.println("*");
			}else System.out.print("*");
		}
		//문제 3: 입력받은 줄만큼 출력

		System.out.print("문제3 별의 줄 수 입력: "); int q3 = sc.nextInt();
		for(int i = 1 ; i <= q3 ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}		
		// 순서도 
		// 사용자가 3을 입력했을때 
		// i = 1  i<=3 [true] -> i++
			// s = 1	s<=1 [true] -> * -> s++
			// s = 2 	s<=1 [false] -> for2 반복문종료
		// 줄바꿈
		// i = 2  i<=3 [ true ] -> i++
			// s = 1	s<=2 [true] -> * -> s++
			// s = 2 	s<=2 [true] -> * -> s++
			// s = 3 	s<=2 [false] -> for2 반복문종료 
		// 줄바꿈
		// i = 3  i<=3 [ true ] -> i++
			// s = 1	s<=3 [ true ] -> * -> s++
			// s = 2    s<=3 [ true ] -> * -> s++
			// s = 3 	s<=3 [ true ] -> * -> s++
			// s = 4	s<=3 [ false] -> for2 반복문종료
		// 줄바꿈
		// i = 4 	i<=3 [false ] for1 반복문종료
		
		//별문제 4 입력받은 줄만큼 출력

		System.out.print("문제4 별의 줄 수 입력: "); int q4 = sc.nextInt();
		for(int i = q4 ; i >= 1 ; i-- ) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}		
		
		//별문제5 : 입력받은 줄만큼 출력
		
		System.out.print("문제5 별의 줄 수 입력: "); int q5 = sc.nextInt();
		for(int i = q5 ; i >= 1 ; i-- ) {
			for(int j = 1; j <= q5 ; j++) {
				if(i > j) {
					System.out.print(" ");					
				}else System.out.print("*");
			}System.out.println(" ");
			
		}
		
		//문제 6: 입력받은 줄 만큼 출력
		System.out.print("문제6 별의 줄 수 입력: "); int q6 = sc.nextInt();
		
		for(int k = 1 ; k <= q6 ; k++ ) {
			for(int i = 0; i < k ; i++) {
				System.out.print(" ");
			}
			for(int j = q6; j >= k; j--) {
				System.out.print("*");
			}System.out.println(" ");
		}
		
		//문제7
		System.out.print("문제7 별의 줄 수 입력: "); int q7 = sc.nextInt();
		
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
