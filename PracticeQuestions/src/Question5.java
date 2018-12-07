import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SumToN
		//User to type number 'n'. Sum of numbers 1 to n
		
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a; 
		
		for(a= 1; a<=n; a++) {
			a = a + n;
			
		}
		
		sc.close();
	}

}
