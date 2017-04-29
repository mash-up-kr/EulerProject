/*
1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
*/
import java.lang.Math;
public class Problem5 {
	static double limit = 20;
	public static void main(String args[]) {
		int n = 1;
		int result = 1;
		
		for(int i = 2; i < limit; i++) {
			if(checkPrimeFactor(i)) {
				n = getPower(i);
				result *= Math.pow(i, n);
			}
		}
		System.out.println(result);
	}
	
	static int getPower(int number) {
		int i = 0;
		while(Math.pow(number, i) <= limit)
			i++;
		return (i-1);
	}
	
	static Boolean checkPrimeFactor(int number) {
		for(int i = 2; i < number; i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}
}