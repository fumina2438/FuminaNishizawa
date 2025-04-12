package basicclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog myDog = new Dog();
		System.out.println("犬の名前は" + myDog.getName() + "です。");

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(3);//インスタンスを生成し、数を設定
		System.out.println("動物の数は" + dog2.getCount() + "匹です。");

		// 現在の日時を「yyyy-MM-dd HH:m:s」形式で変数に代入して、コンソールに出力してください
		Date now = new Date();// 現在の日時を取得

		// フォーマット指定（yyyy-MM-dd H:m:s）
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:m:s");

		// フォーマット済み日時を変数に代入
		String formattedDate = sdf.format(now);

		// コンソールに出力
		System.out.println("現在の日時（Date使用) :" + formattedDate);

	}
}