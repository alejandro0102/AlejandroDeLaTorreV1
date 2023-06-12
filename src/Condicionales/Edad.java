package Condicionales;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int mayor_edad = teclado.nextInt();
		while(mayor_edad !=18) {
			if(mayor_edad >=18) {
				System.out.println("Tiene: " + mayor_edad + " Es mayor eda");
			}else {
				System.out.println("No es mayor de eda");
			}
			mayor_edad = teclado.nextInt();
		}
		
	}

}
