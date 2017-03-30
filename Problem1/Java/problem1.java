public class main {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;

		for(i=0; i<1000; i++) {
			if(i%5==0 || i%3==0) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
}
