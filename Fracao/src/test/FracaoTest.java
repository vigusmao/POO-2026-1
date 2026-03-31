package test;

import main.Fracao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FracaoTest {

    @Test
    public void testarToStringParaFracaoPositiva() {
        assertEquals("2/7", (new Fracao(2, 7)).toString());
        assertEquals("2/7", (new Fracao(-2, -7)).toString());
        assertEquals("2/7", (new Fracao(2, 7, true)).toString());
    }

    @Test
    public void testarToStringParaFracaoNegativa() {
        assertEquals("-2/7", (new Fracao(-2, 7)).toString());
        assertEquals("-2/7", (new Fracao(2, -7)).toString());
        assertEquals("-2/7", (new Fracao(2, 7, false)).toString());
    }

    @Test
    public void testarToStringParaFracaoNula() {
        assertEquals("0", (new Fracao(0, 7, false)).toString());
        assertEquals("0", (new Fracao(0, 7, true)).toString());
    }

    @Test
    public void testarToStringParaFracaoComDenominadorUnitario() {
        assertEquals("4", (new Fracao(4, 1, true)).toString());
        assertEquals("-3", (new Fracao(3, 1, false)).toString());
        assertEquals("3", (new Fracao(-3, -1)).toString());
    }

    @Test
    public void testarExcecaoSeDenominadorNulo() {
        try {
            Fracao f = new Fracao(18, 0);
            fail("Era para lançar uma RuntimeException quando o denominador é zero.");
        } catch (RuntimeException e) {
            System.out.println("capturei a exceção!!");
            // ok!!!! Era pra entrar aqui mesmo!!!!!
        }
    }
}
