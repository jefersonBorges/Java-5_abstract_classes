package employees;

public class AssistenteAdministrativo extends Funcionario {
	
	private String turno;
	private double adicionalNoturno;
	
	public AssistenteAdministrativo(String name, 
									String endereco, 
									String sexo, 
									String dataContratacao, 
									double salario,
									String turno, 
									double adicionalNoturno) {
		super(name, endereco, sexo, dataContratacao, salario);
		this.turno = turno;
		this.adicionalNoturno = adicionalNoturno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(float adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	@Override
	public double getSalario() {
		if(turno.equalsIgnoreCase("noite"))
			return salario * adicionalNoturno;
		else
			return salario;
	}
	@Override
	public String toString() {
		return super.toString() + "AssistenteAdministrativo [turno=" + turno + ", adicionalNoturno=" + adicionalNoturno + "]";
	}
	@Override
	public void imprimeDados() {
		
		System.out.println(	"\nNome: "+ getName() +
							"\nEndereco: "+ getEndereco() +
							"\nSexo: " + getSexo() + 
							"\nData Contratacao: " + getDataContratacao() + 
							"\nTurno: " + getTurno() + 
							"\nAdicional: " + getAdicionalNoturno() +
							"\nSalario com adicional: "+ getSalario()
							);
		
	}
}
