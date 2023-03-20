package mercado;

public class lote {

    private produto produto;
    private String validade;
    private int quantidade;

    public lote(mercado.produto produto, String validade, int quantidade) {
        this.produto = produto;
        this.validade = validade;
        this.quantidade = quantidade;
    }
}
