import java.lang.Math;
public class Problem6 {
	public static void main(String args[]) {
		System.out.println(sumSquare(100) - squareSum(100));
	}

	static long squareSum(double number) {
		long squareSum = 0;
		for(int i = 1; i <= number; i++) {
			squareSum += Math.pow(i, 2);
		}
		return squareSum;
	}
	
	static long sumSquare(double number) {
		long sumSquare = 0;
		for(int i = 1; i <= number; i++) {
			sumSquare += i;
		}
		sumSquare = (long) Math.pow(sumSquare, 2);
		return sumSquare;
	}
}
