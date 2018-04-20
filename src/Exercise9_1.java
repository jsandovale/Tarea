
public class Exercise9_1 {
	
	public static void checkFermat(int a, int b, int c, int n) {
		if(Math.pow(c, n) != Math.pow(a,n) + Math.pow(b, n))
			System.out.println("No, that doesn’t work.");
		else {
			if(n>2)
				System.out.println("Holy smokes, Fermat was wrong!");
			else
				System.out.println("check");
			}
	}

	public static void main(String[] args) {
		checkFermat(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
	}

}
