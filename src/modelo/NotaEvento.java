package modelo;

import java.util.Date;

public class NotaEvento extends Nota {

	@Override
	public void notificar() {
		Date atual = new Date();
		Date d = dataNotificar(7);
		
		if(data.equals(atual) || data.after(atual)) {
			if(data.before(d)) {
				this.pertoDoPrazo=true;
			}
		}else {
			this.pertoDoPrazo=false;
		}

	}

}
