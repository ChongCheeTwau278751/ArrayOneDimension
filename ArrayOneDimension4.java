import java.util.Scanner;

public class ArrayOneDimension4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The variable list1 and list2 are reference arrays that each have 5 elements
		//Write code that copies the values in list1 to list2
		//Values in list1 are input by user.
		Scanner in = new Scanner (System.in);
		int[] List1 = new int[5];
		int[] List2 = new int[5];
		//List1 = List2
		
		System.out.println("Enter five numbers for List One: ");
		for (int i=0; i<List1.length; i++) {
			List1[i] = in.nextInt();
		}
		
		System.out.println("List One: ");
		for (int i=0; i<List1.length; i++) {
			System.out.println(List1[i]);
		}
		
		System.out.println("List Two: ");
		for (int i=0; i<List2.length; i++) {
			//List1 = List2
			List2[i] = List1[i];
			System.out.println(List2[i]);
		}
	}

}
