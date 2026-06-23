import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public abstract class Impressora {

    private List<ListenerParaFaltaDeTinta> listenersParaFaltaDeTinta;
    private int autonomiaTinta = 1000;

    public Impressora() {
        this.listenersParaFaltaDeTinta = new ArrayList<>();
    }

    public void addListenerParaFaltaDeTinta(ListenerParaFaltaDeTinta novoListener) {
        listenersParaFaltaDeTinta.add(novoListener);
    }

    public void imprimir(String texto) {
        int tamanho = texto.length();
        if (autonomiaTinta < tamanho) {
            // OPA!!!! ACABOU A TINTA!!!!!
            notifyFaltaDeTinta();
        }
        autonomiaTinta -= tamanho;
    }

    private void notifyFaltaDeTinta() {
        for (ListenerParaFaltaDeTinta listener : listenersParaFaltaDeTinta) {
            listener.onFaltaDeTinta(this, CorTinta.PRETA);
        }
    }
}
