package controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import modelo.Dao;
import modelo.Nota;
import modelo.NotaDao;
import modelo.NotaEvento;

public class TesteDao {

	private static Dao<Nota> notaDao;

	public static void main(String[] args) throws ParseException  {

		CriarNotaControle versao1 = new CriarNotaControle();
		Nota versao1teste = versao1.criar();
		notaDao = new NotaDao();
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		//NotaEvento teste1 = new NotaEvento();
		//teste1.setTitulo("evento1");
		
		//Date data1= new Date();
		//data1 = format.parse("2020-12-30");


		//teste1.setData(data1);

		//notaDao.save(teste1);
		notaDao.save(versao1teste);
		//Nota user1 = getUser(0);
		Nota n = getUser(0);
		//System.out.println(n.getTitulo());
		//System.out.println(n.getData());
		//System.out.println(n.isPertoDoPrazo());
		//notaDao.update(n, new String[]{"palestra", "2020-11-30"});
		//notaDao.update(versao1teste, new String[]{"palestra2", "2020-14-30"});
		/*Optional<Nota> n = TesteDao.getUser(0);
		 System.out.println(n.get().getTitulo());
		 System.out.println(n.get().getData());
		 System.out.println(n.get().isPertoDoPrazo());
		 n.get().notificar();
		 System.out.println(n.get().getTitulo());
		 System.out.println(n.get().getData());
		 System.out.println(n.get().isPertoDoPrazo());
		 */

		n.notificar();
		n.print();
		
		//versao1teste.notificar();
		//versao1teste.print();
		



	}

	private static Nota getUser(long id) {
		Optional<Nota> nota = notaDao.get(id);
		Nota n= null;
		return nota.orElseGet(() -> n);
	}

}
