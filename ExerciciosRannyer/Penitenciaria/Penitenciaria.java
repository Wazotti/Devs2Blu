package Penitenciaria;

import java.util.ArrayList;
import java.util.List;

public class Penitenciaria {
    private String nome;
    private List<Cela> celas;

    public Penitenciaria(String nome) {
        this.nome = nome;
        this.celas = new ArrayList<>();
    }
    public void adicionarCela(Cela c){
        celas.add(c);
    }
    public List<Cela> listarCelas() {
        return celas;
    }
    public int totalPresdiarios() {
        int total = 0;
        for (Cela c : celas) {
            total += c.listarPresidiarios().size();
        }
        return total;
    }
}

