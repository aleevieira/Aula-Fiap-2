// Montar um programa que imprima o valor de imposto de renda pago de acordo com o salário informado. Calcular o valor 
//a ser pago

package br.com.fiap.shift.on;

import java.util.Scanner;

public class Exercio_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario = 0; 
		double IR = salario*0;
		
		System.out.println("Digite o valor do seu salário");
		
		 if (sc.hasNextDouble()) {
	            salario = sc.nextDouble();
	        } 
		 if (salario <= 1903.00) {
			 System.out.println(" Isento ");
		 } else if (salario <= 2826.65) {
			 IR = salario*0.075;
			 System.out.println(IR);		 
		 } else if (salario <= 3751.05) {
			 IR = salario*0.15;
			 System.out.println(IR);
		 } else if (salario <= 4664.68) {
			 IR= salario*0.225;
			System.out.println(IR);
		 } else {
			 IR = salario*0.275;
			System.out.println(IR);
		 }
	        
	        sc.close();
		

	}

}
