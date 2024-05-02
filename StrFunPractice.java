package corejava;

public class StrFunPractice {
/* 
 stringwalavariable.length()
 variable.toUpperCase()
 variable.toLowerCase()
 Varible.indexOf
firstvar.concat(second var)
 */
	public static void main(String[] args) {
		
		String name = "roshan is a killer";
		System.out.println("upper cased string is "+name.toUpperCase());
		int index = name.indexOf('s');
		
		if(index!=-1) {
			System.out.println("index of s is "+index);
		}
		else {
			System.out.println("lette is not found");
		}
	}
}
