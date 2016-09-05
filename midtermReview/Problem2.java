// Problem2.java

class Problem2{
  
    public static void main( String[] args ){

	int[] A = {1, 2, 3};

        int[] B = {1, 2, 3};

        printArray(concatenate(A,B));
  
    }

    static int[] concatenate(int[] A, int[] B){
        int x = A.length + B.length;
        int[] C  = new int[x];
        for( int i = 0 ; i < A.length; i++){
	    C[i] = A[i];
	}
        for( int i = A.length; i < x; i++ ){
	    C[i] = B[i-A.length];
        }
	
	return C;
    }



    static void printArray(int[] A){
	System.out.print("( ");
	for(int i=0; i<A.length; i++)
	    System.out.print(A[i]+" ");
	System.out.println(")");
    }
}
