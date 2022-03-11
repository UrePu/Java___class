package Day08;

import Day07.Day07_5;
import Day07.Member;

public class Account {
	//1.�ʵ�
	String accountNumber;
	int amount;
	String accountOwner;
	//2. ������
	public Account() {}
	public Account(String accountNumber, int amount, String accountOwner) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.accountOwner = accountOwner;

	}
	//3. �޼ҵ�
	boolean createAcc(String id) {
		
		System.out.println("----���� ����----");
		System.out.print("���� ��ȣ ����: "); String num = Day08_5.scan.next();
		
		for( Account temp : Day08_5.account ) {
			if( temp != null && temp.accountNumber.equals(num)) { // ���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ� 
				System.out.println(" �˸�]] ���� ������� ���¹�ȣ �Դϴ�. ");
				return false; // �Լ����� ---> ���̵� �ߺ��Ǿ��� ������ false[���Խ���]
			}
		}
		
		
		
		
		Account account = new Account(num, 0, id);
		int j = 0; // �ݺ�Ƚ�� [ �ε��� ]
		for( Account temp : Day08_5.account ) {
			if( temp == null ) { // null ã�� [ null ã������ null-1 �ϸ� ������ȸ�� ]
					Day08_5.account[j] = account;
					break; // ������ 
			}
			j++; // �ε��� ����
		}
		return true;
		}
	public void depositAcc(String id) { // �Ա� ����
		System.out.println("----�Ա�----");
		System.out.print("�Ա��� ���¹�ȣ: "); String accNum = Day08_5.scan.next();
		System.out.print("�Ա��� �ݾ� ����: "); int num = Day08_5.scan.nextInt();
		
		boolean depoCheck = false ;
		for(Account temp : Day08_5.account) {
			if (temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(accNum)) {
				temp.amount += num;
				depoCheck = true;
			}
		}
		
		if(depoCheck) System.out.println("�Ա� ����");
		else System.out.println("�Ա� ����");
	}//�Ա� ��
	public void withdrawAcc(String id) {//��� ����

		System.out.println("----���----");
		System.out.print("����� ���¹�ȣ: "); String accNum = Day08_5.scan.next();
		System.out.print("����� �ݾ� ����: "); int num = Day08_5.scan.nextInt();
		
		for(Account temp : Day08_5.account) {
			if (temp != null && temp.accountOwner.equals(id) && temp.accountOwner.equals(accNum)) {
				if(num < temp.amount) {
					temp.amount -= num;
					System.out.println(num + "�� ���, �����ݾ�: " + temp.amount);
				}else System.out.println("�ܾ� ����");
			}
		}
	}//��� ��
	public void transferAcc(String id) { // ��ü ����
		System.out.println("----��ü----");
		System.out.print("��ü��(���) ���¹�ȣ: "); String accNum = Day08_5.scan.next();
		System.out.print("�����(����) ���¹�ȣ: "); String accNum2 = Day08_5.scan.next();
		System.out.print("����� �ݾ� ����: "); int num = Day08_5.scan.nextInt();
		
		for(Account temp : Day08_5.account) {
			String ��� = null ;
			if(temp != null && temp.accountNumber.equals(accNum)) {
				��� = temp.accountOwner;
				break;
			}
			if (temp != null && temp.accountOwner.equals(id) && temp.accountOwner.equals(accNum)) {
				if(num < temp.amount) {
					System.out.println("��ü�� ����� " + ��� + "���� �½��ϱ�?");
					System.out.println("1. �� 2. �ƴϿ�");
					System.out.print(">>>>>>: "); int ch = Day08_5.scan.nextInt();
					if(ch == 1){
						temp.amount -= num;
						System.out.println(��� +"�Կ��� " +num + "�� �۱�, �����ݾ�: " + temp.amount);
						for(Account temp2 : Day08_5.account) {
							if(temp2 != null && temp2.accountNumber.equals(accNum)) {
								temp2.amount += num;
								break;
							}
						}
					}else if(ch == 2) {
					}
					
				}else System.out.println("�ܾ� ����");
			}
		}
	}
	public void loanAcc(String id) {
	}
	public void listAcc(String id) {
	}

}