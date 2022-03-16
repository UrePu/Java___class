package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp {
	/*
	 *  ��ȸ���� �Խ���/��� ���α׷� [ ����ó�� , ����ó�� , ����Ʈ ]
	 * 		// [m]�Խù� Ŭ���� 
	 * 				// ���� , ���� , �н����� , �ۼ��� , �ۼ��� , ��ȸ�� , ��۸���Ʈ
	 * 		// [m]��� Ŭ���� 
	 * 				// ���� , �н����� , �ۼ��� , �ۼ��� 
	 * 		// [c]��Ʈ�ѷ� Ŭ����
	 * 				// 1.��� 2.���� 3.���� 4.���� 5.���� 6.��۾���
	 * 				// 7.�Խù����� 8.�Խù��ҷ����� 9.������� 10.��ۺҷ����� 
	 * 		// [v]Day11_4_BoardApp Ŭ���� 
	 * 				// ����� [ �Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ���� ] 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Controller.load();
		while(true) {
			try { // ���ܹ߻� : ����ڰ� �����Է½� ���ܹ߻�!!! -> catch �̵� 
				System.out.printf("%s\t%10s\t%10s\t%10s\t%2s\t\n" , "��ȣ", "����" , "�ۼ���", "�ۼ���", "��ȸ��");
				int i = 0;
				for(Board board : Controller.boadlist) {
					System.out.printf("%s\t%10s\t%10s\t%10s\t%2s\t\n" , i, board.getTitle() , board.getWriter(),
							board.getDate(), board.getViewcount());
					i++;
				}
				// ��ü���� �޼ҵ�ȣ���� �Ǵ����� : static�޼ҵ� �̱⶧����
				System.out.print("1.���� 2.���� ���� : ");
				int ch = scanner.nextInt();
				if( ch == 1 ) {
					System.out.println(" *** �Խù� ��� ***");
						//nextLine(): �������� �Է°��� [ ����: nextLine �տ� �Ϲ� next �ϳ��� �����]
						//�ذ���: �Ϲ� next �� nextLine ���̿� nextLine ���̸� �߰�
					scanner.nextLine();
					System.out.print("����: ");	String ���� = scanner.nextLine();
					System.out.print("����: ");	String ���� = scanner.nextLine();
					System.out.print("�ۼ���: ");	String �ۼ��� = scanner.next();
					System.out.print("��й�ȣ[����/������]: ");	String ��й�ȣ = scanner.next();
					Controller.write(����, ����, �ۼ���, ��й�ȣ);
				}
				else if( ch == 2 ) {
					//�ش� �Խù� ��ȣ[�ε���]�� �Է¹޾� �Խù� ���� ��� ���
					System.out.println("�Խù� ��ȣ: "); int index = scanner.nextInt();
					
					Board temp = Controller.boadlist.get(index);
					
					System.out.println("*** �Խù� ���� ***");
					System.out.println("����:  " + temp.getTitle());
					System.out.println("�ۼ���: " + temp.getWriter());
					System.out.println("����: " + temp.getContent());
					
					//�޴�
					System.out.print("1. �ڷΰ��� 2. ���� 3. ���� 4.��۾��� ����: "); int ch2 = scanner.nextInt();
					
					if (ch2 == 1) {}
					else if (ch2 == 2) {
						System.out.print("��й�ȣ �Է�: "); String pwd = scanner.next();
						scanner.nextLine();
						System.out.print("���� ����: "); String title = scanner.nextLine();
						System.out.print("���� ����: ");  	String content = scanner.nextLine();
						boolean resault = Controller.update(index , pwd, title, content);
						
						if(resault) {
							System.out.println("���� ����");
						}else {System.out.println("���� ����)) ��й�ȣ�� �ٸ��ϴ�");}
						}
					else if (ch2 == 3) {
						System.out.println("��й�ȣ �Է�"); String pwd = scanner.next();
						boolean resault = Controller.delete(index , pwd);
						if(resault) {
							System.out.println("���� ����");
						}else {
							System.out.println("��й�ȣ�� �ٸ��ϴ�.");
						}
						}
					else if (ch2 == 4) {Controller.replywrite();}
					else {}
					
				}
				else {}
			}catch( Exception e ) {
				System.err.println(" �޽���]] ��ȣ�� �Է����ּ���.");
				scanner = new Scanner(System.in); // �ٽ� �޸��Ҵ�[ ���� ���빰 ����� ] 
			}
		}
	} // main end 
	
} // class end 











