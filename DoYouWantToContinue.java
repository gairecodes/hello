package corejava;  //class khojna pare projrct name ani src file ani source file vitra package hunxa ra package is also called related collection of class
import java.util.Scanner;
public class DoYouWantToContinue {
	
	public static int num;
	
	public static void main(String[] args) {
		//bsil float double char =2 bytes 
		Scanner sc = new Scanner(System.in);
		    
		
		do {
			
			System.out.println("enter any num");
			 num =sc.nextInt();
		    if(num>=0) {
		    	System.out.println("successfully logged in");
		    }
		    else {
		    	break;
		    }
		    
			
		}while(num>=0);
		System.out.println("exit");
		sc.close();
	}

}
