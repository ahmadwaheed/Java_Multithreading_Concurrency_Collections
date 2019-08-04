package collections.concurrency.plus;

public class EmployeeData {
	
	double InitialSalary;
	double IncrementedSalary;
	String Name;
	
	public EmployeeData(String name, double initialSalary, double incSalary) {
		
		InitialSalary = initialSalary;
		Name = name;
		IncrementedSalary = incSalary;
	}
	
	public double getInitialSalary() {
		return InitialSalary;
	}

	public void setInitialSalary(Double initialSalary) {
		InitialSalary = initialSalary;
	}

	public double getIncrementedSalary() {
		return IncrementedSalary;
	}

	public void setIncrementedSalary(Double incrementedSalary) {
		IncrementedSalary = incrementedSalary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "EmployeeData [InitialSalary=" + InitialSalary + ", IncrementedSalary=" + IncrementedSalary + ", Name="
				+ Name + "]";
	}	
}
