/*Fresher training 2022
*Author ToanPDT
*Date Feb 28, 2022
*Study assignment
*/
package fa.training.assignment2;
import java.util.Scanner;

public class CylinderComputation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*trong đề em không tìm thấy
		 *giá trị của radius và height
		 *chỉ thấy có output nên em tự tính
		 *nhưng không gán cho trong code này
		*/
		double radius = sc.nextDouble();  //radius em tính là 12.5
		double height = sc.nextDouble();  //height em tính là 4
		sc.close();
		double surfaceArea = 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
		double baseArea = Math.PI*radius*radius;
		double volume = Math.PI*radius*radius*height;
		System.out.println("Surface area = " + surfaceArea);
		System.out.println("Base area = " + baseArea);
		System.out.println("Volume = " + volume);

	}

}
