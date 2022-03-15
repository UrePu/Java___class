package Day10;

public class Television implements RemoteControl , Searchable{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");
	}
	@Override
	public void turnOff(){
		System.out.println("Tv�� ���ϴ�.");
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
		System.out.println("���� TV����: " + this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url + " �� �˻��մϴ�.");
	}
	@Override // ����Ʈ �޼ҵ嵵 ������ ���� �ϴ�.
	public void setMute(boolean mute) {
		
		RemoteControl.super.setMute(mute);
	}
}
