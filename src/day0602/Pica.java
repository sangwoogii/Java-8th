package day0602;

public class Pica extends Character {
	
	public Pica () { // 피카츄 기본생성자
		hp = 30;
		energy = 50;
		System.out.println("피카츄가 생성되었습니다.");
		printInfo();
	}

	@Override
	void eat() {
		energy += 10;
	}

	@Override
	void sleep() {
		energy += 5;
	}

	@Override
	boolean play() {
		energy -= 20;
		hp += 5;
		levelUp();
		return checkEnergy();
	}

	@Override
	boolean train() {
		energy -= 15;
		hp += 20;
		levelUp();
		return checkEnergy();
	}

	@Override
	void levelUp() {
		if (hp >= 40) {
			level ++; // 경험치가 40 이상이되면 레벨이 1씩 증가
			hp -= 40; // 경험치가 40이 넘었을 경우 레벨이 1이 올라가고 난 나머지부터 시작을 해야하기 때문에 40을 빼야한다.
		}
	}
	
	
}
