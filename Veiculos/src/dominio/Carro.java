package dominio;

public class Carro extends Veiculo {

    private boolean eletrico;

    public Carro(String nome, int anoFabricacao, boolean eletrico) {
        super(nome,5, anoFabricacao);
        this.eletrico = eletrico;
    }

    @Override
    public void parar() {
        System.out.println("Acionando os freios do carro!!!!");
        super.parar();
        buzinar();
    }

    public void buzinar() {
        System.out.println("FON FOOOOOOOOONNNN!!!!!!");
    }


}
