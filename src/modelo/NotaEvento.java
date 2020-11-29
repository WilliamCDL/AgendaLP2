package modelo;

import java.util.Date;

public class NotaEvento extends Nota {

	@Override
	public void notificar() {
		Date d = dataNotificar(5);
		System.out.println(d);
		// TODO Auto-generated method stub

	}

}
