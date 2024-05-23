import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando alguns veículos
        Carro carro = new Carro("Gol", "Volkswagen", 2020, "Prata", 45000.0, "Novo", "ABC1234", 4, "Flex", 5);
        Caminhao caminhao = new Caminhao("Volvo FH", "Volvo", 2018, "Branco", 250000.0, "Usado", "XYZ5678", 30000.0, 6, "Baú");
        Moto moto = new Moto("CB 300", "Honda", 2019, "Preto", 15000.0, "Usado", "DEF4321", 300, "Elétrica");

        // Criando o gerenciador de dados
        GerenciadorDeDados gerenciador = new GerenciadorDeDados();

        // Cadastrando os veículos
        gerenciador.cadastrar(carro);
        gerenciador.cadastrar(caminhao);
        gerenciador.cadastrar(moto);

        // Consultando e exibindo os veículos cadastrados
        ArrayList<Veiculo> veiculosCadastrados = gerenciador.consultar();
        System.out.println("Veículos cadastrados:");
        for (Veiculo veiculo : veiculosCadastrados) {
            System.out.println(veiculo.getInformacoes());
        }

        // Editando um veículo (alterando o preço)
        carro.setPreco(42000.0);
        gerenciador.editar(carro);

        // Consultando e exibindo os veículos cadastrados após a edição
        veiculosCadastrados = gerenciador.consultar();
        System.out.println("\nVeículos cadastrados após a edição:");
        for (Veiculo veiculo : veiculosCadastrados) {
            System.out.println(veiculo.getInformacoes());
        }

        // Removendo um veículo
        gerenciador.remover(moto);

        // Consultando e exibindo os veículos cadastrados após a remoção
        veiculosCadastrados = gerenciador.consultar();
        System.out.println("\nVeículos cadastrados após a remoção:");
        for (Veiculo veiculo : veiculosCadastrados) {
            System.out.println(veiculo.getInformacoes());
        }
    }
}
