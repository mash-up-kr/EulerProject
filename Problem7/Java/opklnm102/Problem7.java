import java.util.stream.LongStream;

/*
소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
이 때 10,001번째의 소수를 구하세요.
 */
public class Problem7 {

    public static void main(String[] args) {
        long result = new GeneratorPrime(10_001).generate();

        System.out.println(result);  // 104743
    }
}

class GeneratorPrime {

    private int mLimit;

    public GeneratorPrime(int limit) {
        mLimit = limit;
    }

    public long generate() {
        return LongStream.iterate(3, x -> x + 2)  // 소수는 홀수이므로 홀수만 검사
                .filter(this::isPrime)
                .limit(mLimit - 1)  // 3부터 시작 2를 제외
                .max().getAsLong();
    }

    private boolean isPrime(long num) {
        for (int i = 3; i < num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
