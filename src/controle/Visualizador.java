package controle;

import java.util.Scanner;

public abstract class Visualizador {
	protected AgendaControle agenda;
	protected static Scanner entrada = new Scanner(System.in);
	
	public Visualizador() {
		agenda = new AgendaControle();
	}

	public abstract void display();
}
