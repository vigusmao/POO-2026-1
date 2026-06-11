//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Album<Figurinha> albumDaCopa = new Album(994);

        Figurinha fig = new Figurinha(15, "Fulano");
        albumDaCopa.receberNovoItem(fig);

        Figurinha f = albumDaCopa.getItemDaPosicao(100);
        System.out.println(f.getTexto());


        Album<Selo> albumDeSelos = new Album(220);

        Selo selo = new Selo();
        albumDeSelos.receberNovoItem(selo);

        Selo s = albumDeSelos.getItemDaPosicao(100);
        System.out.println(s.getTexto());


    }
}