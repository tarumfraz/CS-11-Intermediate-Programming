// Problem7.java
import java.util.Scanner;
import java.io.*;
class Problem7{
    public static void main(String[] args){
	// your begins here
	Scanner sc = null;
	int count=0;
	double avg, item, sum = 0.0;

	if( args.length !=1){
	    System.out.println("error");
	    System.exit(1);
	}

	try{
	    sc = new Scanner(new File(args[0]));
	}catch( FileNotFoundException e ){
	    System.out.print("error");
	    System.exit(1);
	}
    
	while( sc.hasNextDouble() ){
	    item = sc.nextDouble();
	    sum += item;
	    count++;
	}

	avg = sum/count;
	System.out.println("The average value in file "+args[0]+"is "+avg);
    }
}
