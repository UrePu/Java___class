package Day10;

import java.util.ArrayList;

public class Day10_4 {
	public static void main(String[] args) {
		String[] arr = new String[100];
		
		ArrayList<String> list = new ArrayList<>();
		//ArrayList 자동완성
		//<자료형> 
		// Arraylist<>(); 생성자
		System.out.println("리스트 : " + list);
		list.add("유재석");
			//리스트명.add: 리스트에 객체 추가 메소드
		System.out.println("리스트[0]: " + list.get(0));
			//리스트명.get: 해당 인덱스의 객체 호출 메소드
		System.out.println("길이 :" + list.size());
		
		//배열 단점: 메모리 크기는 고정길이[메모리 효율이 떨어짐]
			//회원 배열 100개 -> 만일 100명 초과하면 저장 불가능
			//회원 배열 100개 -> 만일 1명이면 나머지 99개 메모리 낭비
		
		//리스트: 메모리 크기는 가변길이[메모리 효율이 좋음]
			//리스트의 기본길이 10 -> 만일 추가하거나 삭제하면 자동으로 메모리 할당
		//		배열(문법) 	vs	리스트(클래스)
		//		추가 메소드x 	vs	추가메소드 o
		//추가: 	배열명[0]=값 	vs 	리스트명.add(값)
		//호출:	배열명[인덱스]	vs	리스트명.get(인덱스)
		//삭제: 	null할당		vs	리스트명.remove(인덱스)
		//		1 null 3 	vs 		1 3
		//길이: 	배열명.length	vs 	리스트명.size()
		
		
	}	
}
