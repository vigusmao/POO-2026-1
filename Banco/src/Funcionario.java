public class Funcionario extends Pessoa {

    private final int matricula;  // chave primária

    private float salario;

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

    @Override
    public String toString() {
        return "Funcionario{" + getInfo() + "}";
    }

    protected String getInfo() {
        return super.getInfo() +
                ", matricula=" + matricula +
                ", salario=" + salario;
    }
}
