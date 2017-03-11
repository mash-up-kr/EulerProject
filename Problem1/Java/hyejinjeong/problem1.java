public class problem1 {
	public static int numberOfMultiple(int num, int size){
		int last = (size -1)/num;
		return (1+last)*last/2;
	}
	
	public static int sumOfMultiple(int num, int size){
		return num * numberOfMultiple(num, size);
	}

	public static void main(String[] args){
		int three = sumOfMultiple(3, 1000);
		int five = sumOfMultiple(5, 1000);
		int fifteen = sumOfMultiple(15, 1000);
		
		int answer = three + five - fifteen;
		System.out.println(answer);
	}
}
