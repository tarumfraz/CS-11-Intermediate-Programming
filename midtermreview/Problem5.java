// Problem5.java
class Problem5{
    // sum(): return 1+2+3+..+n
       static int sum(int n){
	   int total = 0, i =1;
           while( i  <= n){
	       total += i;
               i++;
               
	   }
	   return total;
     }
    // avg(): return average of {1,2,..,n}
    static double avg(int n){
	double avg =(double) sum(n)/n;
        return avg;
    }

    // ord(): return true if and only if x<y<z
        static boolean ord(double x, double y, double z){
	    if( x<y && y<z){
		return true;
            }else{
                return false;
     }
	}
    public static void main(String[] args){
        System.out.println(avg(12));
        System.out.println(ord(1.2, 3.4, 5.6));
        System.out.println(ord(3.4, 1.2, 5.6));
    }
}