package Poo;

import java.util.Scanner;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		produtoEletr�nico cel1 = new produtoEletr�nico();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a marca do celular: ");
		cel1.setMarca(scan.nextLine());
		
		System.out.println("Digite o modelo do celular: ");
		cel1.setModelo(scan.nextLine());
		
		System.out.println("Digite o ano de lan�amento do celular: ");
		cel1.setAno(scan.nextInt());
	
		System.out.println("A marca digitada �: " + cel1.getMarca());
		System.out.println("O modelo digitado �: " + cel1.getModelo());
		System.out.println("O ano de lan�amento digitado �: " + cel1.getAno());
	}
}
