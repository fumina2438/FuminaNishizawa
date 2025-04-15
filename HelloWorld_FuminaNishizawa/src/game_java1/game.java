package game_java1;

public class game {
	
	// 各ステータス（HP、MP、攻撃力、素早さ、防御力）
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;

	//コンストラクタ：名前は初期化、ステータス値はサブクラスでランダムに設定される
	public void Game(String name) {
		this.name = name;// thisを使ってフィールドと引数を区別
	}

	//名前のsetter
	public void setName(String name) {
		this.name = name;
	}

	//HPのsetter
	public void setHP(int hp) {
		this.hp = hp;
	}

	//MPのsetter
	public void setMP(int mp) {
		this.mp = mp;
	}

	//attackのsetter
	public void setAttack(int attack) {
		this.attack = attack;
	}

	//speedのsetter
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//defenseのsetter
	public void setDefense(int defense) {
		this.defense = defense;
	}

	//名前のgetter
	public String getName() {
		return this.name;
	}

	//HPのgetter
	public int getHp() {
		return this.hp;
	}

	//MPのgetter
	public int getMp() {
		return this.mp;
	}

	//attackのgetter
	public int getAttack() {
		return this.attack;
	}

	//speedのgetter
	public int getSpeed() {
		return this.speed;
	}

	//defenseのgetter
	public int getDefense() {
		return this.defense;
	}

	public void gameName() {
		System.out.println("こんにちは「" + name + "」さん");

	}
}

