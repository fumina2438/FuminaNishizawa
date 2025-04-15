package prefectures;

//都道府県の情報を表すクラス
public class Prefectures {
	private String name;//都道府県名
	private String capital;//県庁所在地
	private int area;//面積

	//コンストラクタ：prefectureのオブジェクトを生成
	public Prefectures(String name, String capital, int area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	public String getName() {//都道府県名を取得
		return name;
	}

	public String getCapital() {//県庁所在地を取得
		return capital;
	}

	public int getArea() {//面積を取得
		return area;
	}

	//都道府県の情報をコンソールに出力
	public void printInfo() {
		System.out.println("都道府県名:" + name);
		System.out.println("県庁所在地:" + capital);
		System.out.println("面積:" + area + "km\2");
	}
}
