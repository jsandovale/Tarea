import java.util.Scanner;



public class Exercise3 {
	static String dias[] = { "lunes", "martes","miercoles","jueves","Viernes", "sabado", "domingo"}; 
	static int dia = -1;
	public static void main(String[] args) { //name dd mm yy
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("ingrese 0 si desea formato americano o 1 si desea formato europeo");
		int tipo = in.nextInt(); 
		while(tipo!=0 && tipo!=1) {
			System.out.println("valor invalido, intente nuevamente");
			System.out.println("ingrese 0 si desea formato americano o 1 si desea formato europeo");
			tipo = in.nextInt(); 
		}
			
		int numero = Integer.parseInt(args[1]);
		
		if(tipo==0) {
			System.out.println("American format: ");
			System.out.print(args[0] + ", ");
			System.out.print(args[2] + ", ");
			System.out.print(args[1] + ", ");
			System.out.println(args[3] + ", ");
		}
		if(tipo==1) {
			System.out.println("European format: ");
			System.out.print(args[0] + ", ");
			System.out.print(args[1] + ", ");
			System.out.print(args[2] + ", ");
			System.out.println(args[3] + ", ");
		}
		
		for(int i = 0; i<7; i++)
			if(dias[i].equalsIgnoreCase(args[0]))
					dia = i;
		
		for(int i = Integer.parseInt(args[1]); i < 31; i++) {
			numero++;
			dia++;
			if(dia==7)
				dia=0;
			if(tipo==0) {
				System.out.print(dias[dia] + ", ");
				System.out.print(args[2] + ", ");
				System.out.print(numero + ", ");
				System.out.println(args[3] + ", ");
			}
			if(tipo==1) {
				System.out.print(dias[dia] + ", ");
				System.out.print(numero + ", ");
				System.out.print(args[2] + ", ");
				System.out.println(args[3] + ", ");
			}
			
			
			
		
		
		
		
		
		}
			
			
		
		
		
		
	}
}
