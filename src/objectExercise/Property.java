package objectExercise;

public class Property {
	protected String name;
	protected String owner;
	protected String type;
	protected int price;
	
	Property(String name, String owner, String type, int price) {
		this.name = name;
		this.owner	= owner;
		this.type = type;
		this.price = price;
	}
	
	// ゲッター
	public String getName() {
		return this.name;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getPrice() {
		return this.price;
	}

	//セッター
	public String setName() {
		return this.name;
	}
	
	public String setOwner() {
		return this.owner;
	}
	
	public String setType() {
		return this.type;
	}
	
	public int setPrice() {
		return this.price;
	}

	public void output() {
		System.out.println("物件名：" + name);
		System.out.println("物件所有者名：" + owner);
		System.out.println("物件種別：" + type);
		System.out.println("物件価格：" + price + "円");
	}
}
