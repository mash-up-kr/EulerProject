public class problem2 {
	public static void main(String[] args){
		int add = 0;
		int n1 = 0, n2 = 1;
		int n3 = n1 + n2;
		
		while(n3 <= 4000000){
			if(n3 % 2 == 0)
				add += n3;
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println(add);
	}
}
