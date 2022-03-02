package Day02;

public class Day02_4 {

	public static void main(String[] args) {
		
		//p.64 연산자
		/*
		 * 
		 * 1. 산출
		 * 	// 1. + (더하기), - (빼기), * (곱하기) / (나누기 -=> 몫) % ( 나누기 => 나머지)
		 * 2. 비교
		 * 		> 초과	 < 미만
		 * 		>= 이상	 <= 이하
		 * 		== 같다	 != 같지않다 [다르다]	
		 * 3. 논리
		 * 		&&이면서 면서 이고 모두 그리고 and
		 * 		|| 이거나 거나 또는 하나라도 or
		 * 		!부정[반대] true -> false / false -> true
		 * 4. 대입
		 * 		= : 오른쪽값이 왼쪽으로 이동[저장]
		 * 		+= : 오른쪽값에 왼쪽값을 더해서 왼쪽값에 대입
		 * 			변수명 = 변수명 + 10
		 * 			변수명 += 10
		 * 			위 두개는 같은 식임
		 * 		-+ *= /= %=
		 * 5. 증감
		 *	//1. ++ : 1증가
		 *	//2. 선위 증가/감소 : 먼저 증가하고 다른 명령어처리
		 *	//3. 후위 증가/감소 : 다른 명령어 처리후에 증가		 
		 * 6. 삼항연산자[조건연산자]
		 * 	조건식 ? 참: 거짓
		 * 
		 */
		int 정수1 = 10; int 정수2 = 20; // 각각 10과 20을 저장하는 2개의 변수 선언
		System.out.println("더하기 : " + 정수1 + 정수2 ); //문자열 + 정수 >> 연결 연산자
		System.out.println("더하기 : " + (정수1 + 정수2)); // 문자열 + (정수1 + 정수2)
		System.out.println("빼기 : " + (정수1 - 정수2));
		System.out.println("곱하기 :" + (정수1 * 정수2));
		System.out.println("나누기(몫) : " + (정수1/정수2));
		System.out.println("나머지 : " + (정수1%정수2));
		
		//증감연산자 예제
		정수1++; //변수명뒤에 ++ 할 경우 해당 변수내 데이터에 +1
		System.out.println("증가 : " + 정수1);
		정수1--; // 변수명 뒤에 ++할경우 해당 변수내 데이터에 +1
		System.out.println("감소 : " + 정수1);
		
		System.out.println("선위증가 : " + ++정수1);
		System.out.println("후위증가 : " + 정수1++);
		System.out.println(정수1);
			//명령어 처리는 동시처리 불가능 -> 처리 순서가 존재
			// ++변수 : 먼저 증가후에 print 실행
			// 변수++ : print 실행후에 증가
		
		System.out.println("선위감소 : " + --정수1);// 1감소 후에 출력 => 11 출력
		System.out.println("후위감소 : " + 정수1--);// 출력 후 1감소 => 11 출력
		System.out.println("후위감소 후 : " + 정수1);//10 출력
		
		//비교연산자 예제
		System.out.println("이상 : " + (정수1 >= 정수2));	// 10 >= 20 이다 : 거짓
		System.out.println("이하 : " + (정수1 <= 정수2));	// 10 <= 20 : 참
		System.out.println("초과 : " + (정수1 > 정수2));	// 10 > 20 : 거짓
		System.out.println("미만 : " + (정수1 < 정수2));	// 10 < 20 : 참 
		System.out.println("같다 : " + (정수1 == 정수2));	// 10 == 20 : 거짓
		System.out.println("같지않다 : " + (정수1 != 정수2));	// 10 != 20 : 참
		
		// 논리연산자 예제
			// and && : 2개 이상의 비교연산자가 모두 true => 결과도 true 아니면 false
			// or || : 2개 이상의 비교연산자가 하나라도 ture => 결과도 true 아니면 false
		
		int 정수3 = 30 ; int 정수4 = 40;
		System.out.println("and : " + ( 정수1 >= 정수2 && 정수4 >= 정수3));
										//10 >= 20 and 40 >= 30
											//false		true => 결과 false
		System.out.println("or : " + ( 정수1 >= 정수2 || 정수4 >= 정수3));
										//false		or	true => 결과 true
		System.out.println("not부정 : " + !( 정수1 >= 정수2 || 정수4 >= 정수3));
		
		//대입연산자 예제
		
		정수1 = 정수1 + 10;		System.out.println("정수1 : " + 정수1);
		정수1 += 10;				System.out.println("정수1 : " + 정수1);
		
		System.out.println("정수1 : " + (정수1 -= 10));
		System.out.println("정수1 : " + (정수1 /= 10));
		
		//조건연산자 예제
		int 점수 = 85;
		char 등급 = 점수 > 90 ? 'A' : 'B';
			//조건식 			? 참(true) : 거짓(false)
			//점수 변수가 90 초과하면 A 대입 아니면 B 대입
		System.out.println("등급: " + 등급);
		char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C';
			//조건식 			? 참: 거짓 [조건식 ?	참 : 거짓]
			//점수 변수가 90 초과하면 A 대입 아닐때 점수 변수가 80을 초과하면 B 아니면 C
	}
}
