package student;

public class App {
	
	public static void main (String [] args) {
		
		Pessoa pessoa1 = new Pessoa("Jeferson", "NH", "Brasileiro");
		
		pessoa1.imprimeDados();
		
		Aluno aluno1 = new Aluno("Borges", "NH", "Brasileiro", "12345", "Engenharia da Computacao");
		
		aluno1.imprimeDados();
	}
}
