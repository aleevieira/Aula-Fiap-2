package br.com.fiap.shift.on;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int repeticoes=0;

		int sorteado = rnd.nextInt(100);
		int escolhido = 9999;
		repeticoes = 0;
		while (sorteado != escolhido && repeticoes <5) {

			System.out.println("Digite um n�mero entre 0 e 99.");
			escolhido = sc.nextInt();

			if (sorteado > escolhido) {
				System.out.println("O n�mero sorteado � maior.");
			} else if (sorteado < escolhido) {
				System.out.println("O n�mero sorteado � menor.");
			} else if (sorteado == escolhido) {
				System.out.println("Voc� acertou!");
			}

			repeticoes = repeticoes +1;
		} 
		sc.close();
	}
}
