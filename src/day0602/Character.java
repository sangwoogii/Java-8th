package day0602;

public abstract class Character {
	
	protected int hp;
	protected int energy;
	protected int level = 0; // 처음 레벨은 0부터 시작한다는 초기값 설정
	

	abstract void eat ();
	abstract void sleep ();
	abstract boolean play ();
	abstract boolean train ();
	abstract void levelUp ();
	
	public boolean checkEnergy() {
		if (energy <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printInfo () {
		System.out.println("현재 캐릭터의 정보 출력");
		System.out.println("hp : " + hp);
		System.out.println("energy : " + energy);
		System.out.println("level : " + level);
	}
}