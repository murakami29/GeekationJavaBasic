package basicSyntax;

public class DataTypePractice {

	public static void main(String[] args) {
		// 文字列
		System.out.println("こんにちは");
		System.out.println("私の名前は");
		System.out.println("Geek君です");
		
		// 文字列は「+」で連結することができます。
		System.out.println("こんにちは"+"私の名前は"+"Geek君です。");
		
		// 整数
		System.out.println(1);
		System.out.println(-1);
		System.out.println(5 + 1);
		
		// 数値は””で囲むと文字列扱いになります。
		System.out.println("5 + 1");
		System.out.println("5" + "1");
		
		// 浮動小数点数
		System.out.println(0.25);
		System.out.println(-5.0);
		System.out.println(5.0 - 0.25);
		
		// 真偽値
		System.out.println(true);
		System.out.println(false);		
	}
}
