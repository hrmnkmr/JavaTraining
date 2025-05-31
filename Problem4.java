
public class Problem4 {

	public static void main(String[] args) {
		
		int base = 20;
		int height = 15;
		
		//三角形の面積
		int triangleArea = (base * height) / 2;
		
		//円の半径
		int radius = 3;
		
		//円周率の 3.14
		 double PI = 3.14;
		 
		 //円の面積（明示的型変換 int ）
		 int circleArea = (int)(radius * radius * PI);

		 //三角形の出力
		 System.out.println("底辺 = " + base);
		 System.out.println("高さ = " + height);
		 System.out.println("底辺と高さの積 /2 = " + triangleArea);
		 
		 //円の出力
		 System.out.println("円の半径 = " + radius);
		 System.out.println("円周率 = " + PI);
		 System.out.println("円の半径と円の半径の積 *3.14 = " + circleArea);

	}

}
