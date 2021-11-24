

class X{
	int x;
	X(){
		x = 1;
	}
	void show() {
		System.out.println("X Show");
	}
	void print() {
		System.out.println("X Print");
	}
}
class Y extends X{
	int x;
	int y;
	Y(){
		x = 2;
		y = 3;
	}
	@Override
	void show() {
		System.out.println("Y Show "+this.x);
	}
}
public class BindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X y = new Y();
		y.print();
		y.show();
		System.out.println(y.x);
		//System.out.println(y.y);
		
		

	}

}
