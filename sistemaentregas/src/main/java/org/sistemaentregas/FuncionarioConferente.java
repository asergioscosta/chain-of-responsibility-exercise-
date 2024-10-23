package org.sistemaentregas;

public class FuncionarioConferente extends Funcionario{

    public FuncionarioConferente(Funcionario cargo) {
        statusProduto.add(StatusProdutoConferido.getstatusProdutoConferido());
        setCargoFuncionario(cargo);
    }

    public String getDescricaoCargo() {
        return "Conferente";
    }
}
