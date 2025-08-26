package view;

import controller.AmigoController;
import model.Coelho;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AmigoController controller = new AmigoController();
        AmigoView view = new AmigoView();

        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    String nome = view.solicitarNome();
                    String corFavorita = view.solicitarCorFavorita();
                    String corLaco = view.solicitarCorLaco();
                    Coelho novoCoelho = new Coelho(controller.gerarId(), nome, corFavorita, corLaco);
                    controller.cadastrarAmigo(novoCoelho);
                    view.exibirMensagem("\nAmigo cadastrado com sucesso!");
                    break;
                case 2:
                    List<Coelho> amigos = (List<Coelho>) (List<?>) controller.listarAmigos();
                    view.exibirListaDeAmigos(amigos);
                    break;
                case 3:
                    int idAtualizar = view.solicitarId();
                    Coelho amigoExistente = (Coelho) controller.buscarAmigoPorId(idAtualizar);
                    if (amigoExistente != null) {
                        view.exibirMensagem("\nAmigo encontrado. Digite os novos dados:\n");
                        String novoNome = view.solicitarNome();
                        String novaCorFavorita = view.solicitarCorFavorita();
                        String novaCorLaco = view.solicitarCorLaco();
                        Coelho novoCoelhoAtualizado = new Coelho(idAtualizar, novoNome, novaCorFavorita, novaCorLaco);
                        if (controller.atualizarAmigo(idAtualizar, novoCoelhoAtualizado)) {
                            view.exibirMensagem("\nAmigo atualizado com sucesso!");
                        }
                    } else {
                        view.exibirMensagem("\nAmigo não encontrado.");
                    }
                    break;
                case 4:
                    int idRemover = view.solicitarId();
                    if (controller.removerAmigo(idRemover)) {
                        view.exibirMensagem("\nAmigo removido com sucesso!");
                    } else {
                        view.exibirMensagem("\nAmigo não encontrado.");
                    }
                    break;
                case 5:
                    view.exibirMensagem("\nSaindo do programa. Até logo!");
                    break;
                default:
                    view.exibirMensagem("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
}
