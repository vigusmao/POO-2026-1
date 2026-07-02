//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        GerenciadorDeImpressao g1 = new GerenciadorDeImpressao();
//        GerenciadorDeImpressao g2 = new GerenciadorDeImpressao();
//        GerenciadorDeImpressao g3 = new GerenciadorDeImpressao();
//        GerenciadorDeImpressao g4 = new GerenciadorDeImpressao();
        GerenciadorDeImpressao g1 = GerenciadorDeImpressao.getInstance();
        InterfaceImpressora imp;
        InterfaceImpressora imp2;

        String texto = "Oi mundo bobo tudo bem?";

        // ....

        imp = ImpressoraFactory.createImpressora(2000, false);
        imp2 = ImpressoraFactory.createImpressora(800, true);

        imp.imprimir(texto);
        imp2.imprimir(texto);

    }
}