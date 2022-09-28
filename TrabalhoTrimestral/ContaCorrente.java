package TrabalhoTrimestral;

import java.sql.PreparedStatement;

public class ContaCorrente extends Cliente {


    public void Creditar(Double valor) {
        if (valor <= 0.0)
            throw new RuntimeException("Valor invalido");

        //Aqui iremos creditar o valor informado na conta.
        this.saldoConta += valor;

    }

    @Override
    public void Debitar(Double valor) {
        if ((this.saldoConta - valor) <= 0.0)
            throw new RuntimeException("Valor invalido");

        if ((this.saldoConta - valor) <= 0.0)
            throw new RuntimeException("Valor invalido para débito");

        //Aqui iremos debitar o valor informado da conta.
        this.saldoConta -= valor;
    }

    public ContaCorrente(String nome, int cpf){
        super();
    }


    @Override
    public Double getSaldo() {
        return this.saldoConta;
    }

}
