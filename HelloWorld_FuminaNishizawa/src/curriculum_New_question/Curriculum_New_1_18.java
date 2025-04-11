package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	//Q1挨拶文を表示
	public static void greetJavaSE(String language, int version) {
		System.out.println("Hello" + language + "SE" + version);
	}

	//Q2 整数の配列を受け取り、その要素を順番にコンソールに出力するメソッド。
	public static void printArray(int[] numbers) {
		for (int number : numbers) {// 配列の要素を1つずつ取り出して表示
			System.out.println(number);

		}
	}

	//Q4
	public static void printArray(double num1, double num2) {
		System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
	}

	//Q5 1〜100までのランダムな整数
	public static int[] generateRandomNumbers(int count) {
		Random random = new Random(); //ランダム生成器を作成
		int[] numbers = new int[count];//結果を格納する配列
		int index = 0;// 配列の現在の格納位置を示すインデックス

		// 指定回数分のランダムな数を生成して配列に格納
		while (index < count) {
			int num = random.nextInt(100) + 1; // 1〜100のランダムな数
			if (num != 0) { // 念のため0除外（このロジックだと出ないけど）
				numbers[index] = num;// 配列に格納
				System.out.println(num); // 値をコンソールに出力
				index++;// 次のインデックスへ
			}
		}

		return numbers;// 最終的な配列を返す
	}

	//Q6
	public static double printAverage(int[] numbers) {// 配列が空の場合はメッセージを出力して処理を終了

		double sum = 0;// 合計値を格納する変数
		for (int num : numbers) {
			sum += num;
		}

		double average = sum / numbers.length;// 平均値を計算（double型で小数点以下も保持）
		System.out.println("平均値: " + average); //平均値をコンソールに出力
		return average;
	}

	//Q7各要素が50以上か判定し、true/falseを出力するメソッド
	public static void checkOver50(int[] numbers) {
		for (int num : numbers) { // 拡張for文で配列の各要素を順に処理
			boolean isOver50 = num >= 50;// num が 50以上なら true、それ以外は false を格納
			System.out.println(num + " は50以上か？ → " + isOver50);// 判定結果をコンソールに出力
		}
	}
	// 平均値が50以上かどうか判定
	public static void checkOver50(double average) {
	    boolean isOver50 = average >= 50;
	    System.out.println("平均値 " + average + " は50以上か？ → " + isOver50);
	}
	public static void main(String[] args) {
		greetJavaSE("Java", 11);
		int[] sampleArray = { 1, 2, 3, 4, 5 };//Q3 動作確認用の main メソッド
		printArray(sampleArray);//メソッドを呼び出して配列の中身を出力

		double doubleNum1 = 3.14;
		double doubleNum2 = 2.71;
		printArray(doubleNum1, doubleNum2);
		int[] result = generateRandomNumbers(5); // ランダム値を5個生成
		double average = printAverage(result); // 平均値を出力
		checkOver50(average); // 各値が50以上かを出力、 メインメソッド
	}
}