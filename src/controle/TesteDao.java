package controle;

import java.util.Date;
import java.util.Optional;

import modelo.Dao;
import modelo.Nota;
import modelo.NotaDao;
import modelo.NotaEvento;

public class TesteDao {

	private static Dao<Nota> notaDao;
	
	public static void main(String[] args) {
		
		 notaDao = new NotaDao();
		// TODO Auto-generated method stub
		 NotaEvento teste1 = new NotaEvento();
		 teste1.setTitulo("evento1");
		 Date data1 = new Date();
		 teste1.setData(data1);
		 
		 notaDao.save(teste1);
		 
		 Optional<Nota> n = TesteDao.getUser(0);
		 System.out.println(n.get().getTitulo());
		 System.out.println(n.get().getData());
		 n.get().notificar();
		 
		 
	}
	
	private static Optional<Nota> getUser(long id) {
        Optional<Nota> nota = notaDao.get(id);
        
        return nota;
    }

}
