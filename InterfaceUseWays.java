// SAM 
@FunctionalInterface
interface Calc{
	int compute(int x, int y);
	//int compute2(int x, int y);
}
// 1st way
class MyCalc implements Calc{
	@Override
	public int compute(int x, int y) {
		return x + y;
	}
}


public class InterfaceUseWays {

	public static void main(String[] args) {
//		Calc obj = new MyCalc(); // Upcasting
//		System.out.println(obj.compute(10, 20));
		//System.out.println(new MyCalc().compute(10, 20));
		
		// 2nd Way
//		Calc calc = new Calc() {
//
//			@Override
//			public int compute(int x, int y) {
//				// TODO Auto-generated method stub
//				return x * y;
//			}
//			
//		};
//		System.out.println(calc.compute(10, 2));
//
//		
//		Calc calc2 = new Calc() {
//
//			@Override
//			public int compute(int x, int y) {
//				// TODO Auto-generated method stub
//				return x - y;
//			}
//			
//		};
//		System.out.println(calc2.compute(10, 2));
		
		// 3rd Way Lambda
		Calc c = (x,y)->x+y;
		
		System.out.println(c.compute(900, 1000));
		
		Calc c2 = (a,b)->{
			System.out.println("A is "+a+" And B is "+b);
			return a + b;
		};
		System.out.println(c2.compute(100000, 4324));
		
	}

}
