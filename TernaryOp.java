
package corejava;

import java.util.Scanner;
public class TernaryOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter your voting age");
		 
		 int votingAge = 18;
		 
		 int userAge =sc.nextInt();
		 
		 String result = (userAge>=votingAge)?"ready to vote":"not ready to vote";
		 
		 System.out.println(result);
		 
	}

}
