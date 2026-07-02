import java.util.ArrayList;
import java.util.List;

public abstract class Impressora implements InterfaceImpressora {

    private List<ListenerParaFaltaDeTinta> listenersParaFaltaDeTinta;
    private int autonomia = 1000;

    public Impressora() {
        this.listenersParaFaltaDeTinta = new ArrayList<>();
    }

    public void addListenerParaFaltaDeTinta(ListenerParaFaltaDeTinta novoListener) {
        listenersParaFaltaDeTinta.add(novoListener);
    }

    protected abstract void executarImpressao(String texto);

    public boolean imprimir(String texto) {
        int tamanho = texto.length();
        if (autonomia < tamanho) {
            // OPA!!!! REABASTECER!!!!!
            notifyFaltaDeTinta();
            return false;
        }
        executarImpressao(texto);
        autonomia -= tamanho;
        return true;
    }

    private void notifyFaltaDeTinta() {
        for (ListenerParaFaltaDeTinta listener : listenersParaFaltaDeTinta) {
            listener.onFaltaDeTinta(this, CorTinta.PRETA);
        }
    }
}
