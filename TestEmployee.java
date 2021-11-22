import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee ram = new Employee();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Basic Salary");
		double basicSalary = scanner.nextDouble();
		Employee ram = new Employee(id, name, basicSalary);
		String salarySlip = ram.printSalarySlip();
		System.out.println(salarySlip);
		scanner.close();
//		String a = new String("AMit");
//		System.out.println(a);
//		
//		Employee ram = new Employee(1001, "Ram",9999);
//		
//		ram.setSalary(ram.getSalary() + 10000);
//		System.out.println(ram.getSalary());
//		System.out.println(ram); // ram.toString()
//		//System.out.println(ram.print());

	}

}
