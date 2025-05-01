package assignment01.fourth;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	String employee;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double HRA = 1000.50;

    public Employee(long id, String name, String address, long phone, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }



   
     public void displayDetails() {
        System.out.println("--------------------------");
        System.out.println("Employee Constructor Called for ID: "+this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Address: " + this.employeeAddress);
        System.out.println("Phone: " + this.employeePhone);
        System.out.println("Basic Salary: " + this.basicSalary);
     }
}