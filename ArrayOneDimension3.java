import java.util.Scanner;

public class ArrayOneDimension3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a program that create an array of 10 element size.
		//Your program should prompt the users to input numbers in array
		//Display the sum of all array element
		
		final int num = 10;
		int[] numbers = new int[10];
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter numbers: ");
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		int sum = 0;
		for (int i=0; i<num; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum numbers = " + sum);
	}

}
