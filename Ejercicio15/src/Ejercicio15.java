import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num,cont,i;
		
		System.out.println("Dime un numero");
		num = entrada.nextInt();
		
		for(i=0;i<11;i++) {
			cont= num * i;
			System.out.println(num + "X" + i + " = " + cont);
		}
	}

}
