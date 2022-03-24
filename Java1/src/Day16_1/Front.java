package Day16_1;

import java.util.Scanner;

public class Front {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			try {
				System.out.println("---------끝말잇기 게임---------");
				System.out.println("1.회원가입 2.로그인 3.랭킹보기");
				System.out.println("----------------------------"); 
				System.out.print(">>>>>: "); int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("-------회원가입---------");
					System.out.print("아이디 입력: "); String id = scanner.next();
					System.out.print("비밀번호 입력: "); String pw = scanner.next();
					System.out.print("이름 입력: "); String name = scanner.next();
					System.out.print("전화번호 입력: "); String phone = scanner.next();
					boolean 결과 = Controller.signin(id, pw, name, phone);
					if(결과)System.out.println("회원가입 성공");
					else System.err.println("중복된 아이디");
				}
				else if(ch == 2) {
					System.out.print("아이디 입력: "); String id = scanner.next();
					System.out.print("비밀번호 입력: "); String pw = scanner.next();
					boolean 결과 = Controller.login(id, pw);
					if(결과) {
						System.out.println("로그인 성공");
						game(id);
					}
					else System.err.println("아이디 혹은 비밀번호가 틀립니다.");
				}
				else if(ch == 3) {
					
				}
				else System.out.println("올바른 숫자 입력");
			}catch(Exception e) {}
		}
	}

	private static void game(String id) {
		try {
			while(true) {
				System.out.println("---------끝말잇기 게임---------");
				System.out.println("1. 시작 2. 내 점수보기 3.로그아웃");
				System.out.println("----------------------------");
				System.out.print(">>>>>: "); int ch = scanner.nextInt();
				
				if(ch == 1) {
						System.out.println("게임 시작");
					while(true) {
							System.out.println("---------단어 입력---------");
							System.out.print(">>>>>: "); String word = scanner.next();
							boolean 결과 = Controller.gameStart(id, word);
							if(결과) {
								
							}else {
								System.err.println("게임 종료");
								int index = 0;
								for(String temp : Controller.wordList) {
									if(temp != null) {
										Controller.wordList[index] = null;
										index++;
									}
								}
								System.out.println("내 점수: " + (index -1));
								Controller.save(id, index -1);
								break;
							}
						}
					}
				
				else if(ch == 2) {
					System.out.println("---------점수 보기---------");
					Controller.seeScore(id);
				}
				else if(ch == 3) {break;}
				else System.out.println("올바른 숫자 입력");
			}
		}catch(Exception e) {}
	}
}
