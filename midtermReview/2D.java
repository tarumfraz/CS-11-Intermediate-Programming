class twoD{
    public static void main( String[] args ){
	int[][] A = {{ 1, 2 },{ 3, 4 }};


        int[][] B = new int[2][2];
	for( int i = 0; i < 2; i++ ){
	    for( int j = 0; i <2; i++ ){
		B[i][j] = A[j][i];
            }

        }
       
	for( int i = 0;i < 2; i++ ){
	    for( int j = 0; i <2; i++ ){
		System.out.println(B[i][j]+ " " );
            }
	}
    }
}