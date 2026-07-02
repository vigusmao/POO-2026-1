import java.util.ArrayList;
import java.util.List;

// Singleton
public class GerenciadorDeImpressao {

    private static GerenciadorDeImpressao instance;

    private List<Impressora> impressoras;

    private Object objeto;

    // impedindo a criação explícita de novas instâncias
    private GerenciadorDeImpressao() {
        objeto = new Object();
        impressoras = new ArrayList<>();
    }

    public void adicionarImpressora(String modelo, int quantidade) {
        // ToDo IMPLEMENT ME
    }

    public List<Impressora> getImpressoras() {
        return impressoras;
    }

    public static GerenciadorDeImpressao getInstance() {
        if (instance == null) {
            instance = new GerenciadorDeImpressao();
        }
        return instance;
    }

    public void adicionarJob(String texto, Impressora impressora) {
        // ToDo IMPLEMENT ME
    }



}
