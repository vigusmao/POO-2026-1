public class Pessoa {

    protected final long cpf;

    protected String nome;

    public Pessoa(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + getInfo() + "}";
    }

    protected String getInfo() {
        return "cpf=" + cpf +
                ", nome=" + nome;
    }
}
