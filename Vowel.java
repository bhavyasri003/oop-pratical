package Practical;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter the alphabet");
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		     System.out.println("It is a vowel");
		    }
		    else {
		     System.out.println("It is a consonent");
		    }
		sc.close();

	}

}
