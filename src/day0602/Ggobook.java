package day0602;

public class Ggobook extends Character {

	public Ggobook () { // 꼬부기 기본생성자
		hp = 30;
		energy = 50;
		System.out.println("꼬부기가 생성되었습니다.");
		printInfo();
	}

	@Override
	void eat() {
		energy += 15;
	}

	@Override
	void sleep() {
		energy += 10;
	}

	@Override
	boolean play() {
		energy -= 30;
		hp += 15;
		levelUp();
		return checkEnergy();
	}

	@Override
	boolean train() {
		energy -= 20;
		hp += 30;
		levelUp();
		return checkEnergy();
	}

	@Override
	void levelUp() {
		if (hp >= 50) {
			level++;
			hp -= 50;
		}
		
	}
}
