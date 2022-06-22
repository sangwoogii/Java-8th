package day0602;

//Interface
//자율주행차를 만들것임

// 자동차 제조사의 구현 부분
public class AutoCar implements OperateCar {

	public void start() { // 오버라이딩을 할 때에도 public을 반드시 입력해야함
		System.out.println("자동차가 출발합니다.");
	}
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 " + speed + "km/h로 바꿉니다.");
	}
	
	public void turn (int degree) {
		System.out.println("자동차가 방향을 " + degree + "도 만큼 회전합니다.");
	}
	
	// 필요한 메서드에 값을 다 집어 넣었으면 실행해야하기 때문에 main으로
}