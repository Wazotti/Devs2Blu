package Controller;

import Model.Jogo;
import java.util.ArrayList;
import java.util.List;

public class RepositorioJogos implements RepositorioCrud<Jogo> {
    private List<Jogo> jogos = new ArrayList<>();
    private int contadorId = 1;

    @Override
    public void criar(Jogo jogo) {
        jogo = new Jogo(contadorId++, jogo.getNome(), jogo.getGenero(), jogo.getPreco());
        jogos.add(jogo);
        System.out.println("\nJogo cadastrado com ID: " + jogo.getId());
    }

    @Override
    public Jogo ler(int id) {
        for (Jogo j : jogos) {
            if (j.getId() == id) return j;
        }
        return null;
    }

    @Override
    public void atualizar(Jogo jogo) {
        for (int i = 0; i < jogos.size(); i++) {
            if (jogos.get(i).getId() == jogo.getId()) {
                jogos.set(i, jogo);
                return;
            }
        }
    }

    @Override
    public void deletar(int id) {
        jogos.removeIf(j -> j.getId() == id);
    }

    @Override
    public List<Jogo> listar() {
        return jogos;
    }
}
