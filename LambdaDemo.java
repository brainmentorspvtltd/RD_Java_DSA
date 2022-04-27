@FunctionalInterface
interface Calc{ // SAM
    int compute(int x, int y);
}
/*
class A implements Calc{
    //   Calc c = (a,b)->a+b;
    @Override
    public int compute(int x, int y) {
        // TODO Auto-generated method stub
        return 0;
    }

}*/
public class LambdaDemo {
    public static void main(String[] args) {
        Calc c = (a,b)->a+b;
        int e = c.compute(10, 20);
    }
}
