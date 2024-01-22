// (1-1) 2점
____________

interface Salary { 
	_________ void computeSalary(); 	// (1-2) 2점
}

class Worker ____________ implements Salary { // 직원 // (1-3) 2점
	private String name; // 이름
	private int salary;  // 봉급

	Worker() { }
	Worker(String name, int salary) {
		// (1-4) 2점

		this.name = name;
		this.salary = salary;
	}

    String getName( ) { return name; }
    void setName(String n) { this.name = n; }
    // (2) 밑줄에 들어갈 코드를 적어라. 4점
	______ getSalary() { return salary; }
	void setSalary(int salary) { this.salary = salary; }

	public void computeSalary() { }

	// (3) 직원 객체의 모든 정보(필드)를 문자열로 반환하는 코드를 작성하라. 4점
	public String toString() {
		_____________________  ;
	}
	
	// (4) 직원 객체의 이름과 봉급이 동일한지 확인하는 코드를 작성하라. 4점
	public boolean equals(Object obj) {
		Worker temp = (Worker)obj;
		if( _________________ ) 
			return true;
		return false;
	}

	// (5) 직원 객체의 이름에 대한 해쉬값을 반환하는 코드를 작성하라. 4점
	public int hashCode() {
		___________________
	}
}

class Good_Worker extends Worker { // 우수직원
	Good_Worker(String name, int salary) {
		super(name, salary);
	}

	// (6) 기본 봉급에 20을 추가하고 저장하는 코드를 작성하라. (1~2문장) 4점
	public void computeSalary() {
		_____________________________
	}

	public String toString() {
		return "Good_W:" + super.toString();
	}
}

class Normal_Worker extends Worker { // 일반직원
	Normal_Worker(String name, int salary) {
		super(name, salary);
	}

	public String toString() {
		return "Normal_Worker:" + super.toString();
	}
}

class Company { // 회사
	private String name;
	private Worker[] workers = new Worker[5];
	
	Company(String name) {
		this.name = name;
	}
	
	Worker[] getWorkers() {
		return workers;
	}

	// (7) 매개변수로 주어진 직원 객체를 배열에 저장하기 위한 코드를 작성하라. 각2점
	void addWorker(Worker worker) {
		for(int i=0; i<workers.length; i++) {
			if(workers[i] == null) {
				____________________ ;
				____________________ ;
			}
		}
	}
	
	// (8) 매개변수로 주어진 직원 객체를 배열에서 조회하고 해당 객체를 반환하는 코드를 작성하라.	각2점
	Worker findWorker(Worker worker) {
		for(int i=0; i<workers.length; i++) {
			if(workers[i] == null)
				continue;
			if( _____________ ) 
				_____________________ ;
		}
		return null;
	}
	
	// (9) 모든 직원 객체를 출력하는 코드를 for-each문을 사용하여 적어라. 각2점
	void printAll() {
		for( ______________ )
			if(ele == null)
				continue;
			else
				____________________ ;
	}
}

public class MidTest_A {

	public static void main(String[] args) {
		// (10) 이름이 'LG'인 회사 객체를 생성하여 회사 참조변수 comp에 할당하는 코드를 작성하라. (1문장) 4점
		
		
		// (11) 이름 '길동', 봉급 '100'인 우수직원 객체를 생성하여 직원 참조변수 w1에 할당하는 코드를 작성하라. (1문장) 4점
		
		
		// (12) 이름 '성구', 봉급 '100'인 일반직원 객체를 생성하여 직원 참조변수 w2에 할당하는 코드를 작성하라. (1문장) 4점
		
		
		// (13) '길동' 직원을 'LG' 회사에 추가(저장)하는 코드를 작성하라. (1문장)  4점
		
		
		// (14) '성구' 직원을 'LG' 회사에 추가(저장)하는 코드를 작성하라. (1문장) 4점
		
		
		// (15) '길동' 직원이 'LG' 회사에 있는지 조회하고 ‘길동’ 직원의 봉급을 50 증가하여 저장하는 코드를 작성하라. (2~3문장) 6점
		
		
		
		// (16) 'LG' 회사의 모든 직원들의 봉급을 계산하는 코드를 작성하라. (null 원소 제외, 3문장 이상) 8점
		
		
		
		
		
		// (17) 'LG' 회사의 모든 직원들의 정보를 출력하는 코드를 작성하라. (1문장) 4점
		
		
		// (18) '길동' 직원의 정보를 출력하는 코드를 작성하라. (1문장) 4점
		
		
		// (19) '길동' 직원과 '성구' 직원의 해쉬값이 같은지 비교하는 코드를 작성하라. (1문장) 4점
		

		// (20) '길동' 직원과 '성구' 직원의 내용이 동일한지 확인하는 코드를 작성하라. (1문장) 4점
		
		
		// (21) Worker 클래스에서 중복정의된 메소드와 재정의된 메소드 이름을 모두 적어라. 각1점
		//      (21-1) 중복정의된 메소드 이름: 
		//      (21-2) 재정의된 메소드 이름: 
		
		// (22) 이클립스의 도움을 받아 "koo" 문자열에서 모든 'o' 문자를 
		//      모두 'k'로 대체한(replace) 결과를 출력하는 코드를 작성하라. 
		//      출력 결과는 "kkk"가 될 것이다. 4점
		
		
		
		// (23) 수업에 바라는 점을 적어라. 2점
	}
}
