package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i <= 9; i++) {//掛けられる数（1〜９）
			for (int j = 1; j <= 9; j++) {// 掛ける数（１〜９）
				System.out.printf("%02d * %02d = %02d", i, j, i * j);
				if (j <= 8) {
					System.out.print(" || ");
				}
			}
			System.out.println();//次の行へ
		}
	}
}
