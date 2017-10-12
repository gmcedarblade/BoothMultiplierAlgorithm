/**
 * 
 */
package main;

import java.util.Scanner;

/**
 * @author gmcedarblade
 *
 */
public class Multiplier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int product;
		int multiplicand;
		int productInitialized;
		
		String productInBinary;
		String multiplicandInBinary;
		String step2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the decimal number to be the product.");
		product = scanner.nextInt();
		
		productInBinary = String.format("%8s", Integer.toBinaryString(product)).replace(' ', '0');
		
		System.out.println("You entered " + product + " as the product. That is " + productInBinary + " in binary.\n");
		
		System.out.println("Please enter the decimal number to be the multiplicand.");
		multiplicand = scanner.nextInt();
		
		multiplicandInBinary = String.format("%8s", Integer.toBinaryString(multiplicand)).replace(' ', '0');
		
		System.out.println("You entered " + multiplicand + " as the multiplicand. That is " + multiplicandInBinary + " in binary.\n");
		
		scanner.close();
		
		step2 = productInBinary + '0';
		
		System.out.println(step2 + "\n");
		
		productInitialized = Integer.parseInt(step2);
		
		System.out.println(productInitialized);
		
	}

}
