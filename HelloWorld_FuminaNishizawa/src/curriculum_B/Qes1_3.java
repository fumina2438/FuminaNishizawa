package curriculum_B;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		System.out.println("ユーザー名を入力してください： ");
		String username = scanner.nextLine();//ユーザーからの入力を受け取る

		
		if (username.length() > 10) {//文字数が０文字以下もしくはnullの場合
			System.out.println("名前を１０文字以内にしてください");
			return;
		}
		if (username == null || username.length() == 0) {//文字数が０文字以下もしくはnullの場合
			System.out.println("名前を入力してください");
			return;
		}

		if (!username.matches("[a-zA-Z0-9]+")) {
			System.out.println("半角英数字のみで名前を入力してください");
			return;
		}
			System.out.println("ユーザー名「" + username + "」を登録しました");
		
		String[] hand = { "グー", "チョキ", "パー" };
		scanner = new Scanner(System.in);
		Random random = new Random();
        int count = 0;
		while (true) {
			System.out.print("グー・チョキ・パー　から選んでください:");
			String playerInput = scanner.nextLine();

			int player = Arrays.asList(hand).indexOf(playerInput);
			if (player == -1) {
				System.out.println("無効な入力です。もう一度。");
				continue;
			}
			count++;
			int cpu = random.nextInt(3);
			System.out.println("コンピュータ：" + hand[cpu]);

			if (player == cpu) {
				System.out.println("あいこ！\n");
			} else if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) {
				System.out.println("あなたの勝ち！\n");
				System.out.println("やるやん。\n次は俺にリベンジさせて");
				break;
				//グーに負けた場合（プレイヤーがチョキでCPUグー）
			} else if (player == 1 && cpu == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次に繋がるチャンスです！");
				System.out.println("ネバーギブアップ！");

				//チョキに負けた場合（プレイヤーがパーでCPUがチョキ）
			} else if (player == 2 && cpu == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思わないですか？");
				System.out.println("そうやったら次も、俺が勝ちますよ");

				//パーに負けた場合（プレイヤーグーでcpuはパー）
			} else if (player == 0 && cpu == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");

				//あいこの場合
			} else if ((player == 0 && cpu == 0) || (player == 1 && cpu == 1) || (player == 2 && cpu == 2)) {
				System.out.println("DRAW あいこ　もう一回しましょう！");

				System.out.println("あなたの負け…\n");
			}
		}
		
		System.out.printf("勝つまでにかかった合計回数は" + count + "回です");
		scanner.close();

	}

}
