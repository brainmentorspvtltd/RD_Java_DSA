interface X{ // abstract interface X
	void show(); // public abstract void show();
	default void disp() {
		System.out.println("Disp Body X");
		output();
	}
	private void output() {
		System.out.println("Output call");
	}
	static void printing() {
		System.out.println("Printing");
	}
}
interface Z{
	default void disp() {
		System.out.println("Disp Body Z");
	}
	void show();
	void print();
}
class Y implements X, Z{
	@Override
	public void disp() {
		X.super.disp();
		Z.super.disp();
		System.out.println("Disp Body Y");
	}
	
	@Override
	public void print() {
		System.out.println("Y Print");
	}
	@Override
	public void show() {
		System.out.println("Y Show Call");
		// TODO Auto-generated method stub
		
	}
	
}
// Utility Classes
//final class MathOpr{
//	private MathOpr() {}
//	static void sin() {
//		System.out.println("Sin");
//	}
//	static void cos() {
//		System.out.println("Cos");
//	}
//}
interface MathOpr{
	
	static void sin() {
		System.out.println("Sin");
	}
	static void cos() {
		System.out.println("Cos");
	}
}

public class Java8Interface {

	public static void main(String[] args) {
		Math.asin(90);
		//MathOpr opr = new MathOpr();
//		opr.sin();
//		opr.cos();
		MathOpr.sin();
        MathOpr.cos();
		X.printing();	
//		Y obj = new Y();
//		obj.show();
//		obj.disp();

	}

}
