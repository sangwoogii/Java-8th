package day0602;

abstract public class Driver {
	int x, y;
	abstract void run (int x, int y); // 다형성을 위해 abstract로 설정
	
	void checkPass() { // 손님을 태우는 메서드
		System.out.println("손님이 탑승합니다.");
	}
}
