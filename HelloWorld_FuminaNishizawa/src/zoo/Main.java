package zoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		//学名マップ（動物名→学名）
		Map<String, String> scientificNames = new HashMap<>();
		scientificNames.put("ライオン", "パンテラ　レオ");
		scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
		scientificNames.put("パンダ", "アイルロボダ・メラノレウカ");
		scientificNames.put("チンパンジー", "パン・トゥログロディテス");
		scientificNames.put("シマウマ", "チャップマンシマウマ");
		scientificNames.put("インコ", "不明");

		//コンソール入力受付
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");

		String input = scanner.nextLine();

		//動物ごとに分割
		String[] animalsData = input.split(",");

		for (String animalData : animalsData) {
			//各動物の情報を":"で分割
			String[] parts = animalData.split(":");
			if (parts.length != 3)
				continue;//エラー回避

			String name = parts[0];
			double length = Double.parseDouble(parts[1]);
			int speed = Integer.parseInt(parts[2]);

			//学名を取得（なければ「不明」）
			String sciName = scientificNames.getOrDefault(name, "不明");

			Zoo zoo = new Zoo(name, length, speed, sciName);
			zoo.printInfo();
		}

		//

	}

}
