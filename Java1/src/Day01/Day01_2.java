package Day01;

public class Day01_2 { //c s
	//1. 출력
		//1. print() : 출력만
		//2. println() : 출력후 줄바꿈 포함
		//3. printf() : 출력에 꾸미기 가능
			//형식
				// %s : 문자열 들어가는 자리
				// %d : 정수 들어가는 자리 
				// %f : 실수 들어가는자리
			//제어 [ \ : 엔터위에 원화기호]
				// \n : 줄바꿈
				// \t : 들여쓰기 [5줄정도]
				// \\ : 백슬 출력
				// \", \' : 큰따옴표 , 작은 따옴표 출력
	//1. System : 시스템 클래스 [ 입출력 관련 만들어진 코드 제공 ]
	//2. out : 출력 스트림
	//3. print() : 출력 함수 
	//4 ; : 한줄 코드의 끝을 알림
	//* 시스템 클래스내 out 이라는 출력 스트림을 통해 print 함수를 사용해서
	// console에 원하는대로 출력할 수 있다.
	
	public static void main(String[] args) { //main s
		//1. 기본출력
		System.out.print("aaaa");	// ; : 코드 단위 종료
		System.out.print("bbbb"); 	// 문자 " " 처리
		System.out.print("cccc");	// 숫자 " " 처리 x
		System.out.print("dddd");
			//* 미리 만들어진 단어 [ 예약어 ] 를 제외한 모든 문자는 " " 처리
				//미리 만들어진 단어 : 라이브러리에 있는것
		//2. 자동완성 ( syso + ctrl + space ) 
		System.out.println("eeee");
		System.out.println("ffff");
		System.out.println("gggg");
		
		//3. 형식 출력
		System.out.printf("%s", "하고싶지않은말");
		System.out.printf("java %d일차", 1);
		System.out.printf("%d", 123124);
		
		// 예제 1 [ 출석부 ]
		
		System.out.println("\n\t\t[출석부]");
		System.out.println("-----------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println("강호동\t출석\t결석\t출석");
		System.out.println("유재석\t출석\t출석\t출석");
		System.out.println("-----------------------------------------");
		
		//예제 2  [ 예제 1 -> printf ]
		System.out.printf("\n\t\t%s", "[출석부]\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s", "이름", "1교시", "2교시", "3교시", "비고\n");
		System.out.printf("%s\t%s\t%s\t%s", "강호동", "출석", "결석", "출석\n");
		System.out.printf("%s\t%s\t%s\t%s", "유재석", "출석", "결석", "출석\n");
		
		// 문제1 : 고양이
		System.out.println("\t 고양이");
		System.out.println("\t\\    /\\");
		System.out.println("\t )  ( \')");
		System.out.println("\t(  /  )");
		System.out.println("\t \\(__)|");
		
		System.out.println("\n\t 강아지");
		System.out.println("\t|\\_/|");
		System.out.println("\t|q p|    /}");
		System.out.println("\t( 0 ) \"\"\"\\");
		System.out.println("\t|\"^\"`    |");
		System.out.println("\t||_/=\\\\__|");
	} // main e
} // c e
