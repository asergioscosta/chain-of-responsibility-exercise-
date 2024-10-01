package org.sistemaentregas;

public class FuncionarioDespachante extends Funcionario {

    public FuncionarioDespachante(Funcionario cargo) {
        statusProduto.add(StatusProdutoDespachado.getstatusProdutoDespachado());
        setCargoFuncionario(cargo);
    }

    public String getDescricaoCargo() {
        return "Despachante";
    }
}
