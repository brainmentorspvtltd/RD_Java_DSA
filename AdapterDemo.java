import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//class UsingWL implements WindowListener{
//	public void windowClosing(WindowEvent e) {
//		
//	}
//}
class Parent{
	
}
class UsingWL extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		
	}
}

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowListener windowListener;
		WindowAdapter windowAdapter;

	}

}
