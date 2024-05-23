import java.util.ArrayList;

public class GerenciadorDeDados {
    private ArrayList<Veiculo> dados;

    public GerenciadorDeDados() {
        this.dados = new ArrayList<>();
    }

    public void cadastrar(Veiculo veiculo) {
        dados.add(veiculo);
    }

    public void editar(Veiculo veiculo) {
        for (int i = 0; i < dados.size(); i++) {
            Veiculo v = dados.get(i);
            if (v.equals(veiculo)) {
                dados.set(i, veiculo);
                return;
            }
        }
        System.out.println("Veículo não encontrado para edição.");
    }

    public ArrayList<Veiculo> consultar() {
        return dados;
    }

    public void remover(Veiculo veiculo) {
        if (dados.contains(veiculo)) {
            dados.remove(veiculo);
        } else {
            System.out.println("Veículo não encontrado para remoção.");
        }
    }
}
