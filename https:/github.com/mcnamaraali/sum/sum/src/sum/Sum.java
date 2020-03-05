package sum;

public class Sum {

	public static void main(String[] args) {
		
		int total = 0; 
		//total even integers from 2 through 20
		for (int counter = 2; counter<=20; counter += 2) {
			total += counter;
		}
		System.out.printf("Sum is %d%n", total);

	}

}
