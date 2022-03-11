package Day08;

public class Day08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p.238: static
		// 정적변수
		// 공용적인 데이터 = 프로그램 전반적으로 사용되는 메모리
		
		// * 클래스 내필드, 메소드(멤버) 접근 방법.
			//1. (static 멤버가 아닐때)객체 생성 -> 객체.멤버
				// 객체가 생성될때 new 연산자로 객체(내 멤버 포함) 메모리 할당
		
		Calculator calc = new Calculator();
		
		System.out.println("객체를 이용한 멤버 접근 : " + calc.pi);
			//(static 멤버 일때) 1. 클래스명.멤버
		
		System.out.println("객체 없이 멤버 접근: " + Calculator.pi);
		
		double result = 10 * 10 * Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		System.out.println("result2: " +result2);
		int result3 = Calculator.minus(10, 5);
		System.out.println("result3: " +result3);
	}

}
