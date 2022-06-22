package day0602;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		RemoteControl rc; // 참조변수 생성
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnff();
		
		// 인터페이스를 통해 원래는 전혀 상관없던 두 클래스 Television과 Audio를
		// 연결시켜 인터페이스인 RemoteControl의 참조변수 rc를 통해 두개 다 화면에
		// 구현이 가능하다는 것을 알 수 있다.

	}

}
