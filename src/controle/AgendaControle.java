package controle;

import java.text.ParseException;
import java.util.Date;
import java.util.Optional;

import modelo.Dao;
import modelo.Nota;
import modelo.NotaDao;

public class AgendaControle {
	private Dao<Nota> notaDao;
	private CriarNotaControle criadorNota;
	private ModificarNotaControle modificadorNota;
	
	public AgendaControle() {
		notaDao =new NotaDao();
		criadorNota = new CriarNotaControle();
		modificadorNota = new ModificarNotaControle();
	}
	
	public void cadastrarNovaNota() {
		try {
			notaDao.save(criadorNota.criar());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void deletarNota(long id) {
		notaDao.delete(this.getUser(id));
	}
	
	private Nota getUser(long id) {
		Optional<Nota> nota = notaDao.get(id);
		Nota n= null;
		return nota.orElseGet(() -> n);
	}
	
	public void visualizarTodas() {
		int i=1;
		for(Nota n: notaDao.getAll()) {
			
			System.out.println("id - "+ i);
			n.print();
			System.out.println();
			i++;
		}
	}
	
	public void visualizarProxima() {
		int i=1;
		for(Nota n: notaDao.getAll()) {
			if(n.isPertoDoPrazo()) {
				System.out.println("id - "+ i);
				n.print();
				System.out.println();
			}
			i++;
		}
	}
	
	public void visualizarForaDoPrazo() {
		int i=1;
		Date atual = new Date();
		for(Nota n: notaDao.getAll()) {
			if(atual.after(n.getData())) {
				System.out.println("id - "+ i);
				n.print();
				System.out.println();
			}
			i++;
		}
	}
	
	public void modificar(int id) {
		if(id<1 || id>notaDao.getAll().size()) {
			System.out.println("Não existe Nota com esse ID");
		}else {
			try {
				notaDao.update(this.getUser(id), modificadorNota.modificar());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
