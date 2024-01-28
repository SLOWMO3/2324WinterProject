package Winter.WinterProject.src.Winter;

public class Product {
	private String p_name;	//상품명(product name)
	private String s_name;	//판매자(seller name)
	private int price;		//가격
	private int quantity;	//수량
	
	public Product(String p_name, int price, int quantity) {
		this.p_name = p_name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String p_name, int quantity) {
		// TODO Auto-generated constructor stub
		this.p_name = p_name;
		this.quantity = quantity;
	}

	//get/set 메소드
	public String get_p_name() { return p_name; }
	public void set_p_name(String p_name) { this.p_name = p_name; }
	public String get_s_name() { return s_name; }
	public void set_s_name(String s_name) { this.s_name = s_name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public int getQuantity() { return quantity; }
	public void setQuantity(int quantity) { this.quantity = quantity; }
	
	//equals, toString 재정의
	@Override
	public boolean equals(Object obj) {
		Product temp = (Product)obj;
		if(this.p_name.equals(temp.p_name) && this.s_name.equals(temp.s_name)) //상품명과 판매자가 같으면 같은 상품
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "상품명:" + p_name + " 가격:" + price + " 판매자:" + s_name + " 수량:" + quantity;
	}	
	
}
