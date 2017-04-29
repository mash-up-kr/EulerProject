
public class problem5 {
	
	public static void main(String[] args){
		int num = 1;
		int answer = 1;
		int copy = 1;
		
		for(int i=1; i<=20; i++){
			num = i;
			for(int j=1; j<i; j++){
				if(num%j == 0 && copy%j == 0){
					num = num/j;
					copy = copy/j;
					j = 1;
				}
			}				
			answer *= num;
			copy = answer;
		}
		System.out.println(answer);
	}
}
