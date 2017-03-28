import java.util.OptionalLong;
import java.util.stream.LongStream;

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

        OptionalLong maxFactor = LongStream.iterate(3, x -> x + 2)
                .limit(new Double(Math.sqrt(n)).longValue())  // 루트n까지의 홀수 생성
                .filter(x -> n % x == 0)  // 나누어 떨어지는지
                .filter(Problem3::isPrime)  // 소수인지
                .max();  // 최대값

        maxFactor.ifPresent(System.out::println);  // 값이 있으면 출력
    }

    // 나누어 떨어지는 홀수가 소수인지 판별
    static boolean isPrime(long num) {
        return LongStream.iterate(3, x -> x + 2)
                .limit(new Double(Math.sqrt(num)).longValue())
                .noneMatch(x -> num % x == 0);
    }
}
