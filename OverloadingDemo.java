

class ShopSearch{
	void search(double price) {
		System.out.println("Price "+price);
	}
public String search(String brand) {
		System.out.println("Brand "+brand);
		return "";
	}

protected int search(String brand, double price) throws ArrayIndexOutOfBoundsException {
	System.out.println("Brand "+brand+" Price "+price);
	return 0;
}
void search(double price, String  brand) throws NullPointerException {
	System.out.println("Price "+price +" Brand "+brand);
}
}
class Shop2 extends ShopSearch{
	void search(double price, String  brand, double dis) {
		System.out.println("Price "+price +" Brand "+brand+" Dis "+dis);
	}
}



public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop2 shop = new Shop2();
		shop.search(9999,"Nike",7);
		shop.search(9000);
		shop.search("Nike");
		shop.search(9000,"Nike");
		shop.search("Nike",9000);
		

	}

}
