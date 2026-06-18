package ui;

import dominio.Bicicleta;
import dominio.Carro;
import dominio.Veiculo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Main {

    static Random random = new Random();

    public static Veiculo selecionarVeiculo() {
        Veiculo selecionado;
        if (random.nextFloat() < 0.5f) {
            selecionado = new Carro("Subaru", 2026, false);
        } else {
            selecionado = new Bicicleta("Caloi", 1, 2022);
        }
        return selecionado;
    }

    public static void main(String[] args) {

        ArrayList<Veiculo> garagem = new ArrayList<>();

        Veiculo veiculoTosco;
        // (...)

        veiculoTosco = selecionarVeiculo();


        for (int i = 0; i < 10; i++) {
            garagem.add(selecionarVeiculo());
        }

        darManutencao(garagem);
    }

    public static void darManutencao(Collection<Veiculo> veiculos) {
        for (Veiculo v : veiculos) {
            System.out.println("Reparando veículo " + v.getNome());
        }
    }


}