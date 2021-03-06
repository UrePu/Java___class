package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 {//cs
		/* 로또 판별기 
			1. 사용자 6개 수 입력받기 -> 배열 저장 
				1. 1~45 사이 수 만 입력받기 아니면 재입력
				2. 중복x 재입력 
			2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
				1. 1~45 사이 
				2. 중복x
			3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
		 */
		@SuppressWarnings("null")
		public static void main(String[] args) {// ms
			
			// 준비
			int[] 사용자번호 = new int[6]; // 사용자가 선택한 번호 목록 
			int[] 추첨번호 = new int[6];	// 컴퓨터가 난수 번호 목록
			Scanner scanner = new Scanner(System.in);
			
			// 1. 사용자에게 입력받기 
			for( int i = 0 ; i<6 ; i++ ) {
				// i는 0부터 5까지 1씩증가반복 => 6회반복
				System.out.print(" 1~45 사이 입력 : ");
				int 번호 = scanner.nextInt();
				
				boolean 통과 = true; // 저장 되는 조건 변수
				
				// 조건1 : 유효성검사 
				if( 번호 < 1 || 번호 > 45 ) { // 1보다 작거나 45보다 크면 선택할수 없는 번호입력시 재입력 
					System.out.println(" 알림)) 선택할수 없는 번호 입니다.[재입력] ");
					i--; // 현재 i는 정상입력x
					통과 = false; // 저장 x 
				}// if end 
				
				// 조건2 : 중복체크 
					// 1. 배열내 모든 인덱스 호출
				for( int j = 0 ; j<6 ; j++ ) {
					if( 번호 == 사용자번호[j] ) {
						// 2. 입력받은 값과 j번째 인덱스값과 같은지 비교
						System.out.println(" 알림)) 이미 선택한 번호 입니다.[재입력]");
						i--; // 현재 i는 정상입력x
						통과 = false; // 저장x
					} // if end 
				} // for2 end 
				// 정상입력[통과가 true] 이면 배열에 저장하기 
				if( 통과 == true) 사용자번호[i] = 번호;
				
			} // for end 
			
			System.out.print("\n사용자가 선택한 번호 : ");
			// * 사용자 배열내 모든 인덱스 출력 
			for( int temp : 사용자번호 ) {
				System.out.print( temp +" ");
			}
			
			// 2. 컴퓨터가 난수생성 
			int[] pc번호 = new int[6];
			Random random = new Random();
			for (int i = 0; i < 6 ; i++) {
				pc번호[i] = random.nextInt(46) + 1 ;
			}
			for (int i = 0; i < 6 ; i++) {
				for (int j = i + 1 ; j < 6 ; j++) {
					if (pc번호[i] == pc번호[j]) {
						pc번호[i] = random.nextInt(46) + 1;
						i = 0;
					}
				}
						
			}
			System.out.print("\n추첨 숫자: ");
			for (int i : pc번호) {
				System.out.print(i + " ");
			}
			// 3. 비교 = 두 배열간 동일한 수 찾기 
			int index = 0;
			int[] same = new int[6];
			for(int a : 사용자번호) {
				for(int b : pc번호) {
					if (a == b) {
						same[index] = a;
						index += 1;
					}
				}
			}
			
			System.out.println("\n맞춘 개수: " + index);
			System.out.print("맞춘 숫자: { ");
			for(int a : same) {
				if (a != 0) {
				System.out.print(a + ", ");
				}
			}
			System.out.println("}");
		
	}//me
}//ce
