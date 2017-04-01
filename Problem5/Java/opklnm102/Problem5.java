import java.util.stream.IntStream;

/**
 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
 * 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 *
 * 1 ~ 10의 최소공배수는 2520
 * 1 ~ 20의 최소공배수 구하기
 *
 * 최소공배수를 구하려면 최대공약수 이용
 * 최대공약수를 구하려면 유클리드 호제법 이용
 */
public class Problem5 {

    public static void main(String[] args) {

        int result = IntStream.iterate(11, x -> x + 1)
                .filter(Problem5::isModFrom1to20)
                .findFirst().getAsInt();

        System.out.println(String.valueOf(result));  // 232792560
    }

    public static boolean isModFrom1to20(int num) {
        return IntStream.range(2, 20)
                .noneMatch(x -> num % x != 0);
    }
}