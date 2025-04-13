
public class Animal {
	//フィールド（動物の名前、体長、速度を保持）
	private String name;
	private double length;
	private int speed;

	//コンストラクタ（オブジェクト生成時に値を初期化）
	public Animal(String name, double length, int speed) {
		this.name = name;// thisはフィールドと引数を区別するために使用
		this.length = length;
		this.speed = speed;
	}

	//名前のsetter（値をセットする）
	public void setName(String name) {
		this.name = name;
	}

	//体長のsetter
	public void setLength(double length) {
		this.length = length;

	}

	//速度のsetter
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//名前のgetter（値を取得する）
	public String getName() {
		return this.name;
	}

	//体長のgetter
	public double getLength() {
		return this.length;
	}

	//速度のgetter
	public int getSpeed() {
		return this.speed;
	}

	//情報をコンソールに出力するメソッド
	public void printInfo() {
		System.out.println("動物:" + this.getName());
		System.out.println("体長:" + this.getLength() + "m");
		System.out.println("速度:" + this.getSpeed() + "km/h");
	}

	//mainメソッド（プログラムのエントリーポイント）
	public static void main(String[] args) {
		//Animalクラスのインスタンスを作成し、初期値を設定
		Animal lion = new Animal("ライオン", 2.1, 80);

		//lionの情報を出力
		lion.printInfo();
	}

}
