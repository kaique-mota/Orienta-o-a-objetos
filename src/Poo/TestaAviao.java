package Poo;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		avião aviao1 = new avião();
		
		System.out.println("Digite a cia aérea: ");
		aviao1.setCia(scan.nextLine());
		
		System.out.println("Digite o modelo: ");
		aviao1.setModelo(scan.nextLine());
		
		System.out.println("Digite o número de assentos: ");
		aviao1.setAssentos(scan.nextInt());
	
	
		
		System.out.println("A cia aérea digitada é: " + aviao1.getCia());
		System.out.println("O modelo de avião digitado é: " + aviao1.getModelo());
		System.out.println("A quantidade de assentos digitada é: " + aviao1.getAssentos());
	}
}

