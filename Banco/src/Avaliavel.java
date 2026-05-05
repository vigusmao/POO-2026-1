public interface Avaliavel {

    /**
     * Recebe uma avaliação feita...
     *
     * @param nota uma nota inteira entre 1 e 5
     * @param avaliador a pessoa que está avaliando o item
     */
    void receberAvaliacao(int nota, Pessoa avaliador);

    /**
     * Retorna a nota média obtida ao longo dos tempos.
     *
     * @return float representando a nota média
     */
    float getAvaliacaoMedia();
}
