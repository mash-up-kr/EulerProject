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
                .limit(mLimit - 2)  // 5부터 시작이라고 생각 -> 2, 3에 해당하는 수 빼줌
                .max().getAsLong();
    }

    /*
      5일 때 false가 나와서 조건 추가
     */
    private boolean isPrime(long num) {
        return num == 5 || LongStream.iterate(3, x -> x + 2)
                .limit(new Double(Math.sqrt(num)).longValue())
                .noneMatch(x -> num % x == 0);
    }
}
