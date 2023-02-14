package employees;

public class Gerente extends Funcionario {
	
	private int nivel;
	public Gerente(String name, String endereco, String sexo, String dataContratacao, double salario, int nivel) {
		super(name, endereco, sexo, dataContratacao, salario);
		this.nivel = nivel;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return salario;
	}
	@Override
	public String toString() {
		return super.toString() + "Gerente [nivel=" + nivel + "]";
	}
	@Override
	public void imprimeDados() {
		
		System.out.println(	"\nNome: "+ getName() +
							"\nEndereco: "+ getEndereco() +
							"\nSexo: " + getSexo() + 
							"\nData Contratacao: " + getDataContratacao() + 
							"\nNivel: " + getNivel()  +
							"\nSalario: " + getSalario()
							);
	}
}
