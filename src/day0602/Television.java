package day0602;

public class Television implements RemoteControl {

	// implements RemoteControl을 했으면 오버라이딩하기
	
	private int volume; // Television에서만 사용할 변수
	
	@Override
	public void turnOn() { // 인터페이스 몸통
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnff() { // 인터페이스 몸통
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) { // 인터페이스 몸통
		//MAX_VOLUME이 상수이기 때문에 static이 붙어서 객체생성이 따로 필요없음
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
}
