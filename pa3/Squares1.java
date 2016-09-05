//-----------------------------------------------------------------------------
// Squares1.java
// Computes the first 20 perfect squares.
//-----------------------------------------------------------------------------

class Squares1{

    public static void main(String[] args){
   
	int i, n=20;
      
	i=1;
	while( i<=n ){
	    System.out.println(i*i);
	    i += 1;  // same as i = i + 1, same as i++, same as ++i
	}
	System.out.println("i = "+i);
      
    }
}