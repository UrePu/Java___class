package Day16_1;

import java.util.Scanner;

public class Front {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			try {
				System.out.println("---------�����ձ� ����---------");
				System.out.println("1.ȸ������ 2.�α��� 3.��ŷ����");
				System.out.println("----------------------------"); 
				System.out.print(">>>>>: "); int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("-------ȸ������---------");
					System.out.print("���̵� �Է�: "); String id = scanner.next();
					System.out.print("��й�ȣ �Է�: "); String pw = scanner.next();
					System.out.print("�̸� �Է�: "); String name = scanner.next();
					System.out.print("��ȭ��ȣ �Է�: "); String phone = scanner.next();
					boolean ��� = Controller.signin(id, pw, name, phone);
					if(���)System.out.println("ȸ������ ����");
					else System.err.println("�ߺ��� ���̵�");
				}
				else if(ch == 2) {
					System.out.print("���̵� �Է�: "); String id = scanner.next();
					System.out.print("��й�ȣ �Է�: "); String pw = scanner.next();
					boolean ��� = Controller.login(id, pw);
					if(���) {
						System.out.println("�α��� ����");
						game(id);
					}
					else System.err.println("���̵� Ȥ�� ��й�ȣ�� Ʋ���ϴ�.");
				}
				else if(ch == 3) {
					
				}
				else System.out.println("�ùٸ� ���� �Է�");
			}catch(Exception e) {}
		}
	}

	private static void game(String id) {
		try {
			while(true) {
				System.out.println("---------�����ձ� ����---------");
				System.out.println("1. ���� 2. �� �������� 3.�α׾ƿ�");
				System.out.println("----------------------------");
				System.out.print(">>>>>: "); int ch = scanner.nextInt();
				
				if(ch == 1) {
						System.out.println("���� ����");
					while(true) {
							System.out.println("---------�ܾ� �Է�---------");
							System.out.print(">>>>>: "); String word = scanner.next();
							boolean ��� = Controller.gameStart(id, word);
							if(���) {
								
							}else {
								System.err.println("���� ����");
								int index = 0;
								for(String temp : Controller.wordList) {
									if(temp != null) {
										Controller.wordList[index] = null;
										index++;
									}
								}
								System.out.println("�� ����: " + (index -1));
								Controller.save(id, index -1);
								break;
							}
						}
					}
				
				else if(ch == 2) {
					System.out.println("---------���� ����---------");
					Controller.seeScore(id);
				}
				else if(ch == 3) {break;}
				else System.out.println("�ùٸ� ���� �Է�");
			}
		}catch(Exception e) {}
	}
}
