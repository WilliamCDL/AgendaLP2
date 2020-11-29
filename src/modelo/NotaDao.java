package modelo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * Classe NotaDao para manutenção dos dados.
 * @author William
 *
 */
public class NotaDao implements Dao<Nota> {

	private List<Nota> notas = new ArrayList<Nota>();
	
	
	public NotaDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Optional<Nota> get(long id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(notas.get((int) id));
	}

	@Override
	public List<Nota> getAll() {
		// TODO Auto-generated method stub
		return notas;
	}

	@Override
	public void save(Nota t) {
		// TODO Auto-generated method stub
		notas.add(t);
		
	}

	@Override
	public void update(Nota t, String[] params) throws ParseException {
		//Caso o titulo não seja null, atualiza
		t.setTitulo(Objects.requireNonNull(params[0], t.getTitulo()));
		//Caso a data não seja null, atualiza
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		t.setData(Objects.requireNonNullElse(format.parse(params[1]),t.getData()));
		
	}

	@Override
	public void delete(Nota t) {
		// TODO Auto-generated method stub
		notas.remove(t);
		
	}

	

}
