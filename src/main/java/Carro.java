public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    private int capacidadePassageiros;

    public Carro(String modelo, String marca, int ano, String cor, double preco, String estado, String placa, int numeroPortas, String tipoCombustivel, int capacidadePassageiros) {
        super(modelo, marca, ano, cor, preco, estado, placa);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
