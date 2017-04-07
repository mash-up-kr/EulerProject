public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int first = 1;
		int second = 2;
		int result = 0;

		// System.out.print(first + " " + second + " ");
		sum = second;

		while(result <= 4000000) {
			result = first + second;

			if(result % 2 == 0) {
				sum += result;
			}
			// System.out.print(result + " ");

			first = second;
			second = result;
		}
		System.out.println(sum);
	}
}
