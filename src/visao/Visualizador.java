package visao;

import java.util.Scanner;

import controle.AgendaControle;

public abstract class Visualizador {
	protected AgendaControle agenda;
	protected static Scanner entrada = new Scanner(System.in);
	
	public Visualizador() {
		agenda = new AgendaControle();
	}

	public abstract void display();
}
