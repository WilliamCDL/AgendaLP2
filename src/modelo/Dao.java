package modelo;

import java.util.List;

public interface Dao<T> {
	
	T get(Long id);
	List<T> getAll( );
	void save(T tipo);
	void update(T tipo);
	void delete(T tipo);


}
