public class Pessoa {

    protected final long cpf;

    protected String nome;

    public Pessoa(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": " +
                "cpf=" + cpf +
                ", nome=" + nome;
    }
}
