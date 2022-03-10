package Day06;

public class Korean {
	// * Korean 클래스 선언
	
	//1. 필드
	String nation = "대한민국";
		//국가 변수 기본값 대한민국
	String name ;
	
	String ssn;
	//2. 생성자
		// 조건1: 생성자 이름 == 클래스 이름 동일
		// 조건2:  외부로부터 들어오는 매개값[인수] 선언
		// 조건3: 동일한 생성자 이름을 가질 수 없다.
				// 오버로딩: 동일한 이름일 경우 재정의
	Korean(){}
	Korean(String n){
		name = n;
	}
	
	
	Korean(String n, String s){
		name = n;
		ssn = s;
	}
	Korean(String nation, String name, String ssn){
		
	}
	//3. 메소드
}
