package Day05;

import java.util.Scanner;

/* ȸ���� �湮�� ���α׷�
	 * 		1. �ʱ�޴� [1. ȸ������ 2. �α���]
	 * 		2. �α��� [���̵�, ��й�ȣ �����ϸ� �α��� ó��
	 * 2. �α��ν� �޴�[1.�湮�Ͼ��� 2.�α׾ƿ�]
	 * 		1.�湮�Ͼ��� [����, ����, �ۼ���(�α��ξ��̵�)
	 * 		2.�α׾ƿ� [ �ʱ�޴��� ���ư���]
	 */
public class Day05_2 {
	public static void main(String[] args) {
		//�غ�
		Scanner sc = new Scanner(System.in);
		//�� 100��[id,pw,name] �����ϴ¹迭
		String[][] memlist = new String[100][3];
		//�湮�� 100��[title, contents, writer ] �����ϴ¹迭
		String[][] boardlist = new String[100][3];
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("-----ȸ���� �湮��-----");
			System.out.println("--------------------");
			System.out.print("1. ȸ������ 2. �α��� ����:"); int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("-------ȸ������������------");
				System.out.print("Member Id : ");		String id = sc.next();
				System.out.print("Member Pw : ");		String pw = sc.next();
				System.out.print("Member Name : ");		String name = sc.next();
				
				//String 3�� ������ �ӷ¹޾� memberlist 2���� �迭�� ����
					//1. �����[���� = 0, ��ü(���ڿ�) = null ] �� ã�Ƽ� ����
					//2. ���̵� �ߺ�üũ
				boolean idcheck = true ;
				for(int i = 0 ; i < memlist.length ; i++) {
					if(memlist[i][0] != null && memlist[i][0].equals(id)) {
						System.err.println("�˸�))�ߺ��Ǿ����ϴ�");
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
							System.err.println("�˸�))ȸ������ �Ϸ�");
							break;
						}
					}
				}
			}
			else if(ch == 2) {
				System.out.println("-------�α��� ������-------");
				System.out.print("Member Id : ");		String id = sc.next();
				System.out.print("Member Pw : ");		String pw = sc.next();
				boolean logincheck = false;
				for(int i = 0 ; i < memlist.length ; i++) {
					if(memlist[i][0].equals(id) && memlist[i][1].equals(pw)) {
						System.err.println("�˸�))�α��� ����");
						logincheck = true;
						System.out.println("----------------");
						System.out.println("------�湮��-----");
						System.out.println("��ȣ\t�ۼ���\t����\t����");
						for( int j = 0 ; j<boardlist.length ; j++  ) { // �Խù� �迭 �ݺ��� ó�� 
							if( boardlist[j][0] != null ) { // �Խù��� ���� �ε����� ���� 
								System.out.printf("%d\t%s\t%s\t%s \n" , 
										j , 
										boardlist[j][2] , 
										boardlist[j][0] , 
										boardlist[j][1] );
							}
						}
						System.out.print("1. �湮�� ����� 2.�α׾ƿ�: ����: "); 
						int ch2 = sc.nextInt();
						if(ch2 == 1) {
							System.out.println("-------------- �۾��� -------------");
							System.out.print(" title : ");		String title = sc.next(); // ���� 
							System.out.print(" content : ");	String content = sc.next(); // �׿� 
							// ���� 
							for( int j = 0 ; j<boardlist.length ; j++ ) {
								if( boardlist[j][0] == null  ) { // �迭�� j��° �ε��� �Խù��� �����̸�
									boardlist[j][0] = title;
									boardlist[j][1] = content;
									boardlist[j][2] = id; // �α��ν� ���� id�� ����
									System.err.println(" �˸�]] �湮���� �ۼ��Ǿ����ϴ�.");
									break;
								}
							}}
						else if(ch2 == 2) {
							System.err.println("�˸�)) �α׾ƿ�");
							break;
						}
						else System.err.println("�˸�)) �˼����� ��ȣ�Դϴ�");
						
						
					}
				}
				if( logincheck == false ) System.err.println(" �˸�]] ȸ�������� ���ų� �ٸ��ϴ�.");
			} 
			else {System.err.println("�˸�)) �˼����� ��ȣ�Դϴ�");}
		}
	}
}
