public class Funcionario extends Pessoa {

    private final int matricula;  // chave primária

    float salario;  // visível no package

    protected Banco bancoOndeTrabalha;

    public Funcionario(long cpf, int matricula, String nome,
                       Banco bancoOndeTrabalha) {
        super(cpf, nome);

        this.matricula = matricula;
        this.salario = Banco.SALARIO_BASE;
        this.bancoOndeTrabalha = bancoOndeTrabalha;  // agregação
    }

    public void imprimirContracheque() {
        System.out.printf(
                "Salário do funcionário %d = R$%.2f\n", matricula, salario);
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", matricula=" + matricula +
                ", salario=" + salario;
    }
}
