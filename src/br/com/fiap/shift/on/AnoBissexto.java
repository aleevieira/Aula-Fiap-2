package br.com.fiap.shift.on;
import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o ano desejado em formato  YYYY contendo apenas n�meros: ");
		int ano = sc.nextInt();
		
		if (ano % 100 ==0 && ano % 400==0) {
			System.out.println("Este � um ano bissexto. ");
		} else if (ano % 100 ==00 && ano % 400 !=0) {
			System.out.println("N�o � um ano bissexto.");
		} else if (ano % 4 ==0) {
			System.out.println("� um ano bissexto.");
		} else {
			System.out.println("N�o � um ano bissexto.");
		}
			
		
		
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
			System.out.println("Este � um ano bissexto! Rafa");
		} else {
			System.out.println("Este n�o � um ano bissexto! Rafa");
		}
		sc.close();

	}

}



//(ano % 400 ==0 ) {
//System.out.println("Este � um ano bissexto! ");
//} else if

//System.out.println("Este � um ano bissexto! ");
//} else if (ano % 100 <=1) {
//	System.out.println("Este n�o � um ano bissexto! ");
