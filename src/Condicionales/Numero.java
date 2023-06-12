package Condicionales;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// Condicionales
		Scanner teclado = new Scanner(System.in);
		System.out.println("Primer numero: ");
		int n1= teclado.nextInt();
		System.out.println("Segundo numero: ");
		int n2= teclado.nextInt();
			if(n1 > n2) {
				System.out.println(n1 + " es mayor que " + n2);
			}else {
				System.out.println(n2 + " es mayor que " + n1);
			}
	}

}
