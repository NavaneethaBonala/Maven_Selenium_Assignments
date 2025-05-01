package assignment01.third;

public class CalculateSalary {

	long employeeId;
	String employeeName;
	String employeeAddress;
	String employee;
	long employeePhone;
	double basicSalary = 40000;
	double specialAllowance = 250.80;
	double HRA = 1000.50;

	public void calculatesalary() {
		int salary = (int)(basicSalary + (basicSalary * specialAllowance/100)+(basicSalary*HRA/100));
		System.out.println(salary);
		
	}
	public static void main(String[] args) {
		CalculateSalary cs = new CalculateSalary();
		cs.calculatesalary();
	}
}
