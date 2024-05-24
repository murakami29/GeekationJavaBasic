package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		
		// FizzBuzz問題
		for (int num = 1; num <= 100; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (num % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (num % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(num);
			}
		}
		
		// 言語の振り分け
		String [] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		for (String lang: languages) {
			if (lang == "Java") {
				System.out.println("現在学習中の言語は" + lang + "です。");
			}
			else if (lang == "HTML") {
				System.out.println( lang + "はプログラミング言語ではありません。");
				break;
			}
			else {
				System.out.println(lang);
			}
		}
	}

}
