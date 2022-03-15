package Day10;

public class Day10_2 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		
		rc.setMute(true);
		RemoteControl.changeBattery();
		
		//메모리 할당 받는 방법
			//메모리 할당 해야하는 이유:
				//외부 클래스/인터페이스 내 필드 (저장기능) , 메소드(저장기능) 사용시
			//1. new 연산자
			//2. static 연산자
		}
}
