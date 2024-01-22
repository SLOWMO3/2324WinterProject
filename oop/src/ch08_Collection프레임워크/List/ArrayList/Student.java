package ch08_Collection프레임워크.List.ArrayList;

class Student {
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

	@Override
	public boolean equals(Object obj) {
		Student temp = (Student)obj;
		if(this.name.equals(temp.name) && this.id == temp.id)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "name:" + name + " id:" + id;
	}
}

