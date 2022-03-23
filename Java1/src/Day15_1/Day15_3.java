package Day15_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Day15_3 {
	
	public static void main(String[] args) {
		
		// 주차 현황 프로그램 설계
			// 1. 파일 구분
				// M : 모델(데이터/정보)	C : 컨트롤(이벤트작동)	V : 사용자화면[입출력]
			// 2. 모델 선택 
				// 1.자동차클래스 [ Car 클래스 ] 
					// 클래스 설계 [ 필드(기록) , 생성자(1.빈 2.풀) , 메소드( set , get ) ]
						// 필드 : 날짜 , 차량번호 , 입차시간 , 출차시간 , 금액
						// 자료형: Localdate , String , Localtime , LocalTime , int 
			// 3. 이벤트 선택 [ Controller 클래스 ] 
				// 1. 입차 , 2. 출차 
					// 입차 메소드 : 차량번호 를 넣어서 주차성공하면 성공 주차실패하면 실패
					// 출차 메소드 : 차량번호 를 넣어서 출차성공하면 성공 출차실패하면 실패 
				// * 메소드 만들기 : 1. static 사용할지말지 2.인수,반환 파악 
			// 4. 모델 <--컨트롤러--> 뷰
				// 1. 화면구현 [ App 클래스 ] 
				// 2. 버튼구현
				// 3. 입출력 구현
		
			// * 추가
			//		1. 배열/리스트 사용여부 판단 
			// 		2. DB , 파일처리 사용여부 판단 
		
		
		while(true) {
		}
		
		
		
	}

}
