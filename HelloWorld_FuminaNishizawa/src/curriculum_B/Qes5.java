package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i <= 9; i++) {//掛けられる数（1〜20）
			for (int j = 1; j <= 20; j++) {// 掛ける数（1〜20）
				System.out.printf("%03d * %03d =%03d", j, i, j * i);
				if (j <= 19) {
					System.out.print(" || ");
				}
			}
			System.out.println();//次の行へ
		}
	}
}
