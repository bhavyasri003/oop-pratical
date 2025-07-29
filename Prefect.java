package Practical;
import java.util.Scanner;
public class Prefect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n,sum=0;
	    System.out.println("enter the number");
	    n=sc.nextInt();
	    for(int i=1;i<n;i++) 
	    {
	    	if(n%i==0) 
	    	{
	    		sum+=i;
	    	}
	    }
	    	if(sum==n) {
	    		System.out.println("It is a prefect number");
	    	}
	    	else {
	    		System.out.println("It is not a prefect number");
	    	}
	    	sc.close();
	}

}
