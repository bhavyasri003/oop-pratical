package Practical;

import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     float bill,gst,main,total;
	     double finalamt;
	     String discount;
	     System.out.println("enter the numbers of bill,gst,main charges");
	     bill=sc.nextFloat();
	     gst=sc.nextFloat();
	     main=sc.nextFloat();
	     total=bill+gst+main;
	     if(total>=1000) {
	    	 discount="10%";
	    	 finalamt=total-(0.1*total);
	     } else {
	    	 discount="5%";
	    	 finalamt=total-(0.05*total);
	     }
	     System.out.println("Bill: "+bill+ " \nGST: "+gst+" \nMaintenance charges: "+main+" \nTotal amount: "+total+" \nDiscount: "+discount+" \nFinal amount: "+finalamt);
	     sc.close();

	}

}
