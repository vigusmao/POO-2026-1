import java.awt.*;

public class Figurinha implements Colecionavel {

    private int posicao;

    private String texto;  // o melhor seria imagem

    public Figurinha(int posicao, String texto) {
        this.posicao = posicao;
        this.texto = texto;
    }

    public int getPosicao() {
        return posicao;
    }

    public String getTexto() {
        return texto;
    }
}
