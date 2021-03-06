package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7_키오스크 {
	// 상속 : 점포 
	// 클래스 : 롯데리아 , 버거킹
	// 인터페이스 : 키오스크  
	// 파일처리 : 제품재고 관리
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<상품> 상품리스트 = new ArrayList<>();
		try { //try {} 안에 예외[오류] 발생할것 같은 코드 넣기(예상)
		FileInputStream inputStream = new FileInputStream("D:/java/롯데리아재고.txt");
		//2. 파일 읽어오기 [ 파일 ---> 스트림(바이트열) ----> 자바 ]
			//1. 바이트배열 선언
		byte[] bytes = new byte[1024];
			//2. 읽어와서 배열 저장
		inputStream.read(bytes);
			//3.  [, : 필드 구분 \n : 객체 (상품 구분)
		String 파일내용 = new String(bytes);
		String[] 상품목록 = 파일내용.split("\n");
		for(String temp : 상품목록) {
			String[] 필드목록 = temp.split(",");
			상품 상품 = new 상품(필드목록[0],
					Integer.parseInt(필드목록[1]),
					Integer.parseInt( 필드목록[2]));
							//문자열 --> 정수형 변환
			상품리스트.add(상품);
			}
		
		}catch(Exception e) { // catch: 예외잡기 -> Exception 크래스의 객체에 저장.
			
		}

		
		키오스크 롯데리아 = new 롯데리아("유재석", 상품리스트);
		while(true) {
			
			롯데리아.제품목록();
			int ch = scanner.nextInt();
			if( ch == -1 ) {
				롯데리아.상품추가();
			}
		}
		
	}
}
