public interface Guardador {
    /** Armazena o item informado. */
    void guardar(Guardavel item);

    /** Joga fora o item que estiver guardado no momento. Se não houver item, não faz nada.*/
    void esvaziar();

    /** Retorna o item que está guardado. Mas ele continua guardado. */
    Guardavel recuperar();
}