

//확대 축소 Ctrl + (+) or (-)
//주석처리 ( 컴파일 제외 )
	//1. //슬래시 2번
	//2. /* 여러줄 */
//TAB : 들여쓰기 [ 5칸 이동 ]
package Day01; // 패키지명 [ 소스파일들의 폴더]


public class Day01_1 { // c s
	//public : 접근제한자
		//class : 클래스 선언
			//Day01_1 : 클래스 이름
	// * 모든 곳에서 사용하는 Day01_1 이라는 이름을 갖는 클래스 선언
		//{ : 시작 } : 끝
	//1. class { } 안에서 코드 작성한다. [ class 밖에서 작성 불가 ]
	//2. 실행 코드 main 함수
		//main 입력후 Ctrl + Space 자동완성
	public static void main(String[] args) { //main s
		// public : 접근제한자
			//static : 정적변수
				//void : 반환값이 없다
					//main 함수 : 메인 스레드를 가지고 있는 함수
					//스레드 : 코드를 읽어주는 흐름
		// * main 함수 안에 작성된 코드는 실행된다.
		//syso -> ctrl + space
		System.out.println("Hello World"); //고급언어
		//컴파일 [ ctrl + F11 ]
			//저장 [ ctrl + s ]
	} // main e
	
} // c e
