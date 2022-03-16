package INTERFACES;

import DTO.Empleado;

import java.util.List;

public interface OperacionesEmpleado<T>{
    public int create(T t);
    public int update(T t);
    public int delete(int key);
    public T read(int key);
    public List<T> readAll();
    public List<T> readByAge(Integer age);
    public List<T> readBySalary(Integer salario);
    public List<T> readByAgeAndSalary(Integer age, Integer salario);


}
