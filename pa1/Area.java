//-----------------------------------------------------------------------------
// Area.java
//-----------------------------------------------------------------------------

import java.util.Scanner;

class Area{

    public static void main( String[] args ){

	double height, width, area;
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter width: ");
	width = sc.nextDouble();
	System.out.print("Enter height: ");
	height = sc.nextDouble();
	area = width*height;
	System.out.print("The area is: ");
	System.out.println(area);
      
    }
}
