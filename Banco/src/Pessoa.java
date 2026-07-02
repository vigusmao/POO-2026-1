import java.util.ArrayList;

public class Pessoa {

    protected final long cpf;

    protected String nome;

    private ArrayList<Avaliavel> itensAvaliados;

    public Pessoa(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.itensAvaliados = new ArrayList<>();
    }

    public Avaliavel getUltimoItemAvaliado() {
        return itensAvaliados.get(itensAvaliados.size() - 1);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": " +
                "cpf=" + cpf +
                ", nome=" + nome;
    }


    public void avaliar(Avaliavel avaliavel, int nota) {
        if (nota < 1 || nota > 5) {
            throw new RuntimeException("Nota inválida");
        }
        avaliavel.receberAvaliacao(nota, this);
        // anotar em algum lugar que esta pessoa avaliou o banco tal.
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
