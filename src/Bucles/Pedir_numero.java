package Bucles;

import java.util.Scanner;

public class Pedir_numero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = teclado.nextInt();
		for(int i = numero; i >0; i--) {
			System.out.println(i);
		}
	}

}
