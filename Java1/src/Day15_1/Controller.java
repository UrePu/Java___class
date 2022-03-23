package Day15_1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Controller {
	
	// 1. 배열 경우 
	//public static Car[] carlist = new Car[100];
	// 2. 리스트 경우
	public static ArrayList<Car> carlist = new ArrayList<>(); 

	static LocalDate ld = LocalDate.now();
	static LocalTime lt = LocalTime.now();
	
	// 입차 메소드 
	public static boolean 입차( String 차량번호 ) {
		// 입차 코드 작성 
			// 1. 입력받은 차량번호(인수) 가져온다.
			// * 차량번호 중복체크
			for(Car temp : carlist) {
				if(temp != null) {
					if(temp.get차량번호().equals(차량번호)) {
						return false;
					}
				}
			}
			// 2. 입차날짜(현재날짜) 을 구한다( ????? : )
			
			// 3. 입차시간(현재시간) 을 구한다( ????? : )
			
			// * 출차시간 , 금액은 출차시 x 
			Car 차량 = new Car(ld, 차량번호, lt);
			// 4. 차량번호,입차날짜,입차시간 => 3개변수 -> 1객체화
			carlist.add(차량);
			// 5. 차량객체를 배열이나 리스트 에 저장 
		return true;
	}
	// 출차 메소드 
	public static boolean 출차( String 차량번호 ) {
		// 출차 코드 작성
			// 1. 입력받은 차량번호(인수) 가져온다.
			// 2. 배열 or 리스트내 동일한 차량번호를 찾아서
		
		for(Car temp : carlist) {
			if(temp != null) {
				if(temp.get출차시간() !=null) {
					return false;
				}
				if(temp.get차량번호().equals(차량번호)) {
					long 출차시간 =  ChronoUnit.MINUTES.between(temp.get입차시간(), lt);
					int 금액 = 0;
					if(출차시간 >= 30) {
						금액 = ( (int)((출차시간-30) / 10 ) * 1000);
					}
					temp.set출차시간(lt);
					temp.set금액(금액);
					return true;
				}
			}
		}
			// 3. 출차시간(현재시간) 을 구한다 (????? : )
			// 4. 계산 [ 출차시간 - 입차시간 => (분-30)/10 *1000  ]
			// 5. (수정)찾은 객체내 출시간과 금액을 대입한다.
		return false;
	}
	public static boolean 출차테스트( String 차량번호, int 출차선택 ) {
		// 출차 코드 작성
			// 1. 입력받은 차량번호(인수) 가져온다.
			// 2. 배열 or 리스트내 동일한 차량번호를 찾아서 



		for(Car temp : carlist) {
			if(temp != null) {
				if(temp.get차량번호().equals(차량번호)) {
					if(temp.get출차시간() !=null) {
						return false;
					}
					long 출차시간 =  ChronoUnit.MINUTES.between(temp.get입차시간(), lt.plusMinutes(출차선택));
					int 금액 = 0;
					if(출차시간 >= 30) {
						금액 = ( (int)((출차시간-30) / 10 ) * 1000);
					}
					temp.set출차시간(lt.plusMinutes(출차선택));
					temp.set금액(금액);
					return true;
				}
			}
		}
			// 3. 출차시간(현재시간) 을 구한다 (????? : )
			// 4. 계산 [ 출차시간 - 입차시간 => (분-30)/10 *1000  ]
			// 5. (수정)찾은 객체내 출시간과 금액을 대입한다.
		return false;
	}
	
}
