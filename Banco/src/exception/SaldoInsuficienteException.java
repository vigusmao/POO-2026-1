package exception;

public class SaldoInsuficienteException extends Exception {

    private float valorFaltante;

    public SaldoInsuficienteException(float valorFaltante) {
        super(String.format("Faltaram R$%.2f", valorFaltante));
        this.valorFaltante = valorFaltante;
    }

    public float getValorFaltante() {
        return this.valorFaltante;
    }
}
