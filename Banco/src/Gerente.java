import java.util.ArrayList;

public class Gerente extends Funcionario {

    private ArrayList<Funcionario> subordinados;

    public Gerente(long cpf, int matricula, String nome,
                   Banco bancoOndeTrabalha) {
        super(cpf, matricula, nome, bancoOndeTrabalha);
        this.subordinados = new ArrayList<>();
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
        return "Gerente{" + getInfo() + "}";
    }

    protected String getInfo() {
        return super.getInfo() +
                ", tamanho da equipe=" + subordinados.size();
    }
}
