package Poo;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class cliente {
  private String nomeCliente;
  private String cidadeNatal;
  private int idadeAtual;
  
  public cliente (String nome, String cidade, int idade) {
	  
	  nomeCliente = nome;
	  cidadeNatal = cidade;
	  idadeAtual = idade;
  }
  public String getDados() {
	  String dados = nomeCliente + cidadeNatal + idadeAtual;
	  return dados;	  
  }
}
