package day0602;

public class Leesang extends Character {

	public Leesang () { // 이상해씨 기본생성자
		hp = 20;
		energy = 30;
		System.out.println("이상해씨가 생성되었습니다.");
		printInfo();
	}

	@Override
	void eat() {
		energy += 5;
	}

	@Override
	void sleep() {
		energy += 20;
	}

	@Override
	boolean play() {
		energy -= 10;
		hp += 15;
		levelUp();
		return checkEnergy();
	}

	@Override
	boolean train() {
		energy -= 10;
		hp += 20;
		levelUp();
		return checkEnergy();
	}

	@Override
	void levelUp() {
		if (hp >= 35) {
			level++;
			hp -= 35;
		}
	}


}
