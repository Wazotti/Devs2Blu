package controller;

import model.Amigo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class AmigoController {
    private List<Amigo> amigos;
    private AtomicInteger geradorId;

    public AmigoController() {
        this.amigos = new ArrayList<>();
        this.geradorId = new AtomicInteger(1); // começa no ID 1
    }

    public int gerarId() {
        return geradorId.getAndIncrement();
    }

    public void cadastrarAmigo(Amigo amigo) {
        amigos.add(amigo);
    }

    public List<Amigo> listarAmigos() {
        return amigos;
    }

    public Amigo buscarAmigoPorId(int id) {
        Optional<Amigo> amigoEncontrado = amigos.stream()
                .filter(amigo -> amigo.getId() == id)
                .findFirst();
        return amigoEncontrado.orElse(null);
    }

    public boolean atualizarAmigo(int id, Amigo novoAmigo) {
        Amigo amigoExistente = buscarAmigoPorId(id);
        if (amigoExistente != null) {
            amigos.remove(amigoExistente);
            amigos.add(novoAmigo);
            return true;
        }
        return false;
    }

    public boolean removerAmigo(int id) {
        return amigos.removeIf(amigo -> amigo.getId() == id);
    }
}
