package controller;

public interface GeneralManagement<T> {
    void displayAll();

    void addNew(T t);


    boolean updateById(String id, T t);

    boolean deleteById(String id);

    T getById(String id);
}
