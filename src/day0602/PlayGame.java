package day0602;

import java.util.Scanner;

public class PlayGame {

	// 게임 진행
	private Character character;
	private int menu;
	private boolean exit;
	
	

	public void printMenu(Scanner s) {
		System.out.println("--------------");
		System.out.print("1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.종료 > ");
		menu = s.nextInt();
		play();
	}
	
	public void play() { // 실제로 화면에 출력하는 메서드
		switch (menu) {
		case 1:
			System.out.println("밥을 먹어요");
			character.eat();
			break;
		case 2:
			System.out.println("잠을 자요");
			character.sleep();
			break;
		case 3:
			System.out.println("놀아요");
			exit = character.play();
			break;
		case 4:
			System.out.println("운동을 해요");
			exit = character.train();
			break;
		case 5:
			exit = true; // 종료
		}
		character.printInfo();
	}
	
	public PlayGame(Character character) {
		this.character = character;
	}
	
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}
}
