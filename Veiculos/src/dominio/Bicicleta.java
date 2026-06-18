package dominio;

public class Bicicleta extends Veiculo {

    public Bicicleta(String nome, int capacidadePassageiros, int anoFabricacao) {
        super(nome, capacidadePassageiros, anoFabricacao);
    }

    @Override
    public void mover(float velocidade) {
        System.out.println("Pedalando para andar...");
    }
}
