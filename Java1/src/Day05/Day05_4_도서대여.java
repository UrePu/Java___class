package Day05;

import java.util.Scanner;

public class Day05_4_�����뿩 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arrId = new String[100][2]; 
		String[][] arrBk = new String[100][2];
		for (int abc = 0; abc < arrBk.length; abc++) {
			arrBk[abc][1] = "0";
					
		}
		while(true) {
		System.out.println("---------�޴�---------");
		System.out.println("1.ȸ������ 2.�α��� ����:");		
		System.out.print(">>>>>>>>>>>: "); int ch1 = sc.nextInt();
		///////////////ȸ������///////////
		if(ch1 == 1) {
			while(true) {

				System.out.println("--------ȸ������--------");
				System.out.print("Insert ID: "); String id = sc.next();
				System.out.print("Insert PW: "); String pw = sc.next();
				
				boolean idcheck = true;
				for(int i = 0 ; i < arrId.length ; i++) {
					if(arrId[i][0] != null && arrId[i][0].equals(id)) {
						System.err.println("����)) �ߺ��Ǵ� ���̵� �ֽ��ϴ�.");
						idcheck = false;
						break;
					}
				}
				if(idcheck) {
					for(int i = 0 ; i < arrId.length ; i++) {
						if(arrId[i][0] == null) {
							arrId[i][0] = id;
							arrId[i][1] = pw;
							System.err.println("�˸�))ȸ������ �Ϸ�");
							break;
						}
					} 
					break;
				}
			}
		}
		/////////////�α���///////////
		else if(ch1 == 2) {
			System.out.println("--------�α���--------");
			System.out.print("Insert ID: "); String id = sc.next();
			System.out.print("Insert PW: "); String pw = sc.next();
			boolean lgch = true;
			for (int i = 0; i < arrId.length ; i++) {
				if (id.equals("admin") && lgch){ // ������ �޴�
					lgch = false;
					while(true) { //������ while����
						System.out.println("--------------------------");
						System.out.println("1.������� 2.������� 3.�������� 4.���� ��ŷ 5.�α׾ƿ� ����");
						System.out.print(">>>>>>>>: "); int ch2 = sc.nextInt();
						
						if (ch2 == 1) {
							System.out.println("�������");
							System.out.print(">>>>>>: "); String addBk = sc.next();
							
							for(int y = 0; y < arrBk.length; y ++) {
								if (arrBk[y][0] != null) {
									if(arrBk[y][0].equals(addBk)) {
									System.err.println("����)) �ߺ��� �̸��� �ֽ��ϴ�.");
									break;
									}
								}
								if (arrBk[y][0] == null){
									arrBk[y][0] = addBk;
									System.err.println("�˸�)) " + (y + 1) + " ���� ����Ǿ����ϴ�");
									break;
										
								}
								
							}
						}
						else if(ch2 == 2) {//���� ��� ���
							for (int j = 0 ; j < arrBk.length; j++) {
								if(arrBk[j][0] != null) {
									if (arrBk[j][1] == "0") {
										System.out.println(arrBk[j][0]);
									}else System.out.println(arrBk[j][0] + "\t�뿩���Դϴ�");	
								}
							}
							
						}//��� ��� ��
						else if(ch2 == 3) { // �������� 
							
							System.out.println("��������:");
							System.out.print(">>>>>>: "); String addBk = sc.next();
							for (int z = 0; z < arrBk.length; z ++) {
								if(arrBk[z][0].equals(addBk) && arrBk[z][0] != null && arrBk[z][1].equals("0")) {
									System.err.println(arrBk[z][0] + "å ���� ");
									arrBk[z][0] = null;
									break;
								}else if (!arrBk[z][1].equals("0")) {
									System.err.println("����)) �뿩�ڰ� �ִ� å�Դϴ�");
									break;
								}else {System.err.println("����)) å�� �������� �ʽ��ϴ�"); break;}
							}
						}//���� ���� ��
						else if(ch2 == 4) {
							
						}
						else if (ch2 == 5) {
							System.err.println("**�α׾ƿ� �Ǿ����ϴ�**");
							break;
							}
						else System.err.println("����)) �� �� ���� ��ȣ�Դϴ�");
					}
				}//������ if ����
				else if(id.equals(arrId[i][0]) && pw.equals(arrId[i][1])) { // �α��� ������\
						if (lgch == false) break;
						System.err.println("**�α��� ����**");
						
						lgch = false;
					while(true) {
						System.out.println("--------------------------");
						System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ����");
						System.out.print(">>>>>>>>: "); int ch2 = sc.nextInt();
					
						if(ch2 == 1) { // �����˻�
							System.out.println("å �̸� �Է�: ");
							System.out.print(">>>>>>>>: "); String bk = sc.next();
							boolean bkfd = true;
							for (int j = 0; j < arrBk.length ; j++) {
								if (bk.equals(arrBk[j][0])) { // å �̸��� ������
									bkfd = false;
									if(arrBk[j][1].equals("0")) {//å �̸��� ���� �뿩�� �����Ҷ�
										System.out.println(arrBk[j][0] + " å�� �뿩 �����մϴ�");
									}else System.out.println(arrBk[j][0] +  "å�� �̹� �뿩 �Ǿ����ϴ�");
								}
							}
							if(bkfd) {
								System.err.println(bk + " å�� ã���������ϴ�.");
							}
						} //���� �˻� ��
						else if(ch2 == 2) { // ���� ��� ���
							for (int j = 0 ; j < arrBk.length; j++) {
								if(arrBk[j][0] != null) {
									if (arrBk[j][1] == "0") {
										System.out.println(arrBk[j][0]);
									}else System.out.println(arrBk[j][0] + "\t�뿩���Դϴ�");	
								}
							}
						}//���� ��� ��� ��
						else if(ch2 == 3) { //���� �뿩

							System.out.println("å �̸� �Է�: ");
							System.out.print(">>>>>>>>: "); String bk = sc.next();
							boolean bkfd = true;
							for (int j = 0; j < arrBk.length ; j++) {
								if (bk.equals(arrBk[j][0])) { // å �̸��� ������
									bkfd = false;
									if(arrBk[j][1].equals("0")) {//å �̸��� ���� �뿩�� �����Ҷ�
										System.out.println(arrBk[j][0] + " å�� �뿩 �����մϴ� �Ͻðڽ��ϱ�?");
										System.out.println("1. ���� �뿩 2.���");
										System.out.print(">>>>>>: ");  int bkch = sc.nextInt();
									
										if (bkch == 1) {
											System.err.println("�˸�)) �뿩�� �Ϸ�Ǿ����ϴ�.");
											arrBk[j][1] = id;
											break;
										}else if (bkch == 2) {
											break;
										}else System.err.println("����)) �� �� ���� ��ȣ�Դϴ�");
									}else System.err.println("����)) �̹� �뿩 �Ǿ����ϴ�");
								}
							}
							if(bkfd) {
								System.err.println(bk + " å�� ã���������ϴ�.");
							}
						}
						else if(ch2 == 4) { //���� �ݳ�
							boolean re = true;
							for (int x = 0; x < arrBk.length; x++) {
								if(arrBk[x][0] != null) {
									if (arrBk[x][1].equals(id)) {
										System.out.println("---�ݳ� ����----");
										System.out.println(arrBk[x][0]);
										arrBk[x][1] = "0";
										re = false;
									}
								}
							}
							if (re) System.err.println("����)) �ݳ� ������ ������ �����ϴ�");
						}
						else if(ch2 == 5) { //�α׾ƿ�
							System.err.println("**�α׾ƿ� �Ǿ����ϴ�**");
							break;
						}
						else System.err.println("����)) �� �� ���� ��ȣ�Դϴ�.");
					}
				}
			}
			if (lgch) System.err.println("����)) ���̵� �Ǵ� ��й�ȣ�� �ٸ��ϴ�.");
			
		}
		else System.err.println("����)) �� �� ���� ��ȣ�Դϴ�.");
		
		
		}
	}
}
