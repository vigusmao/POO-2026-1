public class ControladorEstoque implements ListenerParaFaltaDeTinta {

    private static ControladorEstoque instance = new ControladorEstoque();

    private ControladorEstoque() {
        GerenciadorDeImpressao gerImpressao = GerenciadorDeImpressao.getInstance();
        for (Impressora imp : gerImpressao.getImpressoras()) {
            imp.addListenerParaFaltaDeTinta(this);
        }
    }

    public static ControladorEstoque getInstance() {
        return instance;
    }

    public void comprar() {
        // ToDo
    }

    // (...)

    public void onFaltaDeTinta(Impressora impressora, CorTinta cor) {
        comprar();  // passando o modelo correto e a cor...
    }



}
