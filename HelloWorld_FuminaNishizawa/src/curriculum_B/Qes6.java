package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		// 商品名の入力を促すメッセージ
		System.out.println("商品を「、」区切りで入力してください：");
		// ユーザーからの入力を1行取得
		String input = scanner.nextLine();
		// 入力された文字列を「、」で分割し、配列に格納
		String[] items = input.split("、");
		// 拡張for文を使って、配列の各商品名を順番に処理
		for (String item : items) {
			// 商品名の前後に余分な空白があれば取り除く
			String trimmed = item.trim(); //余分な空白削除

			//拡張for内でSwitch文使用
			switch (trimmed) {
			
			//商品名に応じて処理を分岐
			case "テレビ":
			case "ディスプレイ":
				//条件演算子を使って、ディスプレイの場合は(11 - ランダム)、テレビはそのままランダムな在庫数を設定
				int displayStock = (trimmed.equals("ディスプレイ")) ? (11 - rand.nextInt(12)) : rand.nextInt(12);
				System.out.println(trimmed + "の残り台数は" + displayStock + "台です");
				break;
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				
				//ランダムに０−11の在庫数を設定
				int stock = rand.nextInt(12); //０−11
				System.out.println(trimmed + "の残りの台数は" + stock + "台です");
				break;
           
				//指定されていない商品名が入力された場合の処理
			default:
				System.out.println("『" + trimmed + "』は指定の商品ではありません");

			}
		}
	}
}
