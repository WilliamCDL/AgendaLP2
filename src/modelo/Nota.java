package modelo;

import java.util.Date;

public abstract class Nota {
	
	protected String titulo; 
	protected Date data;
	protected boolean pertoDoPrazo; 
	protected boolean tarefaRealizada;
	protected int[] diaMes = {31,28,31,30,31,30,31,31,30,31,30,31};
	
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
	
	@SuppressWarnings("deprecation")
	public Date dataNotificar(int diasSomar) {
		Date dataAviso = new Date();
		int dia = dataAviso.getDate();
		int mes = dataAviso.getMonth();
		int ano = dataAviso.getYear();
		
		if(ano%100==0 & ano%400==0) {
			diaMes[1]=29;
		}else if (ano%4==0) {
			diaMes[1]=29;
		}
		
		if ((dia+diasSomar)>diaMes[mes]) {
			dia=(dia+diasSomar)%diaMes[mes];
			if(mes+1>11) {
				mes=0;
				ano++;
			}else {
				mes++;
			}
			
		} else {
			dia+=diasSomar;
		}
		
		dataAviso.setDate(dia);
		dataAviso.setMonth(mes);
		dataAviso.setYear(ano);
		
		return dataAviso;
	}
	
	public abstract void notificar();

}
