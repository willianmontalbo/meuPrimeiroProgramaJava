/**
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author willi
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ol� amigo\nQual � o seu nome? "); // Uso do ponto e v�rgula
		
		//Ler uma string do console usando a biblioteca Scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Ol� %s!\n", nome);
		
	}

}
