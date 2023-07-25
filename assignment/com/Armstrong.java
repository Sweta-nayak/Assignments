package assignment.com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,arm=0,rem,c;
		System.out.println("Enter any number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		c=n;
		while(c>0)
		{
		rem=c%10;
		arm=(rem*rem*rem)+arm;
		c=c/10;
	    }
		if(n==arm)
			System.out.print("Is Armstrong Number");
		else
			System.out.print("Not a Armstrong Number");

	}
}


