
/**
 * Programa para mostrar a utilização do método Switch, break e default.É um método mais viável para dar opções
 * mantém o código mais alinhado e com menor utilização de caracteres. Além de ser mais simples de se entender
 */
package br.com.fiap.shift.on;

import java.util.Scanner;

public class Opcoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("+++++      Bem-vindo ao sistema!!      +++++\n\n");
		System.out.println(" Digite a opção desejada\n");
		System.out.println(" [1] Consultar Saldo");
		System.out.println(" [2] Sacar da Conta Corrente");
		System.out.println(" [3] Sacar do Cartão de Crédito");
		System.out.println(" [4] Seguro Residencial");
		System.out.println(" [5] Seguro do Veículo");
		System.out.println(" [6] Título de Capitalização");
		System.out.println(" [7] Investimentos");

		int opcao = sc.nextInt();
		
	switch (opcao) {
	case 1:
		System.out.println(" Consultando saldo ");		
		break;
	case 2: 
		System.out.println(" Sacando da conta corrente ");
		break;
	case 3:
		System.out.println(" Realizando saque do cartão de crédito ");
		break;
	case 4:
		System.out.println(" Cadastrando seguro residencial ");
		break;
	case 5:
		System.out.println(" Cadastrando seguro do veículo ");
		break;
	case 6:
		System.out.println(" Cadastrando título de capitalização ");
		break;
	case 7:
		System.out.println(" Realizando investimento ");
		break;
	default:
		System.out.println(" Opção inválida ");
		
		
	}
		
	sc.close(); //precisa ter o mesmo nome definido no ínicio do programa
	
		
	}
}
