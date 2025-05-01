package assignment01.second;

public class EmployeeOverloaded {

	long employeeId;
	String employeeName;
	String employeeAddress;
	String employee;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double HRA = 1000.50;

	public EmployeeOverloaded(long Id, String Name) {
		employeeId = Id;
		employeeName = Name;
	}

	public EmployeeOverloaded(long Id, String Name, String Address) {
		employeeId = Id;
		employeeName = Name;
		employeeAddress = Address;
	}

	public EmployeeOverloaded(long Id, String Name, String Address, long Phone) {
		employeeId = Id;
		employeeName = Name;
		employeeAddress = Address;
		employeePhone = Phone;
	}

	public EmployeeOverloaded(long Id, String Name, String Address, long Phone, double HRA) {
		employeeId = Id;
		employeeName = Name;
		employeeAddress = Address;
		employeePhone = Phone;
	}

}
