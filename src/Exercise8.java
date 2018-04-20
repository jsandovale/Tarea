
public class Exercise8 {

	public static void printAmerican(String name, String day, String month, String year) {
		System.out.print(name + ", ");
		System.out.print(month + " ");
		System.out.print(day + ", ");
		System.out.println(year + ". ");
	}
	
	public static void printEuropean(String name, String day, String month, String year) {
		System.out.print(name + ", ");
		System.out.print(day + " ");
		System.out.print(month + ", ");
		System.out.println(year + ". ");
	}
	
	public static void main(String[] args) { //name dd mm yy
		printAmerican(args[0],args[1],args[2],args[3]);
		printEuropean(args[0],args[1],args[2],args[3]);
		
	}
	
	

}
