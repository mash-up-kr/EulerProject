package problem3;

public class problem3 {
	public static long getPrime(long num1){
		long num2 = 2;
		while(num1>1){
			if (num1 % num2 == 0)
				if (num1/num2 > 1)
					return getPrime(num1/num2);
				else
					break;
			else
				num2 += 1;
		}
		return num1;
	}
	public static void main(String[] args){
		long input_num = 600851475143L;
		long largest_prime = 0;
		largest_prime = getPrime(input_num);
		System.out.println(largest_prime);
	}
}
