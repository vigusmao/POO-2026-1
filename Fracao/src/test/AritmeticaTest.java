package test;

import main.Aritmetica;
import main.Fracao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AritmeticaTest {

    @Test
    public void testarClacularMdc() {
        assertEquals(1, Aritmetica.calcularMdc(90, 7));
        assertEquals(52, Aritmetica.calcularMdc(52, 52));
        assertEquals(6, Aritmetica.calcularMdc(24, 18));
    }

    @Test
    public void testarObterSinal() {
        assertEquals(true, Aritmetica.obterSinal(78));
        assertEquals(false, Aritmetica.obterSinal(-78));
        assertEquals(true, Aritmetica.obterSinal(0));
        assertEquals(true, Aritmetica.obterSinal(-0));
        assertEquals(false, Aritmetica.obterSinal(-1));
    }
}