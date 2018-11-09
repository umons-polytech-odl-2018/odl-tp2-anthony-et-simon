package exercise1;

public class FixedSalaryEmployee extends Employee{

	private int fixedSalary=0;


	public FixedSalaryEmployee(String name, int fixedSalary){
		super(name);							// appel construct "parent"
		this.fixedSalary=fixedSalary;
	}

	@Override
	public int computeSalary() {
		return fixedSalary;
	}
}
