
import java.math.*;

public class PreLab {

	public PreLab() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compare();
		growth();

	}

	public static double funcB(int x) {
		// N^2
		double result;
		result = x * x;
		return result;
	}

	public static double funcA(int x) {
		// N*150 * logN
		double result;
		result = ((150 * x) * (Math.log10(x)));
		return result;
	}

	public static void compare() {

		for (int x = 1; x < 10000; x++) {
			double resultA = funcA(x);
			double resultB = funcB(x);
			if (resultB < resultA) {
				System.out.println("Index = " + x);
//				System.out.println("Result A = " + resultA);
//				System.out.println("Result B = " + resultB + "\n");
			} else {
				System.out.println("****************************************************************************");
			}
		}
	}
	
	public static void growth(){
		for (int i = 0; i < 1000; i++){
			double resultA = funcA(i);
			int growth = (int) (resultA / i);
			System.out.println(growth);
		}
	}

}
