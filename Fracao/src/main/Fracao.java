package main;

public class Fracao {

    public static final char SEPARADOR = '/';

    private int numerador;  // não-negativo

    private int denominador;  // positivo

    private boolean sinal;  // true para fração não-negativo

    private Fracao fracaoIrredutivelCacheada;

    public Fracao(int numerador, int denominador) {
        this(Math.abs(numerador), Math.abs(denominador),
                Aritmetica.obterSinal(numerador) == Aritmetica.obterSinal(denominador));
    }

    public Fracao(int numerador, int denominador, boolean sinal) {
        super();

        if (numerador < 0) {
            throw new RuntimeException("O numerador deve ser não-negativo!");
        }
        if (denominador == 0) {
            throw new RuntimeException(("O denominador não pode ser nulo!"));
        }
        if (denominador < 0) {
            throw new RuntimeException("O denominador não pode ser negativo!");
        }

        this.numerador = numerador;
        this.denominador = denominador;
        this.sinal = numerador == 0 ? true : sinal;
        this.fracaoIrredutivelCacheada = null;  // praticaremos lazy instantiation
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public boolean getSinal() {
        return sinal;
    }

    public double getValorNumerico() {
        return (sinal ? 1.0 : -1.0) * numerador / denominador;
    }

    public Fracao getFracaoIrredutivel() {
        if (fracaoIrredutivelCacheada != null) {
            return fracaoIrredutivelCacheada;
        }

        int mdc = Aritmetica.calcularMdc(numerador, denominador);
        if (mdc == 1) {
            return this;
        }
        Fracao fracaoIrredutivel = new Fracao(numerador / mdc, denominador / mdc, sinal);
        fracaoIrredutivelCacheada = fracaoIrredutivel;
        return fracaoIrredutivel;
    }

    @Override
    public String toString() {
        if (numerador == 0) {
            return "0";
        }

        return (!sinal ? "-" : "") +
                numerador +
                (denominador != 1 ? String.valueOf(SEPARADOR) + denominador : "");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fracao outraFracao = (Fracao) o;
        return getValorNumerico() == outraFracao.getValorNumerico();
    }
}
