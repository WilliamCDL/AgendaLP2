package modelo;

import java.util.Date;

public class NotaLazer extends Nota {

	@Override
	public void notificar() {
		Date atual = new Date();
		Date d = dataNotificar(1);
		
		if(data.equals(atual) || data.after(atual)) {
			if(data.before(d)) {
				this.pertoDoPrazo=true;
			}
		}else {
			this.pertoDoPrazo=false;
		}

	}

}
