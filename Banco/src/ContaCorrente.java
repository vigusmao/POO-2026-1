import exception.SaldoInsuficienteException;
import exception.SenhaInvalidaException;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private final long numeroConta;

    private Pessoa correntista;

    private float saldoEmReais;

    private int senha = 1234;

    private List<String> extrato;

    /**
     * Até quanto o saldo da conta pode ficar negativo.
     */
    int limiteDoChequeEspecial;

    public ContaCorrente(long numeroConta, Pessoa correntista) {
        this.numeroConta = numeroConta;
        this.correntista = correntista; // agregação
        this.saldoEmReais = 1000;
        this.extrato = new ArrayList<>();
        this.extrato.add("Conta criada");
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void sacar(float valor, int senha) throws SenhaInvalidaException,
                                                     SaldoInsuficienteException {
        if (valor <= 0) {
            // IllegalArgumentException é uma RuntimeException (uma das mais comuns)
            throw new IllegalArgumentException("Valor inválido pro saque");
        }
        if (senha != this.senha) {
            throw new SenhaInvalidaException();
        }
        if (this.saldoEmReais < valor) {
            throw new SaldoInsuficienteException(valor - this.saldoEmReais);
        }

        this.saldoEmReais -= valor;
        this.extrato.add(String.format(
                "Saldo feito no valor de %.2f", valor));
    }

    public float getSaldoEmReais() {
        return saldoEmReais;
    }
}
