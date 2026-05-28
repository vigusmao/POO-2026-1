public abstract class Caixa implements Guardador {

    private final float precoPorArmazenamentoEmReais;
    private int periodicidadeDeCobranca;

    private Guardavel objetoGuardado;

    public static final int PESO_MAXIMO_EM_GRAMAS = 5000;

    private int contadorHistoricoDeItens = 0;

    public Caixa(float precoPorArmazenamentoEmReais, int periodicidadeDeCobranca) {
        this.precoPorArmazenamentoEmReais = precoPorArmazenamentoEmReais;
        this.periodicidadeDeCobranca = periodicidadeDeCobranca;
    }

    @Override
    public void guardar(Guardavel item) {
        if (item.getPesoEmGramas() > PESO_MAXIMO_EM_GRAMAS) {
            throw new RuntimeException("Item muito pesado para ser guardado");
        }
        if (objetoGuardado != null) {
            if (!tratarOverflow()) {
                throw new RuntimeException("Caixa cheia. Impossível armazenar.");
            }
        }
        objetoGuardado = item;
        contadorHistoricoDeItens++;
        if (contadorHistoricoDeItens % periodicidadeDeCobranca == 0) {
            cobrar();
        }
    }

    @Override
    public Guardavel recuperar() {
        return objetoGuardado;
    }

    @Override
    public void esvaziar();

    private void cobrar() {
        System.out.printf("Emitindo Nota Fiscal no valor de R$%.2f",
                periodicidadeDeCobranca * precoPorArmazenamentoEmReais);
    }

    /** Decide o que fazer se a caixa já estiver ocupada.
     * @return true, se é permitido armazenar um novo item, substituindo o atual;
     *         false, se não é permitido armazenar outro item, substituindo o atual */
    protected abstract boolean tratarOverflow();
}
