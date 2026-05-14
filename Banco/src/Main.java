import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static final int N_CLIENTES = 1000000;

    static Random random = new Random();

    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banquinho");

        long inicio = System.currentTimeMillis();

        // adicione N_CLIENTES clientes ao banco

        long cpfAleatorio = random.nextLong();

        // manda buscar N_CLIENTES longs ("CPFs") aleatórios

        long duracao = System.currentTimeMillis() - inicio;


    }
}