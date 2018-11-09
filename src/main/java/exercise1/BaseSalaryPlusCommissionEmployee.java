package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {

	private int baseSalary=0;
	private int commission=0;


	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission){
		super(name);							// appel construct "parent"
		this.baseSalary=baseSalary;
		this.commission=commission;
	}

	@Override
	public int computeSalary(){
		return baseSalary+getSales()*commission;
	}
}
