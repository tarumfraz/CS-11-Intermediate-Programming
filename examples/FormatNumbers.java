//-----------------------------------------------------------------------------
// FormatNumbers.java
// Illustrates use of the printf() method belonging to PrintStream class.
// The first argument to this function is known as a format specifier. A
// full description of the syntax for these specifiers can be found in the
// Java API documentation for java.util.Formatter.
//
// This example may be of use in getting the right output for pa4
// ----------------------------------------------------------------------------


class FormatNumbers{

    public static void main( String[] args ){
	double x = Math.PI;
      
	System.out.println(x);
	System.out.printf("%.15f%n", x);  // round to 15 decimal places
	System.out.printf("%.14f%n", x);
	System.out.printf("%.13f%n", x);
	System.out.printf("%.12f%n", x);
	System.out.printf("%.11f%n", x);
	System.out.printf("%.10f%n", x);
	System.out.printf("%.9f%n", x);
	System.out.printf("%.8f%n", x);
	System.out.printf("%.7f%n", x);
	System.out.printf("%.6f%n", x);
	System.out.printf("%.5f%n", x);
	System.out.printf("%.4f%n", x);
	System.out.printf("%.3f%n", x);
	System.out.printf("%.2f%n", x);
	System.out.printf("%.1f%n", x);  // round to 1 decimal place
	System.out.printf("%.0f%n", x);  // round to the nearest integer
      
    }
}
