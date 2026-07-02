import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class ImpressoraDecoratorComFiltragemConteudo implements InterfaceImpressora {

    private final InterfaceImpressora decorated;

    Set<String> palavrasImproprias;

    public ImpressoraDecoratorComFiltragemConteudo(InterfaceImpressora decorated) {
        this.decorated = decorated;
        this.palavrasImproprias = new HashSet<>();
        this.palavrasImproprias.add("bobo");
        this.palavrasImproprias.add("feio");
        this.palavrasImproprias.add("chato");
    }

    @Override
    public void addListenerParaFaltaDeTinta(ListenerParaFaltaDeTinta novoListener) {
        decorated.addListenerParaFaltaDeTinta(novoListener);
    }

    @Override
    public boolean imprimir(String texto) {
        // filtra o conteúdo
        StringTokenizer tokenizer = new StringTokenizer(texto, " ");
        StringBuilder sb = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (!palavrasImproprias.contains(token)) {
                sb.append(token).append(" ");
            }
        }
        System.out.println("Já filtrei as palavras impróprias!");
        return decorated.imprimir(sb.toString());
    }
}
