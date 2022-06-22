package day0602;

public class Bus extends Driver implements Vehicle {
	// 부모와 인터페이스 둘다 상속 (다중상속), 인터페이스는 다중상속이 가능함 
	
	@Override
	public void stop(Vehicle v) {
		System.out.println(v + "정류장에 멈춥니다.");
	}
	
	public void stop() { // 오버로딩은 왜써 ?
		System.out.println("버스가 멈춥니다.");
	}

	@Override
	public void run(int x, int y) { // 인터페이스는 무조건 public 사용
		System.out.println(x + ", " + y + "위치로 버스가 달립니다.");
	} 
	
	public String toString() {
		return "A";
	}
	
}
