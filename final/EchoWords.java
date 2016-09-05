import java.util.Scanner;

class EchoWords{
    public static void main( String[] args ){
     
	Scanner sc = new Scanner(System.in);

        String str;

	while( sc.hasNext() ){
	    str = sc.next();
	    if (str.equals("galumph") ){
		System.out.println("bye!");
		System.exit(1);
	    }else{
		System.out.println(str);
	       
	    }
	}
    }
}