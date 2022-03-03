package Day03;

public class Day03_1 { //c s
	
	public static void main(String[] args) {// m s
		
		//1일차 : 출력, 입력
		//2일차 : 저장, 계산
		//제어문 
			// 컴퓨터의 판단력 -> 경우의 수
			// 조건식이 true 이면 실행문 처리.
			// 형태
				//1. IF(조건식[true/false]) 실행문;
				//2. IF(조건식) 실행문[참];
					//ElSE 실행문[거짓]
				//3. 실행문이 2줄 이상일때.
				//4. if(조건1) {실행문 [참1];}
				//	 else if (조건2) {실행문 [참2];}
				//   else if (조건3) {실행문 [참3];}
				//	 else if (조건4) {실행문 [참4];}
				//   else if (조건5) {실행문 [참5];}
				//	 else {실행문[거짓];}
		
		
		//예제1
		if (3>1) System.out.println("3이 1보다 크다.");
			//만약에 3이 1보다 크면 출력o 아니면 출력x
		if(3>5) System.out.println("3이 5보다 크다.");
			//만약에 3이 5보다 크면 출력o 아니면 출력x
		if(3>1) System.out.println("3_1 3이 1보다 크다 ");
		else System.out.println("3_2 3이 1보다 작다");
			//만약에 3이 1보다 크면 3_1 출력 아니면 3_2 출력
		
		if(3>2) { //true 실행 시작
			System.out.println("true");
			System.out.println("3이 2보다 크다.");
		} //true 실행 끝
		else { //false 실행문 시작
			System.out.println("false");
			System.out.println("3이 2보다 작다.");
				
		} //false 실행문 끝
		
		if (3 > 5) System.out.println("3이 5보다 크다"); 			//실행x
		else if (3 > 4 ) System.out.println("3이 4보다 크다");		//실행x
		else if (3 > 3 ) System.out.println("3이 3보다 크다");		//실행x
		else if (3 > 2) System.out.println("3이 2보다 크다");		//실행o
		else System.out.println("true 없다.");					//실행x
		
		if (3 > 5) System.out.println("3이 5보다 크다"); 		//실행x
		if (3 > 4 ) System.out.println("3이 4보다 크다");		//실행x
		if (3 > 3 ) System.out.println("3이 3보다 크다");		//실행x
		if (3 > 2) System.out.println("3이 2보다 크다");		//실행o
		if (3 < 2) System.out.println("true 없다.");			//실행x
		//위 두개 전부 실행은 되지만 1번이 효율이 더 좋음
		
	}//m e

}//m e
