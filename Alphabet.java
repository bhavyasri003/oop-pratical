package Practical;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("enter the value");
		ch=sc.next().charAt(0);
		  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			   System.out.println("It is an alphabet");
			  }
			  else {
			   System.out.println("It is not an alphabet");
			  }
			sc.close();

	}

}
