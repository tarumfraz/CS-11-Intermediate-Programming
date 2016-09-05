import java.util.Scanner;

class Problem4{
public static void main( String[] args ){
   
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
   
    System.out.println(sum(x));

}

    static int sum(int n){
        int count = 0;
	for( int i = 1; i <= n; i++){
            count += i;
        }
        return count;
    }
}