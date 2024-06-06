package objectExercise;

public class Land extends Property {
	private double area;
	
	Land(String name, String owner, String type, int price, double area) {
		super(name, owner, type, price);
			this.area = area;
	}
	
	//	ゲッター
	public double getArea() {
		return this.area;
	}

	//セッター
	public double setArea() {
		return this.area;
	}
	
	public void output() {
		System.out.println("=============================");
		super.output();
		System.out.println("広さ：" + area + "㎡");
		System.out.println("=============================");
	}
}

