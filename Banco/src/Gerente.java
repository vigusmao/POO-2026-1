import java.util.ArrayList;

public class Gerente extends Funcionario implements Avaliavel {

    private ArrayList<Funcionario> subordinados;

    public Gerente(long cpf, int matricula, String nome,
                   Banco bancoOndeTrabalha) {
        super(cpf, matricula, nome, bancoOndeTrabalha);
        this.subordinados = new ArrayList<>();
        this.salario = Banco.SALARIO_BASE * 2;
    }

    public void adicionarSubordinado(Funcionario novoSubordinado) {
        if (novoSubordinado.bancoOndeTrabalha != this.bancoOndeTrabalha) {
            throw new RuntimeException("O subordinado precisa ser do mesmo banco!");
        }
        subordinados.add(novoSubordinado);
    }

    public void imprimirEquipe() {
        for (Funcionario funcionario : this.subordinados) {
            System.out.println(funcionario);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tamanho da equipe=" + subordinados.size();
    }

    public void receberAvaliacao(int nota, Pessoa avaliador) {
        // ToDo IMPLEMENT ME!!!
    }

    public float getAvaliacaoMedia() {
        return 0;
        // ToDo IMPLEMENT ME!!!
    }
}
