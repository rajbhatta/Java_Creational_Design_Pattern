package employee.service;
import exception.ComosDbCrudException;

import java.util.List;

public interface Crud<E> {
    public void save(E e) throws ComosDbCrudException;
    public List<E> get() throws ComosDbCrudException;
    public E getById(int id) throws ComosDbCrudException;
    public void delete() throws ComosDbCrudException;

}
