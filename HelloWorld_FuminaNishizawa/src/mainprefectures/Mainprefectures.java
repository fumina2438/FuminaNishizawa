package mainprefectures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import prefectures.Prefectures;

public class Mainprefectures {

	public static void main(String[] args) {
		//都道府県データの初期化

		Prefectures[] data = {
				new Prefectures("北海道:", "札幌市:", 83424),
				new Prefectures("青森県:", "青森市:", 9646),
				new Prefectures("岩手県:", "盛岡市:", 15275),
				new Prefectures("宮城県:", "仙台市:", 7282),
				new Prefectures("秋田県:", "秋田市:", 11638),
				new Prefectures("山形県:", "山形市:", 9323),
				new Prefectures("福島県:", "福島市:", 13784),
				new Prefectures("茨城県:", "水戸市:", 6097),
				new Prefectures("栃木県:", "宇都宮市:", 6408),
				new Prefectures("群馬県:", "前橋市:", 6362),
				new Prefectures("埼玉県:", "さいたま市:", 3798)
		};
		//ユーザー入力用のScanner を作成
		Scanner scanner = new Scanner(System.in);

		//ユーザーから表示したい都道府県のインデックスを入力
		System.out.println("表示したい都道府県の番号をカンマ区切りで入力してください（例:8,5,9）:");
		String[] inputIndices = scanner.nextLine().split("");

		//ソート順（昇順 or 降順）を選択
		System.out.println("ソート順を選択してください（1,2 / desc = 降順）:");
		String order = scanner.nextLine().trim();

		//選択された都道府県を格納するリスト
		List<Prefectures> selectedList = new ArrayList<>();

		try {
			//入力されたインデックスを一つづつ処理
			for (String indexStr : inputIndices) {
				int index = Integer.parseInt(indexStr.trim());

				//有効なインデックスのみ追加
				if (index >= 0 && index < data.length) {
					selectedList.add(data[index]);
				} else {
					System.out.println("インデックスが範囲外です:" + index);
				}
			}
			//ソート処理（面積で昇順 or 降順）
			if (order.equalsIgnoreCase("asc")) {
				// 昇順ソート（小さい面積 → 大きい面積)	
				selectedList.sort(Comparator.comparingDouble(Prefectures::getArea).reversed());
			} else {
				System.out.println("無効なソート順が指定されました。");
				return;//プログラム終了
			}
			//結果の出力
			for (Prefectures p : selectedList) {
				p.printInfo();//都道府県の情報を表示
			}

		} catch (NumberFormatException e) {
			//数値に変換で機内入力があった場合のエラーメッセージ
			System.out.println("数値の形式が正しくありません。");
		}

	}

}
