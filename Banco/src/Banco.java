import java.util.ArrayList;

public class Banco {

    public static final int TAMANHO_MAX_PRO_NOME = 10;
    public static final float SALARIO_BASE = 5_000f;

    private String nome;

    private ArrayList<ContaCorrente> contasCorrentes;

    private ArrayList<Funcionario> funcionarios;

    public Banco(String nome) {
        setNome(nome);
        this.contasCorrentes = new ArrayList<>();  // composição
        this.funcionarios = new ArrayList<>();  // composição
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

    /**
     * Cria um Funcionario novo (possivelmente da classe Gerente),
     * adicionando-o à lista de funcionários do banco.
     *
     * @param cpf o cpf do novo funcionário
     * @param nome o nome do novo funcionário
     * @param ehGerente indica se o novo funcionário será gerente
     *
     * @return o novo objeto criado, que será um Funcionario (ou subclasse)
     */
    public Funcionario adicionarFuncionario(
            long cpf, String nome, boolean ehGerente) {

        Funcionario novoFuncionario;
        int matricula = 1001 + funcionarios.size();

        if (ehGerente) {
            novoFuncionario = new Gerente(
                    cpf, matricula, nome, this);
            System.out.println(novoFuncionario.getClass());
//            ((Gerente)novoFuncionario).adicionarSubordinado(null);  // aqui um typecast para Gerente seria seguro

        } else {
            novoFuncionario = new Funcionario(
                    cpf, matricula, nome, this);
        }

        funcionarios.add(novoFuncionario);

        return novoFuncionario;
    }
}
