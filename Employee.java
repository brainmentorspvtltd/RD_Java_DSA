import java.util.Date;

public class Employee {
	//extends Object {
	private String name; // Instance Members
	private int id;
	private double salary;
	private String manager;
	private String phone;
	private String email;
	private String company;
	
	
	// Default Constructor
	Employee(){
		//this(1001, "Ram",9999);
		company = "tcs";
	}
	// Param Constructor
	Employee(int id, String name, double salary){
		
		this(); // Default Constructor Call (Must be on first line)
		this.id = id + company.length();
		this.name = name;
		this.salary = salary;
	}
	
	double hra() {
		return salary * 0.50;
	}
	
	double da() {
		return salary * 0.15;
	}
	
	double ta() {
		return salary * 0.30;
	}
	
	double ma() {
		return salary * 0.20;
	}
	
	double pf() {
		return salary * 0.05;
	}
	
	double gs() {
		return salary + hra() + da() + ta() + ma();
	}
	
	double ns() {
		return gs() - pf() - tax();
	}
	
	double tax() {
		return salary * 0.10;
	}
	
	public String printSalarySlip() {
		return " Company "+company.toUpperCase()+"\n Date "+Formatting.formattedDate()+
				"\nId "+id+"\n"+"Name "+name+"\n"+"Basic Salary"+Formatting.formattedCurrency(salary)+"\n"
	+"HRA "+hra()+"\n"+"DA "+da()+"\n"+"TA "+ta()+"\n"+"MA "+ma()+"\n"+"PF "+(pf()*2)+"\n"+
				"GS "+gs()+"\n"+"TAX "+tax()+"\n"+"NS "+ns();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Id "+id +" Name "+name+" Salary "+salary;
//	}
	/*public String print() {
		return "Id "+id +" Name "+name+" Salary "+salary;
//		System.out.println("Id "+id);
//		System.out.println("Name "+name);
//		System.out.println("Salary "+salary);
//		System.out.println("Branch "+branch);
	}*/
}
