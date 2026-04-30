public class ContaCorrente {

    private final long numeroConta;

    private Pessoa correntista;

    private float saldoEmReais;

    /**
     * Até quanto o saldo da conta pode ficar negativo.
     */
    int limiteDoChequeEspecial;

    public ContaCorrente(long numeroConta, Pessoa correntista) {
        this.numeroConta = numeroConta;
        this.correntista = correntista; // agregação
        this.saldoEmReais = 0;
    }
}
