package employees;

public class AssistenteTecnico extends Funcionario {
	
	private double bonus;
	
	public AssistenteTecnico(String name, 
							 String endereco, 
							 String sexo, 
							 String dataContratacao, 
							 double salario,
			double bonus) {
		super(name, endereco, sexo, dataContratacao, salario);
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	@Override
	public double getSalario() {
		return salario * bonus;
	}
	@Override
	public String toString() {
		return super.toString() + "AssistenteTecnico [bonus=" + bonus + "]";
	}
	@Override
	public void imprimeDados() {
		
		System.out.println(	"\nNome: "+ getName() +
							"\nEndereco: "+ getEndereco() +
							"\nSexo: " + getSexo() + 
							"\nData Contratacao: " + getDataContratacao() + 
							"\nBonus: " + getBonus() +
							"\nSalario com bonus: " + getSalario()
							);
		
	}
}
