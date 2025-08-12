package Practical2;
import java.util.Scanner;
public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter the first string");
	    s1=sc.nextLine();
	    System.out.println("Enter the second string");
	    s2=sc.nextLine();
	    if(s1 == s2) {
	    	System.out.println("stored in same memory location");
	    }
	    else {
	    	System.out.println("Are not stored in same memmory location");
	    }
	    if(s1.equals(s2)) {
	    	System.out.println("Both strings have same content");
	    }
	    else {
	    	System.out.println("Both strings do not have same content");
	    }
	    sc.close();
	    

	}

}
