package Day04;

import java.util.Scanner;

public class Day04_2 { // cs
	public static void main(String[] args) {//ms
		//자판기 프로그램
			/*1. 메뉴판 [1. 콜라 (300) 2. 환타(200) 3. 사이다(100) 4.결제 ]
			 * 		메뉴판에서 제품 선택하면장바구니에 넣기
			 * 		재고가 부족하면 알림(재고부족)
			 * 2. 초기 재고 [제품당 10개씩]
			 * 3. 결제시 금액ㅇ비력받아 결제액 만큼 차감후 잔돈 출력.
			 * 		1.투입한 금액이 부족하면 결제 취소[금액 부족]
			 */
		// 공통 변수[ 모든 괄호내에서 사용하는 변수들]
		Scanner sc = new Scanner(System.in);
		int 콜라재고 =10; int 환타재고 =10; 	int 사이다재고=10; // 2. 재고변수
		int 콜라구매수=0;	int 환타구매수 = 0;int 사이다구매수=0;	// 3. 장바구니 
		
		while(true) { // 프로그램 시작 [ 무한루프 ]
			System.out.println("------------- 메뉴 ------------");
			System.out.println(" 1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제 ");
			System.out.print(">>>>>> 선택 : "); int 선택 = sc.nextInt();
			
			if( 선택 == 1 ) { // 콜라 구매
				if( 콜라재고 == 0 ) { // 콜라재고가 0이면 구매불가 
					System.err.println(" 알림)) 재고가 없습니다 .재고 준비중");
				}
				else { // 콜라재고가 있으면 구매가능 
					System.err.println(" [[ 콜라 담았습니다.]]");
					콜라구매수++; // 장바구니에 콜라 담기 
					콜라재고--;	// 콜라재고 차감
				}
			}// 콜라 구매 end 
			else if( 선택 == 2 ) { // 환타 구매 

				if( 환타재고 == 0 ) { // 환타재고가 0이면 구매불가 
					System.err.println(" 알림)) 재고가 없습니다 .재고 준비중");
				}
				else { // 환타재고가 있으면 구매가능 
					System.err.println(" [[ 환타 담았습니다.]]");
					환타구매수++; // 장바구니에 콜라 담기 
					환타재고--;	// 콜라재고 차감
				}
			}// 환타 구매 end 
			else if( 선택 == 3 ) { // 사이다 구매 

				if( 사이다재고 == 0 ) { // 사이다재고가 0이면 구매불가 
					System.err.println(" 알림)) 재고가 없습니다 .재고 준비중");
				}
				else { // 사이다재고가 있으면 구매가능 
					System.err.println(" [[ 사이다 담았습니다.]]");
					사이다구매수++; // 장바구니에 콜라 담기 
					사이다재고--;	// 콜라재고 차감
				}
			}// 사이다 구매 end 
			else if( 선택 == 4 ) { // 결제 
				System.out.println("------------- 결제 제품 목록 ------------");
				System.out.println("제품명\t수량\t금액");
				if (콜라구매수 > 0)System.out.println("콜라\t" + 콜라구매수 + "\t" + (콜라구매수 * 300));
				if (환타구매수 > 0)System.out.println("환타\t" + 환타구매수 + "\t" + (환타구매수 * 200));	
				if (사이다구매수 > 0)System.out.println("사이다\t" + 사이다구매수 + "\t" + (사이다구매수 * 100));
				int 총결제액 = (콜라구매수*300)+ (환타구매수*200) + (사이다구매수*100) ;
				System.out.println(" 제품 총 결제액 : " + 총결제액 );
				System.out.println("-------------------------------------");
				System.out.println("1.결제 2.취소");
				System.out.print(">>>>>>: ");int 선택2 = sc.nextInt();
				if(선택2 == 1) { //결제
					while(true) { // 무한루프 [ 종료조건 : 금액이 총결제액보다 크면 ]  
						System.err.println(" 알림)) 금액 : "); int 금액 = sc.nextInt();
						
						if( 금액 < 총결제액 ) { // 결제불가 -> 재입력 
							System.err.println(" 알림)) 금액이 부족합니다. 다시 금액 투여 ");
						}
						else { // 금액이 더크면 
							System.err.println(" 알림)) 구매완료  주문번호 : OOOO번");
							System.err.println(" 알림)) 잔돈 출력 : " + ( 금액 - 총결제액 )+"원" );
							콜라구매수 =0; 환타구매수=0; 사이다구매수=0;				// 구매수 초기화 
							break; // while 탈출
						}
					}
				}
				else if (선택2 == 2) { //취소
					System.out.println("알림) 구매목록 모두 지우기");
					콜라재고 += 콜라구매수;
					환타재고 += 환타구매수;
					사이다재고 += 사이다구매수;		
					콜라구매수 = 0;
					환타구매수 = 0;
					사이다구매수 = 0;
				}
				else {
					System.err.println(" 알림)) 알수없는 행동입니다.");					
				}
			} // 결제 end 
			else {
				System.err.println(" 알림)) 알수없는 행동입니다.");
			} 
		}
	}//me
}//ce
