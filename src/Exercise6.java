import java.util.Scanner;
import java.util.Random;



public class Exercise6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("I'm thinking of a number between 1 and 100\r\n" + 
				"(including both). Can you guess what it is?\n" + "Type a number: ");
		int numero = Integer.parseInt(in.nextLine());
		Random random = new Random();
		int objetivo = random.nextInt(100) + 1;
		if(numero != objetivo)
			System.out.printf("\n The number I was thinking of is: %d \n You were off by: %d", objetivo, Math.abs(objetivo - numero));
			
		else
			System.out.println("gratz, you where right");
	}

}
