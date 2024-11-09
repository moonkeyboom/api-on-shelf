package hkt.services;

public interface Datasource<T> {
    T read();
    void write(T data);
}
