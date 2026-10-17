import java.util.Scanner;

public class file1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double firstNumber = scanner.nextDouble();
		System.out.print("Enter the second number: ");
		double secondNumber = scanner.nextDouble();
		System.out.println("Sum: " + (firstNumber + secondNumber));
		scanner.close();
	}
}
