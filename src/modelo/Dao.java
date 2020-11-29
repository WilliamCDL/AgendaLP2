package modelo;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
/**
 * interface a qual permite manter os dados do tipo Programado/escolhido pelo programador.
 * @author William
 *
 * @param <T> tipo a ser programado/escolhido.
 */
public interface Dao<T> {
	
	 Optional<T> get(long id);
	    
	    List<T> getAll();
	    
	    void save(T t);
	    
	    void update(T t, String[] params) throws ParseException;
	    
	    void delete(T t);

}
