package assignment.com;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Math marks");
        int a = sc.nextInt();
        System.out.println("Science marks");
        int b = sc.nextInt();
        System.out.println("Physics marks");
        int c = sc.nextInt();

        if(a>=60 && b>=60 && c>=60) {
            System.out.println("passed");
        }
            else if((a>=60 && b>=60) || (a>=60 && c>=60) || (b>=60 && c>=60)) {
                System.out.println("promoted");
            }
            else if((a>=60 || b>=60 || c>=60)||(a<60 && b<60 && c<60)){
                System.out.println("failed");
        }

    }
		

	}


