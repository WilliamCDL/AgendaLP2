package modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class NotaDao implements Dao<Nota> {

	private List<Nota> notas = new ArrayList<>();
	
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
		DateFormat f = DateFormat.getDateInstance();
		t.setData(Objects.requireNonNullElse(f.parse(params[1]),t.getData()));
		notas.add(t);
		
	}

	@Override
	public void delete(Nota t) {
		// TODO Auto-generated method stub
		notas.remove(t);
		
	}

	

}
