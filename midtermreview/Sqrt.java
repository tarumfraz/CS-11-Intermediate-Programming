// Sqrt.java

import java.util.Scanner;

class Sqrt{
    public static void main( String[] args ){
	Scanner sc = new Scanner(System.in);

        double x,y,value1,value2,value3;

        System.out.print("Enter two double values: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        value1 = Math.sqrt(x);
        value2 = Math.sqrt(y);
        value3 = value1 + value2;

        System.out.print("The value of the expression is " + value3 );

    }
}