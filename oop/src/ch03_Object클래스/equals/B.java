package ch03_Object클래스.equals;

class B {
	String name;
	
	B(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name.equals(((B)obj).name)) { // == 사용하지 말 것
			return true;
		} else 
			return false;
	}	
}
