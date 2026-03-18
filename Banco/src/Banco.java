import java.util.ArrayList;

public class Banco {

    public final static int TAMANHO_MAX_PRO_NOME = 10;

    private String nome;

    private ArrayList<ContaCorrente> contasCorrentes;

    public Banco(String nome) {
        setNome(nome);
        this.contasCorrentes = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        if (novoNome.length() >  TAMANHO_MAX_PRO_NOME) {
            return;  // o correto seria lançar uma exceção
        }
        this.nome = novoNome;
    }

    public int getNumeroDeContasCorrentes() {
        return contasCorrentes.size();
    }
}
