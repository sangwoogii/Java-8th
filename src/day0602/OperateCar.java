package day0602;

public interface OperateCar {

	public abstract void start();	// 반드시 public을 사용하여야함
									// 모든 메서드는 반드시 public abstract여야
									// 하고 그 뒤에 메서드는 생략가능
	
	void stop();					// = public abstract void stop();
	void setSpeed(int speed);		// = public abstract void setSpeed();
	void turn(int degree);			// = public abstract void turn();
}

