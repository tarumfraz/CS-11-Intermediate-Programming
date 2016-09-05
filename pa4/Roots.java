/************************************************************
 * Roots.java
 * Tarum Fraz
 * tfraz
 * pa4
 * This program finds the roots of polynomials. The user 
 * enters the degree, coefficients, and an interval, and the
 * the program will find the corresponding roots.
 ************************************************************/

import java.util.Scanner;
import java.util.Arrays;

class Roots{

    public static double[] C2; // These variables are now global variables 
    public static double[] D;
    public static int n;
    public static int x;

    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);        
             
        int polyR = 0, diffR = 0;
        double resolution = 0.01, tolerance = 0.0000001, threshold = 0.001, a, b;            
        boolean root = false; // Boolean to check if root is found or not
                       
        System.out.print("Enter the degree: ");
        n = sc.nextInt();
        x = n+1; // Coefficients will be 1 + the degree
 
        C2 = new double[x]; // Initializing arrays to size of the number of Coeff
        D = new double[x];

        double[] polyRoot = new double[n]; // Arrays initialized to size of degree
        double[] diffRoot = new double[n];
             
        System.out.print("Enter " + x  + " cofficients: ");
            
        double[] C = new double[x];
        for( int  i = 0; i < C.length; i++ ){ // Here we set up an array so the number of coeffiecients is up to user
	     C[i] = sc.nextDouble();
        }            

        System.out.print("Enter the left and right endpoints: ");
        a = sc.nextDouble(); // Left interval, or endpoint
        b = sc.nextDouble(); // Right interval, or endpoint 
        System.out.println("");
 
        diff(C); // Call to function diff, which finds derivatives of the polynomial, the argument is the array C

        for( double i = a; i < (b - resolution); i += resolution ){ // For loop iterating over all subintervals of width resolution
	    if( isPos (D, i) != isPos(D, i+resolution) || isPos(D, i) == 0){ // Forms partition
                 diffRoot[diffR] = findRoot(D, i, i+resolution, tolerance);
                 diffR++;
             }
	}
           
        for( int i = 0; i < diffRoot.length; i++ ){ // Loop to find roots accurate within tolerance
	     double temp;
             temp = poly(C, diffRoot[i]);
             temp = Math.abs(temp);
	     if( temp < threshold ){
                 polyRoot[polyR] = diffRoot[i];
                 polyR++;
                 root = true;
	     }
	}
						 
        for( double i = a; i < (b - resolution); i+=resolution ){
	     if( isPos(C, i) != isPos(C,i+resolution) || isPos(C, i) == 0){
                 polyRoot[polyR] = findRoot(C, i, i+resolution, tolerance);
                 polyR++;
                 root = true;        
             }
        }

        Arrays.sort(polyRoot); // Call to built in java function, sorts the polyRoot array

        if( root == true ){ // If the boolean is true and the root is found
            for( int i = 0; i < polyRoot.length; i++){ // Increment i
		if( polyRoot[i] != 0.0){ // If the root of polynomial is not 0
		    System.out.printf("Root found at %.5f%n", polyRoot[i]); // Print out the root formatted and rounded correctly
                 }
	    }
        }else{ // If the root is found and anything else happens, print out following statement  
            System.out.println("No roots were found in the specified range.");
        }
    }    

      


    static double poly(double[] C, double x){

        double sum = 0.0;
   
        for( int i = 0; i < C2.length; i++){ // Increment i as long as it is less than the array C2
	     C2[i] = C[i] * Math.pow(x, i); // Fill the spaces in C2 with the values of C * x raised to the power of i
        }
 
        for( int i = 0; i < C2.length; i++){
	     sum += C2[i]; // Find the sum of all the values in C2 
        }
   
        return sum; // This function returns a double, sum
    }

    static double[] diff(double[] C){ // Function to find derivative of polynomial
    
        for( int i = 0; i < n; i++){
	     D[i] = (i+1)*C[i+1]; // Loop to fill spaces in D array with (i+1) * the values in the array C + 1
        }
   
        return(D); // returns the array D
    }

   


    static double findRoot(double[] C, double a, double b, double tolerance){
        
        double root = 0.0;
        while( Math.abs(b-a) > tolerance ){ // Using the bisection method, find the root of polynomial
               root = (a + b)/ 2.0;
	   if ( poly(C, a)*poly(C,root) < 0 ){ // Call to function poly
                b = root;
	   }else{
                a = root;
	   }
	}
       	return root; // returns a double value, which is the root
    }
    
    
    
    static int isPos( double[] C, double a){
        
        double tempEP;
        tempEP = poly(C, a);

        if( tempEP < 0 ){ // Loop to see if endpoints are positive or negative
            return 1;
        }else if( tempEP > 0 ){
            return 2;
        }else{
            return 0;
        }
    }
}

