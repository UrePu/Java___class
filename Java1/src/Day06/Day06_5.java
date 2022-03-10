package Day06;

public class Day06_5 {

	public static void main(String[] args) {
		Korean k1 = new Korean();
		
			k1.name = "유";
			k1.ssn = "012312-1233";
			System.out.println("k1 국적: " +k1.nation);
			System.out.println("k1 이름: " +k1.name);
			System.out.println("k1 주민번호: " +k1.ssn);
			
		Korean k2 = new Korean("유", "123-123");
		System.out.println("k2 국적: " +k2.nation);
		System.out.println("k2 이름: " +k2.name);
		System.out.println("k2 주민번호: " +k2.ssn);
		/////////
			//빈생성자 객체
		Korean 한국인1 = new Korean();
			//필드 1개 생성자 객체 생성
		Korean 한국인2 = new Korean("이름1");
			//필드 2개 생성자 객체 생성
		Korean 한국인3 = new Korean("이름2", "01001-001011");
	}
}
