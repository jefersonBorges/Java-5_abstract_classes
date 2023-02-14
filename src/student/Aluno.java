package student;

public class Aluno extends Pessoa {
	
	String matricula;
	String curso;

	public Aluno(String nome, String endereco, String nacionalidade) {
		super(nome, endereco, nacionalidade);
	}
	
	public Aluno(String nome, String endereco, String nacionalidade, String matricula, String curso) {
		super(nome, endereco, nacionalidade);//busca os atributos da super classe Pessoa
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void imprimeDados(){
		System.out.println(	"\nNome: " + super.getNome() + 
							"\nEndereco: " + super.getEndereco() + 
							"\nNacionalidade: "+ super.getNacionalidade()+
							"\nMatricula: "+ this.matricula + 
							"\nCurso: " + this.curso);
	}
	
}
