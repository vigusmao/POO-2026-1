package main;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        int y = 5;
        System.out.println("x == y: " + (x == y));
        
        Fracao doisSetimos = new Fracao(2, 7);
        Fracao outroDoisSetimos = new Fracao(20, 70);

        System.out.println("doisSetimos == outroDoisSetimos: " +
                (doisSetimos == outroDoisSetimos));
        System.out.println("doisSetimos.equals(outroDoisSetimos): " +
                doisSetimos.equals(outroDoisSetimos));
    }
}