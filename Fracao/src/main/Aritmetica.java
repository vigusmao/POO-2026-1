package main;

public class Aritmetica {

    public static int calcularMdc(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new RuntimeException("Os números devem ser positivos.");
        }

        int resto = x % y;

        if (resto == 0) {
            return y;
        }

        return calcularMdc(y, resto);
    }

    public static boolean obterSinal(int x) {
        return x >= 0;
    }
}
