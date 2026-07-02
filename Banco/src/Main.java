import exception.SaldoInsuficienteException;
import exception.SenhaInvalidaException;

import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static final int N_CLIENTES = 1_000_000;

    static Random random = new Random();

    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banquinho");

//        // adicione N_CLIENTES clientes ao banco
//        for (int i = 0; i < N_CLIENTES; i++) {
//            int cpfAleatorio = random.nextInt();
//            meuBanco.adicionarCliente(cpfAleatorio, "sem nome");
//        }
        Pessoa joao = meuBanco.adicionarCliente(5678, "João");

        System.out.println("Vou começar as buscas...");
        long inicio = System.currentTimeMillis();

//        int contEncontrados = 0;
//        for (int i = 5678; i < 5678 + N_CLIENTES; i++) {
//            if (meuBanco.obterCliente(i) != null) {
//                contEncontrados++;
//            }
//        }
//        long duracao = System.currentTimeMillis() - inicio;
//        System.out.println("Encontrados = " + contEncontrados);
//        System.out.printf("Tempo = %.3f segundos\n", (duracao/1000.0));

        int contSenhasInvalidas = 0;
        ContaCorrente conta = meuBanco.abrirContaCorrente(joao);

        try {
            System.out.println(fazerAlgoComAConta(conta));
        } catch (SaldoInsuficienteException e) {
            System.out.println("Não teve saldo.");
        }

    }

    public static Pessoa fazerAlgoComAConta(ContaCorrente conta) throws SaldoInsuficienteException {
        Pessoa donoDaConta = conta.getCorrentista();
        int x = 5;
        try {
             conta.sacar(800, 123438574);
             return donoDaConta;
        } catch (SenhaInvalidaException e) {
            System.out.println("Senha inválida. Tente novamente.");
            return donoDaConta;
        } finally {
            donoDaConta.setNome("Joana Pós-Finally");
            System.out.println("Estou rodando o finally!!!!");
        }
//        System.out.println("Continuei a execução depois do try...catch...finally");
//        return 0;
    }
}