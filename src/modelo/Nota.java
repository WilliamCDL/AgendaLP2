package modelo;

import java.util.Date;

public abstract class Nota {
	
	protected String titulo; 
	protected Date data;
	protected boolean pertoDoPrazo; 
	protected boolean tarefaRealizada;
	protected static int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	public boolean isPertoDoPrazo() {
		return pertoDoPrazo;
	}
	public void setPertoDoPrazo(boolean pertoDoPrazo) {
		this.pertoDoPrazo = pertoDoPrazo;
	}
	
	public boolean isTarefaRealizada() {
		return tarefaRealizada;
	}
	public void setTarefaRealizada(boolean tarefaRealizada) {
		this.tarefaRealizada = tarefaRealizada;
	}
	
	public abstract void notificar();

}
