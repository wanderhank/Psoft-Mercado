package mercado;

public class produto {

    private String nome;
    private String fabricante;
    private double preco;
    private int id;

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    private String getNome() {
        return nome;
    }

    private String getFabricante() {
        return fabricante;
    }

    private double getPreco() {
        return preco;
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public produto(String nome, String fabricante, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }
}
