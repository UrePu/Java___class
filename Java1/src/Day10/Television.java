package Day10;

public class Television implements RemoteControl , Searchable{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	@Override
	public void turnOff(){
		System.out.println("Tv를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨: " + this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");
	}
	@Override // 디폴트 메소드도 재정의 가능 하다.
	public void setMute(boolean mute) {
		
		RemoteControl.super.setMute(mute);
	}
}
