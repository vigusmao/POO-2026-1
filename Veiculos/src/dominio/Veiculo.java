package dominio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Veiculo {

    private final int anoFabricacao;  // private é visível apenas de dentro da própria classe
                                      // final só pode ser incializado aqui mesmo ou no construtor, depois não pode mais mexer

    protected int capacidadePassageiros;  // protected é visível no mesmo package e também em todas as subclasses

    public String cor;  // visível de qualquer lugar do código

    int quilometrosRodados;  // modificador de acesso default (sem nada) --> visível no package

    private String nome;

    private float velocidadeEmMetrosPorSegundo;

    private List<String> destinosVisitados;

    public Veiculo(String nome, int capacidadePassageiros, int anoFabricacao) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.anoFabricacao = anoFabricacao;
        this.cor = "Não informada";
        this.quilometrosRodados = 0;
        this.velocidadeEmMetrosPorSegundo = 0;
        this.nome = nome;
        this.destinosVisitados = new ArrayList<>();
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public float getVelocidadeEmMetrosPorSegundo() {
        return velocidadeEmMetrosPorSegundo;
    }

    public abstract void mover(float velocidade);

    public void parar() {
        System.out.println(nome + " -- Parei!");
        this.velocidadeEmMetrosPorSegundo = 0;
        this.destinosVisitados.add("Parei no destino tal");
    }

    public void colidir(Veiculo outro) {
        System.out.println("POW!!!!!");
        this.parar();
        outro.parar();
    }
}
