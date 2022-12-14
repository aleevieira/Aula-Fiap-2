package br.com.fiap.shift.on;

public class ForContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i<100; i++) {
			if (i>50 && i<60) {
				System.out.println(i);
				continue; 
			}
			System.out.println(i);
		}
	}

}
