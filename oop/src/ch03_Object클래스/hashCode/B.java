package ch03_Object클래스.hashCode;

class B {
	int id;
	String name;
	
	B(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		//return id;		// case1
		//return name.hashCode(); // case2
      return id + name.hashCode(); // case3
	}
}

