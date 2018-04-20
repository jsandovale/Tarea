
public class Exercise9 {
 
	public static void baffle(String blimp) { //blimp == "rattle"
		System.out.println("5");
		System.out.println(blimp);
		System.out.println("6");
		zippo("ping", -5);
		System.out.println("9");
	}
	
	public static void zippo(String quince, int flag) { //quince == "rattle" y quince == "ping" 
		System.out.println("2");
		if (flag < 0) {
			System.out.println("7");
			System.out.println(quince + " zoop");
			System.out.println("8");
		} 
		else {
			System.out.println("3");	
			System.out.println("ik");
			System.out.println("4");
			baffle(quince);
			System.out.println("10");
			System.out.println("boo-wa-ha-ha");
			System.out.println("11");
		}
	}
	public static void main(String[] args) {
		System.out.println("1");
		zippo("rattle", 13);
		System.out.println("12");
	}
		
	
}
