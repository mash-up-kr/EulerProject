import java.util.stream.IntStream;

/*
 * Largest palindrome product
 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
 * 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
 * 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
 */
public class Problem4 {

    public static void main(String[] args) {

        int max = IntStream.range(100, 1000)
                .flatMap(x ->
                        IntStream.range(100, 1000)
                                .map(y -> x * y))
                .filter(Problem4::isPalindrome)
                .max().getAsInt();

        System.out.println(max);  // 906609
    }

    static boolean isPalindrome(int num) {
        StringBuilder sbNum = new StringBuilder(String.valueOf(num));
        String strReverseNum = sbNum.reverse().toString();

        return num == Integer.parseInt(strReverseNum);
    }
}
