/*
� ���� �Ҽ��� �����θ� ��Ÿ���� ���� ���μ����ض� �ϰ�, �� �Ҽ����� �� ���� ���μ���� �մϴ�.
���� ��� 13195�� ���μ��� 5, 7, 13, 29 �Դϴ�.
600851475143�� ���μ� �߿��� ���� ū ���� ���ϼ���.
 */
public class Problem3 {
	public static void main(String args[]) {
		long  num = 600851475143L;
		int divider = 0;
		for(divider = 2 ; divider < num; divider++) {
			if(num % divider == 0)
				num = num / divider;
		}
		System.out.println("the answer is " + divider);
	}
}