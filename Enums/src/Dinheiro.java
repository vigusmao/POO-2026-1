public enum Dinheiro {
    CINCO_CENTAVOS(0.05f, "cinco centavos", false),
    DEZ_CENTAVOS(0.10f, "dez centavos", false),
    VINTE_E_CINCO_CENTAVOS(0.25f, "vinte e cinco centavos", false),
    CINQUENTA_CENTAVOS(0.5f, "cinquenta centavos", false),
    UM_REAL(1, "um real", false),
    DOIS_REAIS(2, "dois reais", true),
    CINCO_REAIS(5, "cinco reais", true);

    public final float valorMonetario;
    public final String nome;
    public final boolean ehCedula;

    Dinheiro(float valorMonetario, String nome, boolean ehCedula) {
        this.valorMonetario = valorMonetario;
        this.nome = nome;
        this.ehCedula = ehCedula;
    }

    @Override
    public String toString() {
        return (ehCedula ? "nota" : "moeda") + " de " + nome;
    }
}
