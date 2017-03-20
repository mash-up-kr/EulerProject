import java.util.stream.IntStream;

/*
 * Multiples of 3 and 5
 * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면
 * 23입니다. 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
 */
public class Problem1 {

    public static void main(String[] args) {

        int sum = IntStream.range(1, 1000)  // 1 ~ 1000
                .filter(num -> (num % 3 == 0) || (num % 5 == 0))
                .sum();

        System.out.println(sum);  // 233168
    }
}
