package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		
		int a = 50;
		int b = 48;
		boolean isGreaterA = (a > b);
		System.out.println(isGreaterA);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean isAndB = (isSunny && isWarm);
		System.out.println(isAndB);
		
		int x = 0;
		int y = -2;
		boolean isAndC = (x >= 0 && y % 2 == 0);
		System.out.println(isAndC);
		
		boolean hasPermission = false;
		boolean notResult = !(hasPermission);
		System.out.println(notResult);
	}

}
