package Poo;

import java.util.Scanner;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		produtoEletrônico cel1 = new produtoEletrônico();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a marca do celular: ");
		cel1.setMarca(scan.nextLine());
		
		System.out.println("Digite o modelo do celular: ");
		cel1.setModelo(scan.nextLine());
		
		System.out.println("Digite o ano de lançamento do celular: ");
		cel1.setAno(scan.nextInt());
	
		System.out.println("A marca digitada é: " + cel1.getMarca());
		System.out.println("O modelo digitado é: " + cel1.getModelo());
		System.out.println("O ano de lançamento digitado é: " + cel1.getAno());
	}
}
