import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Introduce un numero: ");
			num = entrada.nextInt();
			if(num<0) {
				System.out.println("Error debes introducir un numero mayor que 1 ");
			}
			}while(num<=1);
		
		for(int i = 1; i<=num;i++) {
			System.out.println(i);
		}
	}

}
