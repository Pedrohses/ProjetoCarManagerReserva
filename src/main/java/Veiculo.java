public abstract class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private double preco;
    private String estado;
    private String placa;

    public Veiculo(String modelo, String marca, int ano, String cor, double preco, String estado, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.estado = estado;
        this.placa = placa;
    }

    public String getInformacoes() {
        return "Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + ", Cor: " + cor + ", Preço: " + preco + ", Estado: " + estado + ", Placa: " + placa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void vender() {
        System.out.println("Veículo vendido.");
    }

    public void realizarManutencao() {
        System.out.println("Manutenção realizada no veículo.");
    }
}
