package Day01;

import java.util.Scanner;

public class Day01_3 { // c s
	public static void main(String[] args) { // m s
		//입력
			//키보드 ---->> 컴퓨터
			//Scanner : 입력 클래스 [ 입력에 관련된 기능 제공 ]
				//* 키보드로 입력받은 데이터를 저장하는 객체.
		//1.입력 객체 생성
		Scanner 입력객체 = new Scanner(System.in);
		//1. Scanner : 입력
			//2. 입력객체 : 객체 이름
				//3. new : 메모리 할당
					//4. Scanner(): 생성자
						//5. System.in : 입력. [ 키보드 ----> 컴퓨터 ]
						//* System.out : 출력. [ 컴퓨터 ----> 모니터 ]
		//2. 입력할 내용을 안내
		System.out.print("이름 입력 :");
		//3. 입력받은 데이터를 입력 객체에서 가져와서 String 객체에 저장
		String 이름 = 입력객체.next();
		//1. String : 문자열 클래스
			//2. 이름 : 객체이름
				//3. 입력객체.next() : 입력객체 내 저장된 데이터 가져오기.
		//4. String 객체에 저장된내용을 출력한다.
		System.out.println("입력하신 이름은 : " + 이름);
			//"문자열" + 객체명[변수명]
				// + : 1. 더하기 연산자, 2. 연결 연산자(서로 다른 형태를 연결)
	}// m e
}//c e
