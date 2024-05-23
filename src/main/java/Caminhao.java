public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private int numeroEixos;
    private String tipoCarroceria;

    public Caminhao(String modelo, String marca, int ano, String cor, double preco, String estado, String placa, double capacidadeCarga, int numeroEixos, String tipoCarroceria) {
        super(modelo, marca, ano, cor, preco, estado, placa);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
        this.tipoCarroceria = tipoCarroceria;
    }
}
