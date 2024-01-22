class C {
	private int f;

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
}

class C1<T> {
	
	private T f;
	T getF() {
		return f; 
	}

	void setF(T f) {
		this.f = f;
	}
	
}

class C2<K,V> {
	private K f1;
	private V f2;
	
	private T f;
	T getF() {
		return f; 
	}

	void setF(T f) {
		this.f = f;
	}
	
}









public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		
		C1<Double> obj1 = new C1<>();
	}

}
