public class Moto extends Veiculo {
    private int cilindrada;
    private String tipoPartida;

    public Moto(String modelo, String marca, int ano, String cor, double preco, String estado, String placa, int cilindrada, String tipoPartida) {
        super(modelo, marca, ano, cor, preco, estado, placa);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }
}

