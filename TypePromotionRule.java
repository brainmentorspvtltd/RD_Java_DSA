

class Calc{
//	int add(int x, int y) {
//		System.out.println("Int");
//		return x + y;
//	}
//	long add(long x, long y) {
//		System.out.println("long");
//		return x + y;
//	}
//	double add(double x, double y) {
//		System.out.println("double");
//		return x + y;
//	}
	int add(short x, short y) {
		System.out.println("short");
		return x + y;
	}
	int add(byte x, byte y) {
		System.out.println("byte");
		return x + y;
	}
//	int add(Integer x, Integer y) {
//		System.out.println("Integer Wrapper");
//		return x + y;
//	}
	long add(Long x, Long y) {
		System.out.println("Long Wrapper");
		return x + y;
	}
//	int add(int...x ) {
//		System.out.println("int var args");
//		return x.length;
//	}
//	int add(long...x ) {
//		System.out.println("long var args");
//		return x.length;
//	}
}

public class TypePromotionRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
//		System.out.println(calc.add(1,2));
		System.out.println(calc.add((short)1,(short)2));

	}

}
