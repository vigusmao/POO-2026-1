public class ImpressoraFactory {

    static int contCriadas = 0;

    public static Impressora createImpressora() {
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

    public static InterfaceImpressora createImpressora(int tamanhoDoTexto, boolean filtrarConteudo) {
        Impressora imp;
        if (tamanhoDoTexto > 1000) {
            imp = new ImpressoraMatricial();
        } else {
            imp = new ImpressoraJatoDeTinta();
        }
        return filtrarConteudo ? new ImpressoraDecoratorComFiltragemConteudo(imp)
                               : imp;
    }

    public static Impressora createImpressora(String tipo) {
        if (tipo.equalsIgnoreCase("laser")) {
            return new ImpressoraLaser();
        }
        return new ImpressoraJatoDeTinta();
    }
}
