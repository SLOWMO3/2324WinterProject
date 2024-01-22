package ch07_Generic클래스;

//구체 클래스
class C { 
	private int f;
	
	int getF() { return f; }
	void setF(int f) { this.f = f; }
}

//제너릭 매개변수 1개를 갖는 제너릭 클래스
class C1<T> { 
	private T f;

	T getF() { return f; }
	void setF(T f) { this.f = f; }
}

//제너릭 매개변수 2개를 갖는 제너릭 클래스
class C2<K, V> { 
	private K f1;
	private V f2;
	
	K getF1() { return f1; }
	void setF1(K f1) { this.f1 = f1; }
	V getF2() { return f2; }
	void setF2(V f2) { this.f2 = f2; }
}