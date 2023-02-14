package employees;

public abstract class Funcionario {
	
	private String name;
	private String endereco;
	private String sexo;
	private String dataContratacao;
	protected double salario;
	
	
	
	public Funcionario(String name, String endereco, String sexo, String dataContratacao, double salario) {
		super();
		this.name = name;
		this.endereco = endereco;
		this.sexo = sexo;
		this.dataContratacao = dataContratacao;
		this.salario = salario;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public abstract double getSalario();
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", endereco=" + endereco + ", sexo=" + sexo + ", dataContratacao="
				+ dataContratacao + ", salario=" + salario + "]";
	}
	public abstract void imprimeDados();

}
