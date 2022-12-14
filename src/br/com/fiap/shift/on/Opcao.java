/**
 * Programa pra mostrar um método ou forma de apresentar opções, porém este modo não é o ideal.
 * pois o código não está alinhado e utiliza muitos caracteres para o funcionamento
 */

package br.com.fiap.shift.on;

import java.util.Scanner;

public class Opcao {

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

		if (opcao == 1) {
			System.out.println(" Consultando saldo ");
		} else {
			if (opcao == 2) {
				System.out.println("Realizando saque da conta corrente");
			} else {
				if (opcao == 3) {
					System.out.println(" Realizando saque do cartão de crédito");
				} else {
					if (opcao == 4) {
						System.out.println(" Cadastrando seguro residencial");
					} else {
						if (opcao == 5) {
							System.out.println(" Cadastrando seguro do veículo");
						} else {
							if (opcao == 6) {
								System.out.println(" Cadastrando titulo de capitalização");
							} else {
								if (opcao == 7) {
									System.out.println("Realizando investimentos");
								} else {
									System.out.println(" Opção Inválida ");
								}
							}
						}
					}
				}
			}
		}
        sc.close();

	}
}
//é um método estático, não precisa de objeto de opção pra funcionar
// é um ponto de entrada. O void significa que ele não retorna nada, nenhum valor, diferente de função.
// ele espera um conjunto de argumentos. Quando iniciar o programa existe a possibilidade, ou seja,
//pode ter entrada de argumentos para executar. Conjunto de textos.
// arrays, por exemplo. Argumentos que executam comandos