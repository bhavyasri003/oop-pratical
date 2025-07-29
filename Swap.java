package Practical;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int a,b,temp;
	     System.out.println("Enter tom number");
	     a=sc.nextInt();
	     System.out.println("Enter jerry number");
	     b=sc.nextInt();
	     System.out.println("Before swapping " +a +" " +b );
	     temp=a;
	     a=b;
	     b=temp;
	     System.out.println("After swapping "+a +" "+b);
	     sc.close();

	}

}
