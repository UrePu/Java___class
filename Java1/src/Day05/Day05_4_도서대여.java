package Day05;

import java.util.Scanner;

public class Day05_4_도서대여 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arrId = new String[100][2]; 
		String[][] arrBk = new String[100][2];
		for (int abc = 0; abc < arrBk.length; abc++) {
			arrBk[abc][1] = "0";
					
		}
		while(true) {
		System.out.println("---------메뉴---------");
		System.out.println("1.회원가입 2.로그인 선택:");		
		System.out.print(">>>>>>>>>>>: "); int ch1 = sc.nextInt();
		///////////////회원가입///////////
		if(ch1 == 1) {
			while(true) {

				System.out.println("--------회원가입--------");
				System.out.print("Insert ID: "); String id = sc.next();
				System.out.print("Insert PW: "); String pw = sc.next();
				
				boolean idcheck = true;
				for(int i = 0 ; i < arrId.length ; i++) {
					if(arrId[i][0] != null && arrId[i][0].equals(id)) {
						System.err.println("오류)) 중복되는 아이디가 있습니다.");
						idcheck = false;
						break;
					}
				}
				if(idcheck) {
					for(int i = 0 ; i < arrId.length ; i++) {
						if(arrId[i][0] == null) {
							arrId[i][0] = id;
							arrId[i][1] = pw;
							System.err.println("알림))회원가입 완료");
							break;
						}
					} 
					break;
				}
			}
		}
		/////////////로그인///////////
		else if(ch1 == 2) {
			System.out.println("--------로그인--------");
			System.out.print("Insert ID: "); String id = sc.next();
			System.out.print("Insert PW: "); String pw = sc.next();
			boolean lgch = true;
			for (int i = 0; i < arrId.length ; i++) {
				if (id.equals("admin") && lgch){ // 관리자 메뉴
					lgch = false;
					while(true) { //관리자 while시작
						System.out.println("--------------------------");
						System.out.println("1.도서등록 2.도서목록 3.도서삭제 4.도서 랭킹 5.로그아웃 선택");
						System.out.print(">>>>>>>>: "); int ch2 = sc.nextInt();
						
						if (ch2 == 1) {
							System.out.println("도서등록");
							System.out.print(">>>>>>: "); String addBk = sc.next();
							
							for(int y = 0; y < arrBk.length; y ++) {
								if (arrBk[y][0] != null) {
									if(arrBk[y][0].equals(addBk)) {
									System.err.println("오류)) 중복된 이름이 있습니다.");
									break;
									}
								}
								if (arrBk[y][0] == null){
									arrBk[y][0] = addBk;
									System.err.println("알림)) " + (y + 1) + " 번에 저장되었습니다");
									break;
										
								}
								
							}
						}
						else if(ch2 == 2) {//도서 목록 출력
							for (int j = 0 ; j < arrBk.length; j++) {
								if(arrBk[j][0] != null) {
									if (arrBk[j][1] == "0") {
										System.out.println(arrBk[j][0]);
									}else System.out.println(arrBk[j][0] + "\t대여중입니다");	
								}
							}
							
						}//목록 출력 끝
						else if(ch2 == 3) { // 도서삭제 
							
							System.out.println("도서삭제:");
							System.out.print(">>>>>>: "); String addBk = sc.next();
							for (int z = 0; z < arrBk.length; z ++) {
								if(arrBk[z][0].equals(addBk) && arrBk[z][0] != null && arrBk[z][1].equals("0")) {
									System.err.println(arrBk[z][0] + "책 삭제 ");
									arrBk[z][0] = null;
									break;
								}else if (!arrBk[z][1].equals("0")) {
									System.err.println("오류)) 대여자가 있는 책입니다");
									break;
								}else {System.err.println("오류)) 책이 존재하지 않습니다"); break;}
							}
						}//도서 삭제 끝
						else if(ch2 == 4) {
							
						}
						else if (ch2 == 5) {
							System.err.println("**로그아웃 되었습니다**");
							break;
							}
						else System.err.println("오류)) 알 수 없는 번호입니다");
					}
				}//관리자 if 종료
				else if(id.equals(arrId[i][0]) && pw.equals(arrId[i][1])) { // 로그인 페이지\
						if (lgch == false) break;
						System.err.println("**로그인 성공**");
						
						lgch = false;
					while(true) {
						System.out.println("--------------------------");
						System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 선택");
						System.out.print(">>>>>>>>: "); int ch2 = sc.nextInt();
					
						if(ch2 == 1) { // 도서검색
							System.out.println("책 이름 입력: ");
							System.out.print(">>>>>>>>: "); String bk = sc.next();
							boolean bkfd = true;
							for (int j = 0; j < arrBk.length ; j++) {
								if (bk.equals(arrBk[j][0])) { // 책 이름이 같을때
									bkfd = false;
									if(arrBk[j][1].equals("0")) {//책 이름이 같고 대여가 가능할때
										System.out.println(arrBk[j][0] + " 책이 대여 가능합니다");
									}else System.out.println(arrBk[j][0] +  "책이 이미 대여 되었습니다");
								}
							}
							if(bkfd) {
								System.err.println(bk + " 책을 찾을수없습니다.");
							}
						} //도서 검색 끝
						else if(ch2 == 2) { // 도서 목록 출력
							for (int j = 0 ; j < arrBk.length; j++) {
								if(arrBk[j][0] != null) {
									if (arrBk[j][1] == "0") {
										System.out.println(arrBk[j][0]);
									}else System.out.println(arrBk[j][0] + "\t대여중입니다");	
								}
							}
						}//도서 목록 출력 끝
						else if(ch2 == 3) { //도서 대여

							System.out.println("책 이름 입력: ");
							System.out.print(">>>>>>>>: "); String bk = sc.next();
							boolean bkfd = true;
							for (int j = 0; j < arrBk.length ; j++) {
								if (bk.equals(arrBk[j][0])) { // 책 이름이 같을때
									bkfd = false;
									if(arrBk[j][1].equals("0")) {//책 이름이 같고 대여가 가능할때
										System.out.println(arrBk[j][0] + " 책이 대여 가능합니다 하시겠습니까?");
										System.out.println("1. 도서 대여 2.취소");
										System.out.print(">>>>>>: ");  int bkch = sc.nextInt();
									
										if (bkch == 1) {
											System.err.println("알림)) 대여가 완료되었습니다.");
											arrBk[j][1] = id;
											break;
										}else if (bkch == 2) {
											break;
										}else System.err.println("오류)) 알 수 없는 번호입니다");
									}else System.err.println("오류)) 이미 대여 되었습니다");
								}
							}
							if(bkfd) {
								System.err.println(bk + " 책을 찾을수없습니다.");
							}
						}
						else if(ch2 == 4) { //도서 반납
							boolean re = true;
							for (int x = 0; x < arrBk.length; x++) {
								if(arrBk[x][0] != null) {
									if (arrBk[x][1].equals(id)) {
										System.out.println("---반납 도서----");
										System.out.println(arrBk[x][0]);
										arrBk[x][1] = "0";
										re = false;
									}
								}
							}
							if (re) System.err.println("오류)) 반납 가능한 도서가 없습니다");
						}
						else if(ch2 == 5) { //로그아웃
							System.err.println("**로그아웃 되었습니다**");
							break;
						}
						else System.err.println("오류)) 알 수 없는 번호입니다.");
					}
				}
			}
			if (lgch) System.err.println("오류)) 아이디 또는 비밀번호가 다릅니다.");
			
		}
		else System.err.println("오류)) 알 수 없는 번호입니다.");
		
		
		}
	}
}
