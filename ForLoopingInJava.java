package corejava;
import java.util.Scanner;

public class ForLoopingInJava {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the size of an array");
		
		int size = sc.nextInt();//espaxi feri pani input lina xa 
		//vane autumatically paxi input lida previous sc.nextInt(); bata new line aauxa jasle 
		//garda jhyeu hunxa so use sc.nextLine();
		
		//ie aajhai ramro sanga vanda input buffer ma vako sabai linxa tra new line character linna
		//jun paxi arko input line chij(variable) le linxa  arko sc.next() fun bata ra new line 
		//input leko jasari swatta bahira aauxa
		//so we need to make consume this thing in input buffer by extra reading function which can 
//		take this fokatiya new line 
//		remember thar hamle enter gareko kura first ma input buffer ma janxa ra paxi enter dabesi variable ma xirxA
//		tra xirne bela ma aru content xirxa tra new line xirdaina jun paxi xirera wakk hanxa
//		
		sc.nextLine();
		
		System.out.println("size is"+size);
		
		String[] str = new String[size]; //creating array of length to be mentioned dynamically
		
		//taking input for the array
			for(int i=0; i<size; i++) {
				System.out.println("enter the "+(i+1)+" element:");
				str[i]=sc.nextLine();
			
		     }
			
			
			
			//displaying the array elements
			for(int i=0 ; i<size ; i++) {
				System.out.println(i+1+"element is\t"+str[i]);
			}
			sc.close();
	}
    
}
