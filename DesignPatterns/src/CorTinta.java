public enum CorTinta {

    AMARELO(12343),
    MAGENTA(63453),
    CIANO(24587),
    PRETA(0);

    private int codigo;

    CorTinta(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
