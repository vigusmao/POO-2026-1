public interface InterfaceImpressora {
    void addListenerParaFaltaDeTinta(ListenerParaFaltaDeTinta novoListener);
    boolean imprimir(String texto);
}
