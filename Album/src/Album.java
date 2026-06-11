import java.util.HashMap;
import java.util.Map;

public class Album<T extends Colecionavel> {

//    Figurinha[] itens;
    private Map<Integer, T> itemPorPosicao;
    private Map<Integer, Integer> contRepetidasPorPosicao;
    private int tamanho;
    
    public Album(int tamanho) {
//        itens = new Figurinha[tamanho + 1];  // end direto, sem usar a posição 0
        itemPorPosicao = new HashMap<>();
        this.tamanho = tamanho;
    }

    public int getQuantasFaltamParaCompletar() {
        return tamanho - itemPorPosicao.size();
    }

    public void receberNovoItem(T item) {
        boolean ehRepetido = itemPorPosicao.containsKey(item.getPosicao());
    }

    public T getItemDaPosicao(int posicao) {
        return itemPorPosicao.get(posicao);
    }
}
