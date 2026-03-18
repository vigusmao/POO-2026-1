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
    }
}