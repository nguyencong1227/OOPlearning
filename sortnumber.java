import java.util.Arrays;
import java.util.Scanner;
public class sortnumber {
        public static void main (String [] args) {
		int n;
                Scanner scanner = new Scanner(System.in);
		do{
			System.out.print("enter number of element: ");
			n = scanner.nextInt();
		}while (n<0);

		int array[] = new int[n];
		System.out.println("enter element: ");
		for (int i = 0; i < n; i++){
			System.out.print("enter the element " + (i+1) + ": ");
			array[i] = scanner.nextInt();
		}
                Arrays.sort(array);
		System.out.println("Sorting number");
                for (Object number : array){  

                        System.out.println("Number = " + number);
                }
	}
}

