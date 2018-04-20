	import java.util.Scanner;
	import java.util.Random;

public class Exercise9_2 {
	public static void main(String[] args) {
		System.out.print("I'm thinking of a number between 1 and 100\r\n" + 
		"(including both). Can you guess what it is?\n" + "Type a number: ");
		Random random = new Random();
		guess(-1,random.nextInt(100) + 1);
		}

	public static void guess(int a, int b) {
		Scanner in = new Scanner(System.in);
		if(a!=b) {
			if(a==-1)//caso inicial
				guess(Integer.parseInt(in.nextLine()),b);
			else if(a>b)
				System.out.println("Too high.");
			else if(a<b)
				System.out.println("Too low.");
			guess(Integer.parseInt(in.nextLine()),b);
		}
		else
			System.out.println("gratz, you where right");
	}	
}
