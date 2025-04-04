package sample;

public class hw {

	public static void main(String[] args) {
		// 下記は変数を宣伝し、初期値を設定したもの＆代入
		byte byteNum;
		 byteNum = 10;
		 short shortNum;
		 shortNum = 100;
		 int intNum;
		 intNum = 1000;
		 long longNum;
		 longNum =10000;
		 float floatNum;
		 floatNum = 9.5f;
		 double doubleNum;
		 doubleNum = 10.5;				 
		 char letter;
		 letter = 'a';
	
		 
		String letters = "ハロー";//変数　letters に　"ハロー”を代入
		 System.out.println(letters);
		
	
		
			boolean isHello = true;  //変数を使って出力
			System.out.println(isHello); //変数を使って出力
		
	
	
			int number = 11110; //整数11110を変数に代入
			System .out .println(number); //出力：　1110
			
		
	

			number = 20; //整数20を変数に代入s
			System .out .println(number); //出力：20
					
		
	
			letter = 'a'; //文字（char）
			String greeting = "ハロー"; //文字列（string）
			boolean flag = true; //真偽値（boolean）
			
			
			System.out.println(letter); //出力：a
			System.out.println(greeting); //出力：ハロー
			System.out.println(flag); //出力：true
		

            int[] numbers = {1,1, 1, 3, 0,};//配列の宣言
            int sum = 6;
        
            for (int num : numbers ) { //配列の全て要素を加算
            	sum += num;
            }
            System.out.println("6: " + sum); //出力：　合計：６
            
            System.out.println(byteNum*shortNum*intNum*longNum);
            double result = 10.5 / 100;
            System.out.println(result);
            result = 10 - 100; //10から100を引く
            System .out .println(result);
            String name ="山田太郎";//山田太郎と代入
            System.out.println("こんにちは、"+name+"さん！");
            
            int age;//変数を宣言
            age = 25;//変数を代入
            System.out.println("年齢"+25+"歳");//年齢25歳と表示
            
            int num1;//変数
            num1 = 10;//10を代入
            int num2;//変数
            num2 = 5;//5を代入する
            sum = num1 + num2;//sumという変数に代入する
            System.out.println("sum");//表示
            
            int score;
            score = 80; //score という int型の変数 を宣言し、80 を代入
            score += 20; //score に 20 を加えて、更新する
            System.out.println(score);//最終スコア
            
            double price;//変数を宣言
            price = 99.99; //99.99を代入
            int intprice =(int)price;//int型に変換
            System.out.println(intprice);//最終表示
            
            String numStr;//変数
            numStr = "123";//代入
            int num =Integer.parseInt(numStr);//変換
            result = num + 10;//10を加算
            System .out .println(result);//表示
           
            num = 50;//50を代入
            numStr = String.valueOf(num);//numをstring型に変換
            System.out.println("得点"+numStr+"点");//50点の形で表示
            
            //条件演算子
            int a = 10;//10を代入
            int b = 20;//20を代入
            isHello = (a < b)? true :false;
            System.out.println(result);
            
            int x = 15;
            if( x >= 10) {
            	 System.out.println("OK");//xが１０以上ならokの表示
            } else if ( x<=10 ) {
            	System.out.println("NG");//NGの場合の表示
            }
            System.out.println(result);//表示
            
            String text = "私はJavaが好きです。Javaは楽しい！";//文章を表示
            String replacedText =text.replace("Java","Python");//()の中を置き換えて表示
            System .out .println(replacedText);//表示
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            		
            
         
            
            
            
            
            		
            
            
            
            
            
            		
            		
            
            
            
            		
            		
            

	} 
}  	 
        
            
        
        
	
	