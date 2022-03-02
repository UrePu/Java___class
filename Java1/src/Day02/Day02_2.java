
package Day02;

public class Day02_2 { // c s
	public static void main(String[] args) { //m s
		//p.40 byte : 1바이트 +- 128
		
		//;  :실행 단위 구분
		// 동일한 변수명은 사용할 수 없다. [이름이 중복되면 오류(구분불가)]
		byte var1 = -128 ; System.out.println( var1 );
		byte var2 = -30 ; System.out.println((var2));
		byte var3 = 30 ; System.out.println(var3);
		//byte var4 = 300 ; System.out.println(var4);
			//오류 발생 : 128 이상은 저장할 수 없다
		byte var4 = 'j'; System.out.println(var4);
			//문자 -> 정수 [아스키코드 규칙]
		//p.43 char : 2바이트 [1문자 ] : 유니코드 (2바이트 : 세계 모든 문자 ) , 아스키코드 ( 영어위주 )
		char c1 = 'a'; System.out.println(c1);
		char c2 = 97; System.out.println(c2); //10진수 표션 0 ~ 9
			//정수 -> 문자 변환
		char c3 = '\u0041' ; System.out.println(c3); // 16진수 표현
		char c4 = '가'; System.out.println(c4);
		char c5 = 44032 ; System.out.println(c5);
		char c6 = '\uac00' ; System.out.println(c6);
		//진법
			//2진수 :0 , 1
			//8진수 0 ~ 7
			//10진수 0~ 9
			//16진수 0 ~ 9 a b c d e f
		
		//p.43 short : 2바이트 정수 +- 3만정도
		short num1 = 30000; System.out.println(num1 );
		//short num2 = 40000; System.out.println(num2);
		
		//p.45 int : 4바이트 정수 +-20억 정도 (정수 기본타입)
		int num2 = 10; System.out.println(num2); // 10진수
		int num3 = 012 ; System.out.println(num3); // 8진수는 앞에 0 붙이기
		int num4 = 0xA ; System.out.println(num4); //16진수는 앞에 0x 붙이기
		
		//p.46 long : 8바이트 정수  +- 20억 이상
		long num5 = 10000000000L; System.out.println(num5);
					//int 형으로 입력된다/ 끝에 L 을 붙이면 long 형으로 입력
		
		//p.47 ~ 48 float : 4바이트 / double (실수 기본타입 ) : 8바이트
		double num6 = 3.14 ; System.out.println(num6);
		float num7 = 3.14f ; 
		
		double num8 = 0.123456780123456789; System.out.println(num8);
		float num9 = 0.123456789123456789f; System.out.println(num9);
		
		//p.48 boolean : 1비트 [ true 혹은 false]
			//스위치 : on, off
		boolean bol = true; System.out.println(bol);
		
		//p.49 : 타입변환
		
			// * 크기순서 : byte -> short -> int -> long -> float -> double
		
			// 1. 자동 형변환 : 
				//작은상자에서 큰상자로 이동가능
				//큰상자에서 작은 상자로 이동 불가
		
			// 2. 강제 형변환
				//큰상자에서 작은 상자로 이동 가능한데 단: 데이터 손실이 생김.
		byte 바이트 = 10;
		int 인트 = 바이트; // 자동 형변환됌
		//short 쇼트 = 인트;	// 자동 형변환 안됌 오류
		
		//2. 강제 형변환 (캐스트)
			//큰상자에서 작은 상자로 이동 가능인데 데이터 손실이 생김
			//(변경할자료형) 변수형
		short 쇼트 = (short)인트 ; 
		
		//p.60 연습문제
			//1. 4
			//2. 1 4 5 [ 변수는 숫자로 시작할 수 없다, 예약어 [ 미리 만들어진 단어] 불가 ]
			//3. byte short	int		long
			//	 	  char 
			//				float	double
			//boolean
		//4. 타입 : int , double
		//	이름: age, price
		//	리터럴(값) : 10, 3.14
		//5. :3 
		//6. :4
			//기본 자료형 사용한 메모리는 변수		-> 메모리할당 / new x
			//클래스를 사용한 메모리는 객체			-> 메모리할당 / new o
		
		//7. : 1 [ 자료형 연산시 기본타입으로 변환]
			//1. byte + byte -> int => byte [x]
			//2. int + byte -> int => int [자동 형변환]
			//3. int + float -> int => float [자동 형변환]
			//4. int + double -> int => float [자동 형변환]
	} // m e
}// c e 
