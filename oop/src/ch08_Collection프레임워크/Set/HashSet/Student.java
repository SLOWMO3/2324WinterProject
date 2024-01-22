package ch08_Collection프레임워크.Set.HashSet;

import java.util.Objects;

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
		if(this.id == temp.id) // if(this.name.equals(temp.name) && this.id == temp.id)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return id; // return id + name.hashCode(); 혹은 return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "name:" + name + " id:" + id;
	}
}

