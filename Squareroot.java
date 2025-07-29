package Practical;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		double Squareroot=Math.sqrt(i);
		System.out.println("Squareroot of "+i + "=" +Squareroot);
		sc.close();
		}

	}

}
