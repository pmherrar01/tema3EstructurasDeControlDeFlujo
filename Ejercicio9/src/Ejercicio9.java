import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, aux;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1 = entrada.nextInt();
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num2 = entrada2.nextInt();
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num3 = entrada3.nextInt();
		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num4 = entrada4.nextInt();

		for(int i = 0;i < 3;i++){
			if (num1 > num2){
				aux = num1;
				num1 = num2;
				num2 = aux;
			}
			if (num2 > num3){
				aux = num2;
				num2 = num3;
				num3 = aux;
			}
			if (num3 > num4){
				aux = num3;
				num3 = num4;
				num4 = aux;
			}    
		}

		System.out.print("El orden de los números introducidos es: "+num1+" - "+num2+" - "+num3+" - "+num4);

	}

}
