import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, raizCuadrada;
		
		do {
		System.out.println("Introduce un numero: ");
		num = entrada.nextInt();
		if(num<0) {
			System.out.println("Error debes introducir un numero positivo");
		}
		}while(num<0);
		
        System.out.print("Raiz cuadrada de "+num+": "+Math.sqrt(num));

	}

}
