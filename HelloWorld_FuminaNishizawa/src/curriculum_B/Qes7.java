package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		//強化の配列を定義
		String[] subjects = { "英語", "数学", "理科", "社会" };
		int subjectCount = subjects.length;//教科書を取得
		//生徒の人数を入力
		System.out.print("生徒の人数を入力してください（2 以上）：");
		int studentCount = scanner.nextInt();
		//生徒が２未満の場合は際入力を促す
		while (studentCount < 2) {
			System.out.print("2以上の人数を入力してください：");
			studentCount = scanner.nextInt();
		}
		//点数を保存する２次元配列作成（[生徒][教科]）
		double[][] scores = new double[studentCount][subjectCount];

		// 各生徒の各教科の点数を入力
		for (int i = 0; i < studentCount; i++) {
			for (int j = 0; j < subjectCount; j++) {
				System.out.printf("%d人目の『%s』の点数を入力してください：", i + 1, subjects[j]);
				scores[i][j] = scanner.nextDouble();//点数を読み込み
			}
			System.out.println();//改行
		}

		System.out.println();//出力前の空行

		// 生徒ごとの平均点を計算して出力
		for (int i = 0; i < studentCount; i++) {
			double sum = 0;
			for (int j = 0; j < subjectCount; j++) {
				sum += scores[i][j];//各教科の点数を加算
			}
			System.out.printf("%d人目の平均点は %.2f 点です。\n", i + 1, sum / subjectCount);
		}

		System.out.println();//教科ごとの平均前の空行

		// 教科ごとの平均 + 全体平均
		double totalSum = 0;

		for (int j = 0; j < subjectCount; j++) {
			double subjectSum = 0;
			for (int i = 0; i < studentCount; i++) {
				subjectSum += scores[i][j];//各生徒の該当教科の点数を加算
			}
			double subjectAverage = subjectSum / studentCount;//教科の平均点
			totalSum += subjectSum;//総合展に加算
			System.out.printf("%sの平均点は %.2f 点です。\n", subjects[j], subjectAverage);
		}
		//全体平均点を計算して出力（全ての生徒の全ての教科の平均）
		double overallAverage = totalSum / (studentCount * subjectCount);
		System.out.printf("全体の平均点は %.2f 点です。\n", overallAverage);
		//Scannerのクローズ
		scanner.close();

	}

}
