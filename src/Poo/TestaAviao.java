package Poo;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		avi�o aviao1 = new avi�o();
		
		System.out.println("Digite a cia a�rea: ");
		aviao1.setCia(scan.nextLine());
		
		System.out.println("Digite o modelo: ");
		aviao1.setModelo(scan.nextLine());
		
		System.out.println("Digite o n�mero de assentos: ");
		aviao1.setAssentos(scan.nextInt());
	
	
		
		System.out.println("A cia a�rea digitada �: " + aviao1.getCia());
		System.out.println("O modelo de avi�o digitado �: " + aviao1.getModelo());
		System.out.println("A quantidade de assentos digitada �: " + aviao1.getAssentos());
	}
}

