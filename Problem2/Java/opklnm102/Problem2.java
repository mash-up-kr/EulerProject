import java.math.BigInteger;

/*
 * Even Fibonacci numbers
 * 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
 *	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
 */
public class Problem2 {
	public static void main(String[] args) {

		int sum = 2;

		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("2");
		BigInteger even = new BigInteger("2");
		BigInteger n3;

		while (n2.intValue() < 4000000) {
			n3 = n1.add(n2);
			if (n3.mod(even).intValue() == 0) {
				sum += n3.intValue();
			}
			n1 = n2;
			n2 = n3;
		}

		System.out.println(sum); // 4613732
	}
}
