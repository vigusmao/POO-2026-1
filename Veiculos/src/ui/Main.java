package ui;

import dominio.Carro;
import dominio.Veiculo;

public class Main {

    public static void main(String[] args) {

        Veiculo veiculoTosco = new Veiculo("Tosco", 5, 1966);
        veiculoTosco.mover(15);
        System.out.println(veiculoTosco.getVelocidadeEmMetrosPorSegundo());
        veiculoTosco.parar();
        System.out.println(veiculoTosco.getVelocidadeEmMetrosPorSegundo());

        Veiculo outroVeiculoGenericoTosco = new Veiculo("Outro Tosco", 4, 1980);

//        veiculoTosco.colidir(outroVeiculoGenericoTosco);



        Carro calhambeque = new Carro("Calhambeque", 2022, false);//        System.out.println("calhambeque.getVelocidadeEmMetrosPorSegundo() --> " +
//                calhambeque.getVelocidadeEmMetrosPorSegundo());
//
//        calhambeque.mover(18);
//
//        System.out.println("calhambeque.getVelocidadeEmMetrosPorSegundo() --> " +
//                calhambeque.getVelocidadeEmMetrosPorSegundo());
//
//        for (int i = 0; i < 10; i++) {
//            calhambeque.buzinar();
//        }
//
//        calhambeque.parar();
//
//        System.out.println("calhambeque.getVelocidadeEmMetrosPorSegundo() --> " +
//                calhambeque.getVelocidadeEmMetrosPorSegundo());

        veiculoTosco.colidir(calhambeque);
    }



}