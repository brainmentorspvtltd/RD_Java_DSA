import java.io.IOException;

class Parent{
	//private final void show() {
	void show() throws Exception {
		System.out.println("Parent Show");
	}
}
class Child extends Parent{
	@Override
	void show() throws IOException  {
		int q [] = new int[10];
		q[11]=1000;
		System.out.println("Child Show");
	}
}
public class OverridingRules {

	public static void main(String[] args) throws IOException {
		Child child = new Child();
		child.show();

	}

}
