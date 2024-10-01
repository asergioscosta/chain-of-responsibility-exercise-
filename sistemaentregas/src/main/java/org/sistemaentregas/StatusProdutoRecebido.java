package org.sistemaentregas;

public class StatusProdutoRecebido implements StatusProduto {

    public static StatusProdutoRecebido statusProdutoRecebido = new StatusProdutoRecebido();

    private StatusProdutoRecebido() {
    }

    public static StatusProdutoRecebido getStatusProdutoRecebido() {
        return statusProdutoRecebido;
    }
}
