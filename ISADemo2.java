class A{
	int x;
	int y;
	A(){
		x = 1;
		System.out.println("A Default Cons");
	}
}
class B extends A{
	int x;
	B(){
		super(); 
		x = 2;
		System.out.println("B Default Cons");
	}
	B(int x){
		this();
		int z = super.x + this.x + x  + y;
		System.out.println("B Param Cons Call "+z);
	}
}
class C extends B{
	int x;
	C(){
		super(100); // parent class constructor call
		x = 5;
		System.out.println("C Default Cons");
	}
	C(int x){
		this();
		//super(200);
		// super(); 
		int z = x + this.x + ((B)this).x + ((A)this).x;
		System.out.println("C Param Cons Call "+z);
	}
}
public class ISADemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C(100);

	}

}
