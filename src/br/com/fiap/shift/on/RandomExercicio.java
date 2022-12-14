/**
 * Programa para sorteio. O usuario precisa acertar o n�mero selecionado.
 */

package br.com.fiap.shift.on;
import java.util.Random;
import java.util.Scanner;

public class RandomExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		int escolhido = 9999; // essa variavel precisa existir antes do while e depois pode ser escrita de novo
		Random rnd = new Random(); //Inicia o aleat�rio
		int sorteado = rnd.nextInt(100); // Gera um n�mero alet�rio entre 0 e 99
		int repeticoes = 0;
		while(sorteado != escolhido || repeticoes < 3) { // precisa estar onde eu quero que ele comece a repetir
			System.out.println("Digite um n�mero entre 0 a 99");
			escolhido = sc.nextInt();// antes desta linha, pois o usuario precisa digitar o numero de novo
		
			if (sorteado==escolhido) {
				System.out.println("Voc� acertou o n�mero! E o n�mero �:" + sorteado);
			} else {
				if (sorteado>escolhido) {
					System.out.println("O n�mero sorteado � maior.");
				} else if (sorteado<escolhido) {
					System.out.println("O n�mero sorteado � menor.");
				}
				
				System.out.println();
			}
		
			repeticoes = repeticoes + 1;
		}
		
		//System.out.println("O numero escolhida era " + x);
	}

}
