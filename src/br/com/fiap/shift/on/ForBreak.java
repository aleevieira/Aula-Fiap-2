package br.com.fiap.shift.on;
/**
 * 
 * @author Alexandra
 // TODO este c�digo � responsabilidade de fulano
 */
public class ForBreak {

	public static void main(String[] args) {
		
		int x = 1;
		
		int y = 90;
		
		int numeroAVerificar = 5;
		
		for (int i = x; i < y; i++) {
			if (i % numeroAVerificar == 0) {
				System.out.println( " Achei um n�mero (entre x e y) e � divisivel por: " + numeroAVerificar + ":" + i);
				break; // interrompe o la�o de repeti��o
			}
		}
	}
}
