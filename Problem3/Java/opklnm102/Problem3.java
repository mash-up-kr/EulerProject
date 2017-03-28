/*
 * Largest prime factor 
 * 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
 * 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
 * 
 * 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
 */
public class Problem3 {

	public static void main(String[] args) {

		long n = 600851475143L;
		long maxFactor = 0;
		
		for(long i=3; i<=Math.sqrt(n); i+=2){
			if(n % i == 0){
				if(oddIsPrime(i)){
					maxFactor = i;
				}
			}
		}
		System.out.println(maxFactor);
	}
	
	static boolean oddIsPrime(long oddValue){
		
		for(long i = 3; i<= Math.sqrt(oddValue); i+=2){
			if(oddValue % i == 0){
				return false;
			}
		}
		return true;
	}
}
