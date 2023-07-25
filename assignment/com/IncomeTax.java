package assignment.com;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] taxSlabs = {
				{0, 180000, 0},
				{180001, 300000, 10},
				{300001, 500000, 20},
				{500001, 1000000, 30}
				};

				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter your CTC (Cost to Company): ");
				double ctc = scanner.nextDouble();
				
				

				double taxAmount = calculateTax(ctc, taxSlabs);
				System.out.println("Tax amount: " + taxAmount);
				}

				public static double calculateTax(double ctc, double[][] taxSlabs) {
				double tax = 0;

				for (double[] slab : taxSlabs) {
				double startRange = slab[0];
				double endRange = slab[1];
				double taxPercentage = slab[2];

				if (ctc <= 0) {
				break;
				}

				if (ctc <= endRange) {
				tax += (ctc - startRange + 1) * (taxPercentage / 100);
				} else {
				tax += (endRange - startRange + 1) * (taxPercentage / 100);
				}

				ctc -= (endRange - startRange + 1);
				}

				return tax;
				}

	}


