package Controller;

import java.util.List;

public interface RepositorioCrud<T> {
    void criar(T obj);
    T ler(int id);
    void atualizar(T obj);
    void deletar(int id);
    List<T> listar();
}
