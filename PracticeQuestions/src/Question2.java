import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CountUpTo a number the user has entered
		
		System.out.println("Enter number to count up to: ");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int a;
		
		System.out.println("Thanks... ");
		
		for(a= 1; a<=i; a++) {
			
			System.out.println(a);
			}
		sc.close();
	}
}