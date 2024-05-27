package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 40;
		int b = 3;
		int addResult = addition(a, b);
		int subResult = subtracion(a, b);
		int multiResult = multiplication(a, b);
		int divResult = division(a, b);
		
		results(addResult, subResult, multiResult, divResult);
	}
	
	// メソッド1: 二つの値を足し算するメソッド
	public static int addition(int a, int b) {
		return a + b;
	}
	
	// メソッド2: 二つの値を引き算するメソッド
	public static int subtracion(int a, int b) {
		return a - b;
	}
	
	// メソッド3: 二つの値を掛け算するメソッド
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	// メソッド4: 二つの値を割り算するメソッド
	public static int division(int a, int b) {
		return a / b;
	}
	
	// メソッド5: コンソールに出力するためのメソッド
	public static void results(int addResult, int subResult, int multiResult, int divResult) {
		System.out.println("計算結果は" + addResult + "です。");
		System.out.println("計算結果は" + subResult + "です。");
		System.out.println("計算結果は" + multiResult + "です。");
		System.out.println("計算結果は" + divResult + "です。");
	}

}
