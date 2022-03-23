package Day15_1;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			try {
		
				LocalDate ld = LocalDate.now();
				LocalTime lt = LocalTime.now();
				System.out.println("----------------------주차 현황 표----------------------");
				System.out.println("\t\t현재 시간: " + ld + " " + lt.getHour() + ":" + lt.getMinute());
				System.out.println();
				System.out.println("   날짜\t     차량번호\t입차시간\t 출차시간\t 금액");
				for(Car temp : Controller.carlist) {
					if(temp != null) {
						
						if(temp.get출차시간() == null && temp.get차량번호() != null) {
							System.out.println(temp.get날짜() + "  " + temp.get차량번호() + "    "
							+ temp.get입차시간().format(DateTimeFormatter.ofPattern("hh:mm"))+ "\t 주차 중\t 정산 전"
							);
						}else if(temp.get출차시간() != null && temp.get차량번호() != null) {
							DecimalFormat decFormat = new DecimalFormat("###,###");
							String str = decFormat.format(temp.get금액());
							System.out.println(temp.get날짜() + "  " + temp.get차량번호() + "    "
							+ temp.get입차시간().format(DateTimeFormatter.ofPattern("hh:mm")) + 
							"\t "+temp.get출차시간().format(DateTimeFormatter.ofPattern("hh:mm"))+"\t"+str
							);
						}
					}
				}
				///	
				
				System.out.println();
				System.out.println("------------------------------------------------------");
				System.out.println("\t1.입차\t2.출차\t3.출차테스트용");
				int ch = scanner.nextInt();
			
				if( ch == 1 ) {
					// 1. 차량번호를 입력받는다.
						// 입력 
					// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
					// 3. 메소드 결과 에 따른 출력 
					System.out.println("입차를 선택하셨습니다.");
					System.out.println("차량 번호를 입력해 주세요");String 차량번호 = scanner.next();
					boolean 결과 = Controller.입차(차량번호);
					if(결과) System.out.println("정상적으로 입차 완료되었습니다");
					else System.err.println("이미 입차된 차량입니다.");
				}else if( ch == 2 ){
					// 1. 차량번호를 입력받는다.
						// 입력
					// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
					// 3. 메소드 결과 에 따른 출력
					System.out.println("출차를 선택하셨습니다.");
					System.out.println("차량 번호를 입력해 주세요");String 차량번호 = scanner.next();
					boolean 결과 = Controller.출차(차량번호);
					if(결과)System.out.println("출차성공");
					else System.err.println("이미 출차된 차량입니다");

				}else if( ch == 3 ){
						// 1. 차량번호를 입력받는다.
						// 입력
					// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
					// 3. 메소드 결과 에 따른 출력
					System.out.println("출차를 선택하셨습니다.");
					System.out.println("차량 번호를 입력해 주세요");String 차량번호 = scanner.next();
					System.out.println("몇분뒤에 출차할지 선택: "); int 출차시간선택 = scanner.nextInt();
					
					boolean 결과 = Controller.출차테스트(차량번호,출차시간선택);

					if(결과)System.out.println("출차성공");
					else System.err.println("이미 출차된 차량입니다");
			}


				else System.out.println("1번과 2번중에 골라주세요.");
				}catch (Exception e){
					scanner.next();
					System.out.println("오류");
				}
			
			
		}
		
	} // 
} // 
