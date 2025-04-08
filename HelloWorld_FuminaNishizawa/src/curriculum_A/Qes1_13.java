package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		byte myByte;//バイト型のローカル変数
		short myshort;//短整数型のローカル変数
		int myint;//整数型のローカル変数
		long mylong;//長整数型のローカル変数
		float myfloat;//単精度浮動小数点数型のローカル変数
		double mydouble;//倍精度浮動小数点数型のローカル変数
		char mychar;//文字型のローカル変数
		String mystring;//文字列型のローカル変数
		boolean myboolean;//ブーリアン型のローカル変数
		
		myByte =0;
		myshort =0;
		myint = 0;
		mylong = 0L;
		mydouble =0.0;
		mychar ='\u0000';
		mystring =null;
		myboolean =false;
		//それぞれの初期値代入して初期化
		
		myByte = 10;//10を代入
		myshort = 100;//100を代入
		myint = 1000;//1000を代入
		mylong = 10000;//10000を代入
		myfloat = 9.5f;//9.5fを代入
		mydouble = 10.5;//10.5を代入
		mychar = 'a';//aを代入
		mystring = "ハロー";//ハローを代入
		myboolean = true;//trueを代入
		
		System.out.println(myByte*myshort*myint*mylong);//11110の変数を出力
		System.out.println(myByte*myByte);//20の変数を出力
		System.out.println(mychar + mystring+ myboolean);//aハローtrueの変数を出力
		int[]numbers = {1,1,1,3,0};//11130の数字を全て足す
		int sum =6;//その合計は６
		System.out.println(myByte*myshort*myint*mylong);//小数点以外の数字を全てかける
		double result = mydouble/myshort;//10.5割る100をする
		System.out.println(result);//その結果
		result = myByte -myshort;//10引く100をする
		System.out.println(result);//その結果
		
		String num = "4";
		String num1 = "3";
		System.out.println(mystring + "JAVA" + (num+num1));//ハローJAVA43と表示させる
		
		String name ="山田太郎";//名前を代入
		System.out.println("「初めまして" + name + "です」");
		int age = 18;//年齢を代入
		System.out.println("「年齢は" + age + "歳です」");
		double height =170.5;//身長を代入
		System.out.println("「身長は"+ height + "cmです」");
		float weight =62.2f;//体重を代入
		System.out.println("「体重は" + weight + "kgです」");
		String favoritefood="寿司";//好きな食べ物を代入
		System.out.println("「好きな食べ物は" + favoritefood +"です」");
		double bim = weight / (height * height);//BIMを代入
		System.out.println("「BMIは" + bim + "です」");
		
		name ="鈴木一郎";//名前を代入
		System.out.println("「初めまして" + name + "です」");
		age =24;//年齢を代入
		System.out.println("「年齢は" + age + "歳です」");
		height =168.5;//身長を代入
		System.out.println("「身長は"+ height + "cmです」");
		weight =64.2f;//体重を代入
		System.out.println("「体重は" + weight + "kgです」");
		favoritefood ="オムライス";//好きな食べ物を代入
		System.out.println("「好きな食べ物は" + favoritefood +"です」");
		bim=weight /(height*height);//BMIを代入
		System.out.println("「BMIは" + bim + "です」");
		
		age = age + 24;//和算で自己代入２４を足す
		System.out.println("「年齢は" + age + "歳です」");//結果４８
		height = height + 168.5;
		System.out.println("「身長は"+ height + "cmです」");
		weight =weight + 64.2f;
		System.out.println("「体重は" + weight + "kgです」");
		
		age = 26;
		boolean isAdult =age >=25;//25際以上なら
		System.out.println(isAdult);//結果２５歳以上がtrue
		
		String total =String.valueOf(age) + "歳"
		              +String.valueOf(height) + "cm,"
		              +String.valueOf(weight) + "kg";
		System.out.println(total);
		//年齢、身長、体重を文字列型に形変換し繋げて出力
	
		age =Integer.parseInt(total);
		height = Integer.parseInt(total);
		System.out.println(age + height);
		//文字列型を整数型に変換して出力
		
		age = 24;
		height = 165;
		boolean iscorrect= (age >= 25) || (height >= 160);
		System.out.println(iscorrect);
		
	}

}
