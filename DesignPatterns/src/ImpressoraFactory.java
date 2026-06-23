public class ImpressoraFactory {

    int contCriadas = 0;

    public Impressora createImpressora() {
        int mod = contCriadas++ % 3;
        switch (mod) {
            case 0:
                return new ImpressoraJatoDeTinta();
            case 1:
                return new ImpressoraLaser();
            case 2: default:
                return new ImpressoraMatricial();
        }
    }

    public Impressora createImpressora(int tamanhoDoTexto) {
        if (tamanhoDoTexto > 1000) {
            return new ImpressoraLaser();
        }
        return new ImpressoraJatoDeTinta();
    }

    public Impressora createImpressora(String tipo) {
        if (tipo.equalsIgnoreCase("laser")) {
            return new ImpressoraLaser();
        }
        return new ImpressoraJatoDeTinta();
    }
}
