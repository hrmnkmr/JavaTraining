
public class Problem3 {

	public static void main(String[] args) {
		
		//算術演算子はここから
		
		// 整数型の変数　a , b を宣言し、初期化
		int a = 13;
		int b = 7;
		
		//a , b　の和
		int sumResult = a + b;
		
		//a , b　の差
		int differenceResult = a - b;
		
		//a , b　の積
		int productResult = a * b;
		
		//a , b　の商
		int quotientResult = a / b;
		
		//a , b　の剰余
		int remainderResult = a % b;
		
		//ここまで
		
		//関係演算子はここから
		
		//a , b　が等しいか
		boolean isEqual = (a == b);
		
		//a が b　より大きいか
		boolean isGreater  = (a > b);
		
		//a が b　より小さいか
		boolean isLess  = (a < b);
		
		//ここまで
		
		//出力
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("和 = " + sumResult);
		System.out.println("差 = " + differenceResult);
		System.out.println("積 = " + productResult);
		System.out.println("商 = " + quotientResult);
		System.out.println("剰余 = " + remainderResult);
		System.out.println("a , b は等しいか = " + isEqual);
		System.out.println("a が b より大きいか = " + isGreater);
		System.out.println("a が b より小さいか = " + isLess);

	}

}
