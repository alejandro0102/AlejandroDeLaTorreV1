package Bucles;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		for(int i = numero; i >0; i--) {
			if(i  %3 ==0) {
				System.out.println(i);
			}
		}

	}

}
