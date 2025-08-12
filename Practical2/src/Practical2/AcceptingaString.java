package Practical2;
import java.util.Scanner;
public class AcceptingaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter  a string: ");
      String str=sc.nextLine();
      System.out.println("Enter the index number");
      int i=sc.nextInt();
      System.out.println("character at index :" +str.charAt(i));
      System.out.println("length of a string: " +str.length());
      System.out.println("Upper case: " +str.toUpperCase());
      System.out.println("Lower case: "+str.toLowerCase());
      if(str.length()>=6) {
    	  System.out.println("Substring index 0 to 6: " +str.substring(0,6));
      }
      else {
    	  System.out.println("String is short for substring(0,6).");
      }
      System.out.println("Enter the string");
      sc.next();
      String sty=sc.nextLine();
      System.out.println(str.contains(sty));
      System.out.println("enter the characters");
      char b=sc.next().charAt(0);
      char a=sc.next().charAt(0);
     System.out.println( str.replace(b,a));
   sc.close();
	}

}
