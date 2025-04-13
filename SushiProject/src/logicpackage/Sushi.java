package logicpackage;

import java.text.SimpleDateFormat;//日時をフォーマットするためのクラス
import java.util.Date;//現在日時を取得するためのクラス

public class Sushi {
	//フィールド（メンバ変数）:出力する各メッセージ
	private String message1;
	private String message2;
	private String message3;
	private String currentDateTime;

	//コンストラクタ：Sushiクラスのインスタンスが生成された時に実行される処理
	public Sushi() {
		//メッセージを代入（thisを使ってフィールドに代入）
		this.message1 = "こんにちは！ここは日本です！";
		this.message2 = "この寿司はうまい";
		this.message3 = "寿司は和食です";
		//日付の取得
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.currentDateTime = sdf.format(now);//フォーマットした日時をフィールドに代入
	}

	//メッセージ出力
	public void printMassages() {
		//各メッセージをコンソールに出力
		System.out.println(this.message1);
		System.out.println(this.message2);
		System.out.println(this.message3);
		System.out.println("今日の現在日時は" + this.currentDateTime + "です");

	}

}
