//-----------------------------------------------------------------------------
//
//   CheckInput2.java
//
//   This program continues to prompt for input from the user until three 
//   positive doubles have been entered.  Nothing is done with these double 
//   values.  This example may be of some use in the design of the input 
//   checks for some programs.
//
//-----------------------------------------------------------------------------

import java.util.Scanner;

class CheckInput2{

    public static void main( String[] args ){

	Scanner sc = new Scanner(System.in);
	int i;

	// get three positive doubles from the user
	for(i=0; i<3; i++){

	    System.out.print("Enter a positive double: ");
	    while(true){ // seemingly infinite loop
            
		while( !sc.hasNextDouble() ){ // if its not a double
		    sc.next(); // discard the non-double
		    System.out.print("Please enter a positive double: "); // ask again
		} // at this point we have a double in the input stream, unread
            
		if( sc.nextDouble()>0 ) break; // read it, and get out of the loop if its positive
		System.out.print("Please enter a positive double: "); // otherwise ask again
	    }
	    // break lands here

	}
	// do the whole thing 3 times and end up here
	System.out.println("bye!");
      
    }
}