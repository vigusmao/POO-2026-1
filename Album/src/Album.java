import java.util.HashMap;
import java.util.Map;

public class Album<T extends Colecionavel> {

//    Figurinha[] itens;
    private Map<Integer, T> itemPorPosicao;
    private Map<Integer, Integer> contRepetidasPorPosicao;
    private int tamanho;  // tamanho do álbum completo
    
    public Album(int tamanho) {
//        itens = new Figurinha[tamanho + 1];  // end direto, sem usar a posição 0
        itemPorPosicao = new HashMap<>();
        this.tamanho = tamanho;
    }

    public int getQuantasFaltamParaCompletar() {
        return tamanho - itemPorPosicao.size();
    }

    public void receberNovoItem(T item) {
        int posicao = item.getPosicao();
        if (posicao < 1 || posicao > this.tamanho) {
            // semântica: Não era pra acontecer!!!!!
            throw new IllegalArgumentException("Posição inválida!");
        }
        boolean ehRepetido = itemPorPosicao.containsKey(posicao);
        if (!ehRepetido) {
            itemPorPosicao.put(posicao, item);
        }
    }

    public T getItemDaPosicao(int posicao) {
        return itemPorPosicao.get(posicao);
    }
}
