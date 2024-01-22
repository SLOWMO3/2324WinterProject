package ch08_Collection프레임워크.Map.TreeMap;

class Student implements Comparable<Student> {
	private String name;
	private int id;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	String getName() { return name; }
	void setName(String name) { this.name = name; }
	int getId() { return id; }
	void setId(int id) { this.id = id; }

	// - 자바에서 정렬은 기본적으로 오름차순
	// - compareTo 메소드에서 음수 반환은 자기자신(this) 객체가 매개변수 객체(o)보다 작다는 것을 의미
	// - id(정수)를 기준으로 객체 비교
	@Override
	public int compareTo(Student o) { // 혹은 return this.id - o.id;
		if(this.id < o.id)	
			return -1;	
		else if(this.id == o.id)
			return 0;
		else
			return 1;  
	}
	
	// - name(문자열)을 기준으로 객체 비교
//	@Override
//	public int compareTo(Student o) { // 혹은 return this.name.compareTo(o.name); 
//		if(this.name.hashCode() < o.name.hashCode())  
//			return -1;
//		else if(this.name.hashCode() == o.name.hashCode())
//			return 0;
//		else
//			return 1;
//	}
	
	// HashMap 사용하기 위해 equals(), hashCode() 재정의 필요
//	@Override
//	public boolean equals(Object obj) { 
//		Student temp = (Student)obj;
//		if(this.id == temp.id)  // if(this.name.equals(temp.name) && this.id == temp.id)
//			return true;
//		return false;
//	}
//	
//	@Override
//	public int hashCode() { 
//		return id; // return id + name.hashCode(); 혹은 return Objects.hash(id, name);
//	}
	
	@Override
	public String toString() {
		return "name:" + name + " id:" + id;
	}
}

