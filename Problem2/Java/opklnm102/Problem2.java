import java.util.PrimitiveIterator;
import java.util.function.Predicate;
import java.util.stream.LongStream;

/*
 * Even Fibonacci numbers
 * 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
 *	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
 */
public class Problem2 {

	public static void main(String[] args) {
		new Problem2();
	}

	public Problem2() {
		FibonacciStreamBuilder builder = new FibonacciStreamBuilder();
		long sum = builder.getStream(x -> x < 4000000)
						.filter(x -> x % 2 == 0)
						.sum();

		System.out.println(sum); // 4613732
	}

	class FibonacciStreamBuilder {
		public LongStream getStream(Predicate<Long> predicate) {
			LongStream.Builder builder = LongStream.builder();
			FibonacciIterator iterator = new FibonacciIterator(predicate);
			while (iterator.hasNext()) {
				builder.add(iterator.nextLong());
			}
			return builder.build();
		}
	}

	class FibonacciIterator implements PrimitiveIterator.OfLong {

		private Predicate<Long> predicate;
		private long x;
		private long y;

		public FibonacciIterator(Predicate<Long> predicate) {
			this.predicate = predicate;
			x = -1;
			y = 1;
		}

		@Override
		public long nextLong() {
			long result = x + y;
			x = y;
			y = result;
			return result;
		}

		@Override
		public boolean hasNext() {
			return predicate.test(x + y);
		}
	}
}