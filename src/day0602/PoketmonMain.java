package day0602;

import java.util.Scanner;

abstract class Poketmon {
	int hp;		// 경험치
	int energy; // 에너지 (체력)
	int level;	// 레벨
	
	Poketmon(){} // 기본생성자
	
	Poketmon(int hp, int energy, int level) { // 매개변수 3개의 생성자
		this.hp = hp;
		this.energy = energy;
		this.level = level;
	}
	
	// 필요한 추상 메서드 생성
	abstract void eat();			// 밥먹기
	abstract void sleep();			// 잠자기
	abstract void play();			// 놀기
	abstract void trainning();		// 연습하기
	abstract void levelUp();		// 레벨업
	abstract void energyCheck();	// 에너지체크
	abstract void poketmonInfo();	// 정보출력
}


class Picachu extends Poketmon {
	
	Picachu(){}
	
	Picachu (int hp, int energy, int level) { // 오버로딩
		super (hp, energy, level);
	}

	void eat() { // 몸통 채우기
		this.energy += 10;
	}
	
	void sleep() { // 몸통 채우기
		this.energy += 5;
	}
	
	void play() { // 몸통 채우기
		this.energy -= 20;
		this.hp += 5;
		if (this.hp >= 40) {
			this.level += 1;
			this.hp -= 40;
		}
	}
	
	void trainning() { // 몸통 채우기
		this.energy -= 15;
		this.hp += 20;
		if (this.hp >= 40) {
			this.level += 1;
			this.hp -= 40;
		}
	}
	
	void levelUp() { // 몸통 채우기
		System.out.println("포켓몬 레벨업 !");
	}
	
	void energyCheck() { // 몸통 채우기
		System.out.println("hp = " + hp);
		System.out.println("energy = " + energy);
		System.out.println("level = " + level);
	}
	
	void poketmonInfo() { // 몸통 채우기
		System.out.println("피카츄 선택 !");
	}
}


class Ggobugi extends Poketmon {
	
	Ggobugi(){}
	
	Ggobugi (int hp, int energy, int level) {
		super (hp, energy, level);
	}

	void eat() {
		this.energy += 10;
	}
	
	void sleep() {
		this.energy += 5;
	}
	
	void play() {
		this.energy -= 20;
		this.hp += 5;
		if (this.hp >= 40) {
			this.level += 1;
			this.hp -= 40;
		}
	}
	
	void trainning() {
		this.energy -= 15;
		this.hp += 20;if (this.hp >= 40) {
			this.level += 1;
			this.hp -= 40;
		}
	}
	
	void levelUp() {
		System.out.println("포켓몬 레벨업 !");
	}
	
	void energyCheck() {
		System.out.println("hp = " + hp);
		System.out.println("energy = " + energy);
		System.out.println("level = " + level);
	}
	
	void poketmonInfo() {
		System.out.println("꼬부기 선택 !");
	}
}


class Leesanghaessi extends Poketmon {
	
	Leesanghaessi(){}
	
	Leesanghaessi (int hp, int energy, int level) {
		super (hp, energy, level);
	}

	void eat() {
		this.energy += 10;
	}
	
	void sleep() {
		this.energy += 5;
	}
	
	void play() {
		this.energy -= 20;
		this.hp += 5;if (this.hp >= 40) {
			this.level += 1;
			this.hp -= 40;
		}
	}
	
	void trainning() {
		this.energy -= 15;
		this.hp += 20;if (this.hp >= 40) {
			this.level += 1;
			this.hp -= 40;
		}
	}
	
	void levelUp() {
		System.out.println("포켓몬 레벨업 !");
	}
	
	void energyCheck() {
		System.out.println("hp = " + hp);
		System.out.println("energy = " + energy);
		System.out.println("level = " + level);
	}
	
	void poketmonInfo() {
		System.out.println("이상해씨 선택 !");
	}
}


public class PoketmonMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 포켓몬을 선택하시오.");
		System.out.println();
		System.out.print("1.피카츄 2.꼬부기 3.이상해씨 > ");
		
		// num1 : 생성할 수 있는 포켓몬을 나타내는 변수
		int num1 = s.nextInt();
		Poketmon p = null;
		// if문 (생성할 수 있는 포켓몬을 나타내는 것) 뿐만 아니라
		// 생성한 (선택한) 포켓몬의 기능도 나타내기 위해 Poketmon이라는 자료형의 p라는
		// 전역변수를 만들어놓음
		// null은 아무것도 없다는 것을 나타내기 위해 사용
		// 그렇게되면 Poketmon이라는 클래스에 있는 멤버들을 전부 다 사용할 수 있기 때문에
		
		if (num1 == 1) {				// 1을 입력하면 피카츄 생성
			p = new Picachu(30, 50, 0);
		} else if (num1 == 2) {			// 2를 입력하면 꼬부기 생성
			p = new Ggobugi(35, 45, 0);
		} else if (num1 == 3) {			// 3을 입력하면 이상해씨 생성
			p = new Leesanghaessi(40, 40, 0);	
		}
		
		p.poketmonInfo();
		
		// num2 : 포켓몬 기능을 나타내는 변수
		stop : while (true) {
			p.energyCheck();
		System.out.print("1.밥먹기 2.잠자기 3.놀기 4.연습하기 5.종료 > ");
		int num2 = s.nextInt();
		switch (num2) {
		case 1:
			System.out.println("밥을 먹어요");
			p.eat();
			break;
		case 2:
			System.out.println("잠을 자요");
			p.sleep();
			break;
		case 3:
			System.out.println("포켓몬이 놀아요");
			p.play();
			break;
		case 4:
			System.out.println("연습을 해요");
			p.trainning();
			break;
		case 5:
			break stop;	
		}
	}
		System.out.println(" < 종료되었습니다. > ");
		s.close();
	}
}
