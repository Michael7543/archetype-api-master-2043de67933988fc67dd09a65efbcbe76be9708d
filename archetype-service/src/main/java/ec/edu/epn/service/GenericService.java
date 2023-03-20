package ec.edu.epn.service;

import java.util.List;

public interface GenericService<T, V> {

	T create(T obj);

	List<T> findAll();

	T findById(V id);

	//T update(T obj) throws InvocationTargetException, IllegalAccessException;

	boolean delete(V id);
}
