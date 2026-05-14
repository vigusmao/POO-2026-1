import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banquinho");
        System.out.println(
                "O banco " + meuBanco.getNome() + " possui " +
                        meuBanco.getNumeroDeContasCorrentes() +
                        " contas correntes.");

        Funcionario funcionario1 = meuBanco.adicionarFuncionario(1111, "Um", false);
        Funcionario funcionario2 = meuBanco.adicionarFuncionario(2222, "Dois", false);
        Funcionario funcionario3 = meuBanco.adicionarFuncionario(3333, "Três", false);
        Funcionario funcionario4 = meuBanco.adicionarFuncionario(4444, "Quatro", false);
        Funcionario funcionario5 = meuBanco.adicionarFuncionario(5555, "Cinco", false);

        Gerente gerente1 = (Gerente) meuBanco.adicionarFuncionario(11
                , "Gerente Um", true);


        Funcionario x = meuBanco.obterFuncionarioDoMes();

        System.out.println("gerente1 instanceof Avaliavel = " + (x instanceof Avaliavel));
        System.out.println(((Avaliavel) x).getAvaliacaoMedia());


        funcionario5.avaliar(gerente1, 4);
//        funcionario5.avaliar(funcionario4, 4);   //  <---- isso nem sequer compila!


        System.out.println("Acabei de criar um gerente. Vou imprimi-lo.");
        System.out.println(gerente1.toString());

        Gerente gerente2 = (Gerente) meuBanco.adicionarFuncionario(
                22, "Gerente Dois", true);

        gerente1.adicionarSubordinado(funcionario1);
        gerente1.adicionarSubordinado(funcionario2);
        gerente1.adicionarSubordinado(funcionario3);

        gerente2.adicionarSubordinado(funcionario4);
        gerente2.adicionarSubordinado(funcionario5);

        meuBanco.promoverFuncionario(funcionario3);
        meuBanco.promoverFuncionario(gerente2);
    }
}