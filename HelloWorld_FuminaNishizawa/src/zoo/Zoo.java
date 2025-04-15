package zoo;

public class Zoo {
	private String name;
	private double length;
	private int speed;
	private String scientificName;

	//コンストラクタ
	public Zoo(String name, double length, int speed, String scientificName) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	//譲歩を表示するメソッド
	public void printInfo() {
		System.out.println("動物名:" + name);
		System.out.println("体長:" + length + "m");
		System.out.println("速度" + speed + "km/h");
		System.out.println("学名:" + scientificName);
		System.out.println();//改行
	}

}
