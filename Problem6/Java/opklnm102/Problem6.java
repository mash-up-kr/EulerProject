import java.util.stream.IntStream;

/*
1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
12 + 22 + ... + 102 = 385
1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
(1 + 2 + ... + 10)2 = 552 = 3025
따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
 */
public class Problem6 {

    public static void main(String[] args) {

        int sumOfSquare = generatorSumOfSquare(100);
        int squareOfSum = generatorSquareOfSum(100);

        System.out.println(squareOfSum - sumOfSquare);  // 25164150
    }

    // 합의 제곱
    public static int generatorSquareOfSum(int max) {
        int sum = IntStream.rangeClosed(1, max)
                .sum();
        return (int) Math.pow(sum, 2);
    }

    // 제곱의 합
    public static int generatorSumOfSquare(int max) {
        return IntStream.rangeClosed(1, max)
                .map(x -> (int) Math.pow(x, 2))
                .sum();
    }
}
