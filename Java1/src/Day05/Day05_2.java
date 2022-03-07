package Day05;

import java.util.Scanner;

/* 회원제 방문록 프로그램
	 * 		1. 초기메뉴 [1. 회원가입 2. 로그인]
	 * 		2. 로그인 [아이디, 비밀번호 동일하면 로그인 처리
	 * 2. 로그인시 메뉴[1.방문록쓰기 2.로그아웃]
	 * 		1.방문록쓰기 [제목, 내용, 작성자(로그인아이디)
	 * 		2.로그아웃 [ 초기메뉴로 돌아가기]
	 */
public class Day05_2 {
	public static void main(String[] args) {
		//준비
		Scanner sc = new Scanner(System.in);
		//원 100명[id,pw,name] 저장하는배열
		String[][] memlist = new String[100][3];
		//방문록 100개[title, contents, writer ] 저장하는배열
		String[][] boardlist = new String[100][3];
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("-----회원제 방문록-----");
			System.out.println("--------------------");
			System.out.print("1. 회원가입 2. 로그인 선택:"); int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("-------회원가입페이지------");
				System.out.print("Member Id : ");		String id = sc.next();
				System.out.print("Member Pw : ");		String pw = sc.next();
				System.out.print("Member Name : ");		String name = sc.next();
				
				//String 3개 변수를 임력받아 memberlist 2차원 배열에 저장
					//1. 빈공간[정수 = 0, 객체(문자열) = null ] 을 찾아서 저장
					//2. 아이디 중복체크
				boolean idcheck = true ;
				for(int i = 0 ; i < memlist.length ; i++) {
					if(memlist[i][0] != null && memlist[i][0].equals(id)) {
						System.err.println("알림))중복되었습니다");
						idcheck = false;
						break;
					}
				}
				if(idcheck) {
					for(int i = 0 ; i < memlist.length ; i++) {
						if(memlist[i][0] == null) {
							memlist[i][0] = id;
							memlist[i][1] = pw;
							memlist[i][2] = name;
							System.err.println("알림))회원가입 완료");
							break;
						}
					}
				}
			}
			else if(ch == 2) {
				System.out.println("-------로그인 페이지-------");
				System.out.print("Member Id : ");		String id = sc.next();
				System.out.print("Member Pw : ");		String pw = sc.next();
				boolean logincheck = false;
				for(int i = 0 ; i < memlist.length ; i++) {
					if(memlist[i][0].equals(id) && memlist[i][1].equals(pw)) {
						System.err.println("알림))로그인 성공");
						logincheck = true;
						System.out.println("----------------");
						System.out.println("------방문록-----");
						System.out.println("번호\t작성자\t제목\t내용");
						for( int j = 0 ; j<boardlist.length ; j++  ) { // 게시물 배열 반복문 처리 
							if( boardlist[j][0] != null ) { // 게시물이 없는 인덱스는 제외 
								System.out.printf("%d\t%s\t%s\t%s \n" , 
										j , 
										boardlist[j][2] , 
										boardlist[j][0] , 
										boardlist[j][1] );
							}
						}
						System.out.print("1. 방문록 남기기 2.로그아웃: 선택: "); 
						int ch2 = sc.nextInt();
						if(ch2 == 1) {
							System.out.println("-------------- 글쓰기 -------------");
							System.out.print(" title : ");		String title = sc.next(); // 제목 
							System.out.print(" content : ");	String content = sc.next(); // 네용 
							// 저장 
							for( int j = 0 ; j<boardlist.length ; j++ ) {
								if( boardlist[j][0] == null  ) { // 배열내 j번째 인덱스 게시물이 공백이면
									boardlist[j][0] = title;
									boardlist[j][1] = content;
									boardlist[j][2] = id; // 로그인시 사용된 id를 대입
									System.err.println(" 알림]] 방문록이 작성되었습니다.");
									break;
								}
							}}
						else if(ch2 == 2) {
							System.err.println("알림)) 로그아웃");
							break;
						}
						else System.err.println("알림)) 알수없는 번호입니다");
						
						
					}
				}
				if( logincheck == false ) System.err.println(" 알림]] 회원정보가 없거나 다릅니다.");
			} 
			else {System.err.println("알림)) 알수없는 번호입니다");}
		}
	}
}
