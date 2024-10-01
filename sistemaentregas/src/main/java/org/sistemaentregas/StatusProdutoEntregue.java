package org.sistemaentregas;

public class StatusProdutoEntregue implements StatusProduto {

    public static StatusProdutoEntregue statusProdutoEntregue = new StatusProdutoEntregue();

    private StatusProdutoEntregue() {
    }

    public static StatusProdutoEntregue getstatusProdutoEntregue() {
        return statusProdutoEntregue;
    }
}
