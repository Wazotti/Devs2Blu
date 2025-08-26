package Penitenciaria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cela {
    private int numeroCela;
    private List<Presidiario> presidiarios;

    public Cela(int numeroCela) {
        this.numeroCela = numeroCela;
        this.presidiarios = new ArrayList<>();
    }
    public void adicionarPresidiario(Presidiario p) {
        presidiarios.add(p);
    }
    public void removerPresidiario(Presidiario p) {
        presidiarios.remove(p);
    }
    public List<Presidiario> listarPresidiario() {
        return presidiarios;
    }

    public Collection<Object> listarPresidiarios() {
        return List.of();
    }
}
