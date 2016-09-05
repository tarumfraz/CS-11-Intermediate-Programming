
// pa3
// Tarum Fraz
// tfraz
// GCD.java
// This program prompts the user to enter two positive integers, and keeps asking
// until the appropiate input is entered. Then the program prints out the greatest common
// divisor of the two positive integers that were entered

import java.util.Scanner;

class GCD{

    public static void main( String[] args ){
       
       int posInt1, posInt2, a , b;
       Scanner sc  = new Scanner(System.in);
       
       System.out.print("Enter a positive integer: "); 
       
       while(true){ // Infinite loop that only ends when positive integer is entered
           while( !sc.hasNextInt() ){ // While the next token entered is NOT an integer 
	          sc.next(); // Throw it away
                  System.out.print("Please enter a positive integer: ");
           }           
                   
       posInt1 = sc.nextInt();
                   
           if( posInt1  > 0 ){ 
	       break; // Break if integer is positive
           }else{   
                  System.out.print("Please enter a positive integer: ");
           }
       }        
       
       // Break ends up here                
       
       System.out.print("Enter another positive integer: ");         
       
       while(true){ // Seemingly endless loop for second integer
           while( !sc.hasNextInt() ){
                   sc.next();
                   System.out.print("Please enter a positive integer: ");
           }
           
       posInt2 = sc.nextInt();

           if(  posInt2 > 0 ){
                break;
           }else{
                System.out.print("Please enter a positive integer: ");
           }
       }
                 
       
       a = posInt1; // a is the dividend 
       b = posInt2; // b is the divisor
            
       if( a > b){
	   do{ // do-while loop for Euclidean algorithm
               int r = a % b; // r is the remainder
               a = b; // the dividend is now the divisor
               b = r; // the divisor is not the remainder
       }while( b > 0 ); // the LRC is b, which holds the value of the remainder should be greater than 0 
	       System.out.println("The GCD of " + posInt1 + " and " + posInt2 + " is " + a + "\n" ); // a would be last non-zero int in algorithm
              
       }else{  // flip a & b 
            do{ 
               int r = b % a;
               b = a;  
               a = r;
       }while( a > 0 );
       	       System.out.println("The GCD of " + posInt1 + " and " + posInt2 + " is " + b + "\n" );        	
               
       }
    }
}