/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 What were the errors you found?
 A method to convert fahrenheit to celsius shouldn't require a celsius input. Localized the celsius variable into the method.
 It also does not return a value, so corrected that.
 Then finally, set tempc in main to be equal to the method.
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = ftoc(tempf);
		System.out.println("Body temp in C is: " + tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf) {
		double tempc;
	      tempc = (tempf - 32) * 5 / 9;
	      return tempc;
    }
}
