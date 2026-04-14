package dominio;

public class Veiculo {

    private final int anoFabricacao;  // private é visível apenas de dentro da própria classe
                                      // final só pode ser incializado aqui mesmo ou no construtor, depois não pode mais mexer

    protected int capacidadePassageiros;  // protected é visível no mesmo package e também em todas as subclasses

    public String cor;  // visível de qualquer lugar do código

    int quilometrosRodados;  // modificador de acesso default (sem nada) --> visível no package

    private String nome;

    private float velocidadeEmMetrosPorSegundo;

    public Veiculo(String nome, int capacidadePassageiros, int anoFabricacao) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.anoFabricacao = anoFabricacao;
        this.cor = "Não informada";
        this.quilometrosRodados = 0;
        this.velocidadeEmMetrosPorSegundo = 0;
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public float getVelocidadeEmMetrosPorSegundo() {
        return velocidadeEmMetrosPorSegundo;
    }

    public void mover(float velocidade) {
        System.out.println("Estou me movendo com velocidade " + velocidade);
        this.velocidadeEmMetrosPorSegundo = velocidade;
        // verificar se a velocidade não é muito alta ou muita baixa
        // consumir combustível
        // aumentar temperatura
        // etc.
    }

    public void parar() {
        System.out.println(nome + " -- Parei!");
        this.velocidadeEmMetrosPorSegundo = 0;
    }

    public void colidir(Veiculo outro) {
        System.out.println("POW!!!!!");
        this.parar();
        outro.parar();
    }
}
