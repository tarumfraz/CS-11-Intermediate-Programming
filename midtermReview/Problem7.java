// Problem7.java
class Problem7{
    public static void main(String[] args){
	int [] list = {3, 9, 6, 12, 23, -25, 54, 9, 0, -12, 27};
	System.out.println(list[getMaxIndex(list)]); // prints 54
	System.out.println(list[getMinIndex(list)]); // prints -25
    }
    static int getMaxIndex(int[] A){
    
        int Max = A[0];
        for( int i = 0; i < A.length ; i++){
	    if( A[i] > A[ Max ]){
                Max = i;
	    }
	}        
        return Max;
    }

   
    static int getMinIndex(int[] A){
	int Min = A[0];
	for( int i = 1; i < A.length ; i++){
	    if( A[i] < A[Min] ){
                Min = i;
            }

	}
	
        return Min;
    }
}