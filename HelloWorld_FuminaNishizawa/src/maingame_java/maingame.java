package maingame_java;

import java.util.Scanner;

import game_java.sub;

public class maingame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("名前を入力してください");
		String name = scanner.nextLine();

		sub player = new sub(name);
		player.printStatus();

	}

}
