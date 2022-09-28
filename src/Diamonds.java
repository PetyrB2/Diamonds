import java.util.Scanner;

// Diamond Challenge using a For Loop

public class Diamonds {

	public static void main(String[] args) {
		// Scanner used to request input from User
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");

		int n = sc.nextInt();

		// This code is added to handle exceptions such as over 100 or 0
		if (n > 100 || n == 0)  {
			
			System.out.println("Number of Rows cannot be over 100 and cannot be 0");
			
		}
		// This exception is added to handle Negative Row values
		else if (n < 0) {
			
			System.out.println("Number of Rows cannot be less than 0");
		}
		else {
		System.out.print("Enter the Symbol to build the Diamond: ");
		}
		// Set input as variable c
		char c = sc.next().charAt(0);
		// For loop for i
		for (int i = 1; i <= n; i++) {
			// For loop for j
			for (int j = 1; j <= n - i; j++)

			{
				//Print the spaces
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++)

			{
				System.out.print(c);
			}
			System.out.println();

		}
		
		// Second half of Diamond - The above backwards. 
		// In essence 2 Triangles.
		// One upright and one upside down.
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++)

			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++)

			{
				System.out.print(c);
			}
			System.out.println();
		}

	}
}