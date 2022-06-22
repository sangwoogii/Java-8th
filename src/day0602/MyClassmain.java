package day0602;

public class MyClassmain {

	public static void main(String[] args) {
		
		// 1번 방법. 인터페이스가 필드 타입으로 사용되는 경우
		// 필드에 개체를 대입하여 사용 가능
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(3);
		
		System.out.println();
		
		MyClass mc5 = new MyClass();
		mc5.rc1.turnOn();
		mc5.rc1.setVolume(3);
		
		System.out.println("---------------------");
		
		// 2번 방법
		// 인터페이스를 생성자의 매개변수 타입으로 사용
		MyClass mc2 = new MyClass(new Audio());
		
		System.out.println();
		
		MyClass mc6 = new MyClass(new Television());
		
		System.out.println("---------------------");
		
		// 3번 방법
		// 인터페이스를 지역변수타입으로 사용
		MyClass mc3 = new MyClass();
		mc3.methodA();
		
		System.out.println("---------------------");
		
		// 4번 방법
		// 인터페이스를 메서드의 매개변수로 사용
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
	}

}
