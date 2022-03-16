package INTERFACES;

import DTO.Empleado;

import java.util.List;

public interface OperacionesEmpleado<T>{
    public int create(T t);
    public int update(T t);
    public int delete(int key);
    public T read(int key);
    public List<T> readAll();
    public List<T> readByAge(int age);
    public List<T> readBySalary(String salario);
    public List<T> readByAgeAndSalary(int age, String salario);


}
