package Day08;

import Day07.Day07_5;
import Day07.Member;

public class Account {
	//1.필드
	String accountNumber;
	int amount;
	String accountOwner;
	//2. 생성자
	public Account() {}
	public Account(String accountNumber, int amount, String accountOwner) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.accountOwner = accountOwner;

	}
	//3. 메소드
	boolean createAcc(String id) {
		
		System.out.println("----계좌 생성----");
		System.out.print("계좌 번호 설정: "); String num = Day08_5.scan.next();
		
		for( Account temp : Day08_5.account ) {
			if( temp != null && temp.accountNumber.equals(num)) { // 만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면 
				System.out.println(" 알림]] 현재 사용중인 계좌번호 입니다. ");
				return false; // 함수종료 ---> 아이디가 중복되었기 떄문에 false[가입실패]
			}
		}
		
		
		
		
		Account account = new Account(num, 0, id);
		int j = 0; // 반복횟수 [ 인덱스 ]
		for( Account temp : Day08_5.account ) {
			if( temp == null ) { // null 찾기 [ null 찾았을때 null-1 하면 마지막회원 ]
					Day08_5.account[j] = account;
					break; // 끝내기 
			}
			j++; // 인덱스 증가
		}
		return true;
		}
	public void depositAcc(String id) { // 입금 시작
		System.out.println("----입금----");
		System.out.print("입금할 계좌번호: "); String accNum = Day08_5.scan.next();
		System.out.print("입금할 금액 설정: "); int num = Day08_5.scan.nextInt();
		
		boolean depoCheck = false ;
		for(Account temp : Day08_5.account) {
			if (temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(accNum)) {
				temp.amount += num;
				depoCheck = true;
			}
		}
		
		if(depoCheck) System.out.println("입금 성공");
		else System.out.println("입금 실패");
	}//입금 끝
	public void withdrawAcc(String id) {//출금 시작

		System.out.println("----출금----");
		System.out.print("출금할 계좌번호: "); String accNum = Day08_5.scan.next();
		System.out.print("출금할 금액 설정: "); int num = Day08_5.scan.nextInt();
		
		for(Account temp : Day08_5.account) {
			if (temp != null && temp.accountOwner.equals(id) && temp.accountOwner.equals(accNum)) {
				if(num < temp.amount) {
					temp.amount -= num;
					System.out.println(num + "원 출금, 남은금액: " + temp.amount);
				}else System.out.println("잔액 부족");
			}
		}
	}//출금 끝
	public void transferAcc(String id) { // 이체 시작
		System.out.println("----이체----");
		System.out.print("이체할(대상) 계좌번호: "); String accNum = Day08_5.scan.next();
		System.out.print("출금할(본인) 계좌번호: "); String accNum2 = Day08_5.scan.next();
		System.out.print("출금할 금액 설정: "); int num = Day08_5.scan.nextInt();
		
		for(Account temp : Day08_5.account) {
			String 대상 = null ;
			if(temp != null && temp.accountNumber.equals(accNum)) {
				대상 = temp.accountOwner;
				break;
			}
			if (temp != null && temp.accountOwner.equals(id) && temp.accountOwner.equals(accNum)) {
				if(num < temp.amount) {
					System.out.println("이체할 대상이 " + 대상 + "님이 맞습니까?");
					System.out.println("1. 예 2. 아니오");
					System.out.print(">>>>>>: "); int ch = Day08_5.scan.nextInt();
					if(ch == 1){
						temp.amount -= num;
						System.out.println(대상 +"님에게 " +num + "원 송금, 남은금액: " + temp.amount);
						for(Account temp2 : Day08_5.account) {
							if(temp2 != null && temp2.accountNumber.equals(accNum)) {
								temp2.amount += num;
								break;
							}
						}
					}else if(ch == 2) {
					}
					
				}else System.out.println("잔액 부족");
			}
		}
	}
	public void loanAcc(String id) {
	}
	public void listAcc(String id) {
	}

}