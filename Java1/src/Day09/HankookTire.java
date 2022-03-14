package Day09;

public class HankookTire extends Tire {
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override 
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "한국타이어 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("**** " + location + "한국타이어 펑크 ***");
			return false;
		}
	}
}
