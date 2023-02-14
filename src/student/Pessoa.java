package student;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String nacionalidade;
	
	public Pessoa(String nome, String endereco, String nacionalidade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.nacionalidade = nacionalidade;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void imprimeDados(){
		System.out.println(	"\nNome: " + this.nome + 
							"\nEndereco: " + this.endereco + 
							"\nNacionalidade: "+ this.nacionalidade);
	}


}
