import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CountUpTo-a number the user has entered-InMultiplesOfThrees
		
System.out.println("Enter number to count up to and I will count in multiples of 3: ");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int a;
		
		System.out.println("Thanks... ");
		
		for(a= 0; a<=i; a = a + 3) {
			
			System.out.println(a);
			}
		sc.close();
		
	}
}
