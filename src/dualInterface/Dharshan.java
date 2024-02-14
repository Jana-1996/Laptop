package dualInterface;

public class Dharshan implements Teacher, Employee {

	int age;
	int exp;

	public Dharshan(int age, int exp) {
		this.age = age;
		this.exp = exp;
	}

	public int salary(int salary) {
		return salary;
	}

	public String subject(String subject) {
		return subject;
	}

	public String qual(String qual) {
		return qual;
	}
}
