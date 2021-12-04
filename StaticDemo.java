import java.util.LinkedList;
import static java.lang.System.out;
import static java.lang.Math.pow;
interface P1{
	static void disp() {
		System.out.println("p1 Disp");
	}
}
class Student{
	// Instance Variables or Non Static - These will be created when the object (instance) is created.
	private int rollno;
	String name;
	String course;
	// class variables
	//static int count   = 0; // When class is loaded then it comes in the memory
	static int count;
	static {
		System.out.println("Another Static Block2");
	}
	static {
		count = 0;
		System.out.println("Static Block 1 I Will Call Only Once when class is loaded..."+count);
	}
	{
		// init block
		rollno = 1002;
		System.out.println("Init Block 2 "+rollno);
	}
	{
		// init block
		rollno = 1001;
		System.out.println("Init Block 1 "+rollno);
	}
	
	
	static void show() {
		System.out.println(" I am Student Show");
	}
	Student(int rollno, String name, String course){
		this.rollno  = rollno;
		this.name = name;
		this.course = course;
		count++;
		out.println("Cons Call and Count is "+count);
	}
}

public class StaticDemo {
	static void show() {
		System.out.println(" I am StaticDemo Show");
	}
	public static void main(String[] args) {
		out.println(pow(2,3));
		out.println("Hello Static");
		P1.disp();
//		System.out.println(Student.count); 
//		Student.show();
//		show();
		
		Student ram1 =new Student(1001, "ram","Java");
		//System.out.println(ram1.rollno);
		Student ram2 =new Student(1001, "ram","Java");
		Student ram3 =new Student(1001, "ram","Java");
		Student ram4 =new Student(1001, "ram","Java");
		

	}

}
