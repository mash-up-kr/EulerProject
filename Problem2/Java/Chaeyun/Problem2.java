/*
 * �Ǻ���ġ ������ �� ���� �ٷ� ���� �� �� ���� ���� ���� �˴ϴ�.
 * 1�� 2�� �����ϴ� ��� �� ������ �Ʒ��� �����ϴ�.
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
¦���̸鼭 4�鸸 ������ ��� ���� ���ϸ� �󸶰� �˴ϱ�?
 */
public class Problem2 {
	public static void main(String args[]) {
		double a = 1, b = 2, sum = 0;
		while(a <= 4000000) {
			double fib1 = a + b;
			if(a % 2 == 0)
				sum += a;
			a = b;
			b = fib1;
		}
		System.out.println("the answer is " + sum);
	}
}
