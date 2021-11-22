import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formatting {
	static Locale locale = new Locale("hi", "IN");
	static String formattedDate(){
		Date date = new Date(); // System current date and time
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
		String formatted = df.format(date);
		return formatted;
	}
	static String formattedCurrency(double val) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(val);
	}
}
