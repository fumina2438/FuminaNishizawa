package game_java1;

import java.util.Random;

public class sub extends game {

	//コンストラクタ
	public sub(String name) {
		super();//スーパークラスの名前初期化を呼び出す

		//ランダムにステータスを設定
		Random rand = new Random();
		setHP(rand.nextInt(1000)); // 0〜999のHP
		setMP(rand.nextInt(1000));
		setAttack(rand.nextInt(500));
		setSpeed(rand.nextInt(1000));
		setDefense(rand.nextInt(100));
	}

	//ステータス表示の処理
	public void printStatus() {
		System.out.println("こんにちは「" + getName() + "」さん");
		System.out.println("HP:" + getHp());
		System.out.println("MP:" + getMp());
		System.out.println("攻撃力" + getAttack());
		System.out.println("素早さ" + getSpeed());
		System.out.println("防御力" + getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");

	}

}
