/*
	ISYS 320
	Name(s):Brian Williams
	Date: 
*/

public class P6_Scientific {

	public static void main(String[] args) {
		// REMINDER: Any print statements should only be in the main method
		System.out.print(computeScientificValue(6.5, 3));

	}
	
	public static double computeScientificValue(double base, int exponent) {
		double value = 0;
		value = base * Math.pow(10, exponent);
		return value;
	}

}
