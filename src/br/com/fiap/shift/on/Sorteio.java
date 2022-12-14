package br.com.fiap.shift.on;

import java.util.Random; // da pra importar com control+shift+o

/**
 * Esta classe realiza sorteios
 * @author Alexandra
 *
 */
public class Sorteio {
	public static void main(String[] args) {
		 Random r = new Random();
		 
		 int sorteado = r.nextInt(11); //sempre vai até um número antes do escrito, nesse caso 10
		 //quantidade de numeros que serao sorteados, sempre começa em 0
		 
		 System.out.println(sorteado);
		

	}
	

}
