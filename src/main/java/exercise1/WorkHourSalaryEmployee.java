package exercise1;

public class WorkHourSalaryEmployee extends Employee {

	private int hourlyRoute=0;

	public WorkHourSalaryEmployee(String name, int hourlyRoute){
		super(name);							// appel construct "parent"
		this.hourlyRoute=hourlyRoute;
	}

	@Override
	public int computeSalary(){
		return getWorkedHours()*hourlyRoute;
	}
}
