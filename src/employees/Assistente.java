package employees;

public abstract class Assistente extends Funcionario {
	
	private String especializacao;

	public Assistente(String name, String endereco, String sexo, String dataContratacao, double salario,
			String especializacao) {
		super(name, endereco, sexo, dataContratacao, salario);
		this.especializacao = especializacao;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	@Override
	public String toString() {
		return super.toString() + "Assistente [especializacao=" + especializacao + "]";
	}

}
