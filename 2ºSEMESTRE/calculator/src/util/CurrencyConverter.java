package util;

public class CurrencyConverter {
	public static final double iof = 0.06;

	public static double converter(double dollar,double quantity) {
		return quantity * dollar *(1.0 + iof);
		
	}
}
