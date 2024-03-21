import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		int num1, num2, num3, num4, mayor=0;
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
		if(num1>num2){
		mayor = num1;
		System.out.println("El numero mayor es el:" + mayor + "luego " + num2 + num3 + num4);
		}else {
			if(num1>num3) {
				mayor=num1;
				System.out.println("El numero mayor es el:" + mayor + "luego " + num2 + num3 + num4);
			}else {
				if(num1>num4) {
					mayor=num1;
					System.out.println("El numero mayor es el:" + mayor + "luego " + num2 + num3 + num4);
				}
			}
		}
		
		
	}

}
