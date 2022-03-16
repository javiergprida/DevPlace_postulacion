package INTERFACES;

import java.util.List;

public interface Operaciones <T>{
    public boolean create(T t);
    public int update(T t);
    public int delete(int key);
    public T read(int key);
    public List<T> readAll();

}
