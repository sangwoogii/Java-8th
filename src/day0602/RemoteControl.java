package day0602;

// 인터페이스는 상수와 추상메서드로 구성
// 인터페이스 사용 시 상수를 표시하는 public static final 예약어는 생략 가능
// 인터페이스 사용 시 추상 메서드를 표시하는 public abstract 예약어도 생략 가능
// 상수선언과 동시에 값을 초기화해야함

public interface RemoteControl {

	// public static final int MAX_VOLUME = 10;
	// 인터페이스 안에서 사용했기 때문에 위 코드는 static final이 생략되었음
	public int MAX_VOLUME = 10; // 상수 선언과 동시에 초기화
	public int MIN_VOLUME = 0; // 상수 선언과 동시에 초기화
	
	// 위 코드는 상수가 됨
	
	// public abstract void turnOn();
	// abstract 생략 가능 -> 추상 메서드이기 때문에
	public void turnOn(); 
	public void turnff(); 
	public void setVolume(int volume); 
}
