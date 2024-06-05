package objectExercise;

public class Apartment extends Property{
	private	String layout;
	
	Apartment(String name, String owner, String type, int price, String layout) {
		super(name, owner, type, price);
		this.layout = layout;
	}
	
	//	ゲッター
	public String getLayout() {
		return this.layout;
	}

	//セッター
	public String setLayout() {
		return this.layout;
	}
	
	public void output() {
		System.out.println("=============================");
		super.output();
		System.out.println("間取り：" + layout);
		System.out.println("=============================");
	}

}
