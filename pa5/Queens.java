// Queens.java
// Tarum Fraz
// tfraz
// pa5
// This program finds and prints solution to the classic N-queens problem

class Queens{

    public static int pivot;
    public static int successor;
    public static int queens;
    public static int totalSolutions;

    public static void main(String[] args){

        boolean vFlag = false;

        if(args.length >= 1){ // Control what is printed out based on what the user enters using string array

            if(isNum(args[0])){
               queens = Integer.parseInt(args[0]);    

            }else if(args[0].equals("-v") && isNum(args[1])){
                vFlag = true;
                queens = Integer.parseInt(args[1]);
	
	    }else{
		 System.out.println("Usage: Queens [-v] number");
		 System.out.println("Option: -v verbose output, print all solutions");
		 System.exit(0);
	    }		   
      
	}else{
	    System.out.println("Usage: Queens [-v] number");
	    System.out.println("Option: -v verbose output, print all solutions");
	    System.exit(0);

        }
    
   
        int[] A = new int[queens+1]; // Create our original array

        for(int i = 0; i<A.length; i++){

            A[i] = i;

        }

        
        int total = factorial(queens); // Call the array factorial amount of times


        for(int i = 0; i<total; i++){ // If it is a solution to N-queens, print it out

            if(isSolution(A)){
               totalSolutions++;
               
               if(vFlag){
                  printArray(A);
               }
            }

            nextPermutation(A);
        }

        System.out.println(queens + "-Queens has " + totalSolutions + " solutions");


    }



    static boolean isSolution(int[] A){ // Boolean to check if permutation is a solution

        int hd;
        int vd;
        boolean noDiag = true;

        for(int i = 1; i <A.length; i++){

            for(int j = i + 1; j<A.length; j++){

                if(j == i){
                    continue;

                }else if(j !=i){
                    hd =Math.abs(i-j);
                    vd =Math.abs(A[i]-A[j]);

                if(hd == vd){
                    noDiag = false;
                }
                }
            }
        }

        if(noDiag == true){
            return true;

        }else{
            return false;
        }
    }



    static void printArray(int[] A){ // helper function to print out Arrays

        System.out.print("(");

        for(int i=1; i<A.length - 1; i++){
            System.out.print(A[i]+", ");
        }

        for(int j= A.length -1; j< A.length; j++){
            System.out.print(A[j]);
        }

        System.out.println(")");
    }



    static void nextPermutation(int[] A){ // Function which permutes the arrays 

        pivot = 0;
        successor = 0;

        for(int i = A.length-2; i>0; i--){

            if(A[i] < A[i+1]){
                pivot = i;
                break;
            }
        }


        if(pivot == 0){
            reverse(A);
            return;
        }

        for(int i = A.length-1; i>0; i--){

            if(A[i] > A[pivot]){
                successor = i;
                break;
            }
        }

        swap(pivot, successor, A);
        reverse2(A);

    }





    static int factorial(int n){ // Helper function to find factorial

        if(n>1){
            return n*factorial(n-1);

        }else{
            return 1;
        }

    }



    static  boolean isNum(String s){ // Boolean to check if a string can be parsed into int

        try{
            Integer.parseInt(s);
            return true;

        }catch(NumberFormatException e){
            return false;

        }
    }



    static void swap(int a, int b, int[] A){ // Helper function to swap values in array

        if( a>0 && b>0 && a < A.length && b< A.length){
            int temp = A[a];
            A[a] = A[b];
            A[b] = temp;
        }

    }



    static void reverse(int[] A){ // Helper function to reverse an array, aids in finding permutation

        for(int i=1, j = A.length-1; i<j; i++, j--){
            swap(i,j,A);
        }
    }



    static void reverse2(int[] A){

        for(int i= pivot + 1, j = A.length-1; i<j; i++, j--){
            swap(i,j,A);

        }
    }
}



