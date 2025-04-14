package animal;

public class lion {

	//フィールド（動物の名前、体長、速度を保持）
	private String name;
	private double length;
	private int speed;

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
}
