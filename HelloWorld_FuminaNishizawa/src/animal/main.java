package animal;

public class main {
	public static void main(String[] args) {
		lion newLion = new lion();
		newLion.setName("ライオン");
		newLion.setLength(2.1);
		newLion.setSpeed(80);

		System.out.println("動物名:" + newLion.getName());
		System.out.println("体長:" + newLion.getLength() + "m");
		System.out.println("速度:" + newLion.getSpeed() + "km/h");

	}

}
