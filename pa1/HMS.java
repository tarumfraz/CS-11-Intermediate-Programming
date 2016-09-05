//-----------------------------------------------------------------------------
// HMS.java
// compute hours, minutes, and seconds
//-----------------------------------------------------------------------------

class HMS{

    public static void main(String[] args){

	double seconds = 3725.7;
	int h, m, s;
      
	s = (int) Math.round(seconds); // s = 3726
	m = s/60;
	s = s%60;
	h = m/60;
	m = m%60;
	System.out.println(seconds+" seconds is (to the nearest second) equal to:");
	System.out.println(h+" hours, "+m+" minutes and "+s+" seconds");
      
    }
}