/*Fresher training 2022
*Author ToanPDT
*Date Feb 28, 2022
*Study assignment
*/
package fa.training.assignment2;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		int num1 = sc.nextInt();
		System.out.println("Input second number: ");
		int num2 = sc.nextInt();
		System.out.println("Input third number: ");
		int num3 = sc.nextInt();
		System.out.println("Input fourth number: ");
		int num4 = sc.nextInt();
		System.out.println("Input fifth number: ");
		int num5 = sc.nextInt();
		sc.close();
		System.out.println("The sum is " + (num1 + num2 + num3 + num4 + num5));

	}

}
