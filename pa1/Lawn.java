// Lawn.java
// Tarum Fraz
// tfraz
// pa1
// This program interacts with the user by taking typed inputs, doing some calculations
// and printing out the result or output to the screen. This program prompts the user 
// to enter lengths and widths of their lot and house, prints out area, prompts user
// again to enter the mowing rate, and then prints out the mowing time.

import java.util.Scanner;

class Lawn{
   
   public static void main( String[] args ){

      double lengthL, widthL, lengthH, widthH, mowingRate, area, x;
      int h, m, s;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the length and width of the lot, in feet: ");
      lengthL = sc.nextDouble(); // Tells program that next double entered is length of lot
      widthL  = sc.nextDouble(); // Tells program that next double entered is width of lot

      System.out.print("Enter the length and width of the house, in feet: ");
      lengthH = sc.nextDouble();
      widthH = sc.nextDouble();

      area = (lengthL*widthL)-(lengthH*widthH); // Calculations to find area of lawn
      System.out.println("The lawn area is " + area + " square feet.");
     
      System.out.print("Enter the mowing rate, in square feet per second: ");
      mowingRate = sc.nextDouble();
        
      x = area/mowingRate; // Calculations to give the double value in seconds
      s = (int) Math.round(x); // Rounds up seconds and converts into integer
      m =  s/60; // Math expressions to convert into hours, minutes, & seconds
      s =  s%60;
      h =  m/60;
      m =  m%60;
	
      // Prints out mowing time to screen, followed by necessary boolean functions to assist with whether words are plural or single 
      System.out.println("The mowing time is " + h + " hour" + (h==1?" ":"s ") + m + " minute" + (m==1?" ":"s ") + s + " second" + (s==1?".":"s."));
   }
}