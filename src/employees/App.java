package employees;

public class App {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Jeferson", "NH", "M", "Dez/21", 15000 , 9);
		AssistenteTecnico at1 = new AssistenteTecnico("Jessica", "Campo Bom", "F", "Out/20", 5000, 1.25);
		AssistenteAdministrativo aa1 = new AssistenteAdministrativo("Janaina", "Sapiranga", "F", "Out/20", 4000, "Noite", 1.5 );
		
		g1.imprimeDados();
		at1.imprimeDados();
		aa1.imprimeDados();
	}
}
