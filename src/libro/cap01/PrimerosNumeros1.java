package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros1 {
	public static void main(String[] args) {
		/*Ingresa un número tope e imprime todos
		 * los números del 1 hasta llegar al tope.*/
		
		System.out.print("Ingresa el número: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int i = 1;
		
		while(i < n) {
			System.out.println(i);
			i++;
		}
	}

}
