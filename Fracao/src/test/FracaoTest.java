package test;

import main.Fracao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
// outro jeito (muito mais simples!) de se testar o lançamento de exceção
//    @Test
//    public void testarExcecaoSeDenominadorNulo() {
//        assertThrows(RuntimeException.class, () ->
//                new Fracao(18, 0));
//    }

    @Test
    public void testarGetValorNumerico() {
        assertEquals(0.5,
                (new Fracao(3, 6)).getValorNumerico());
        assertEquals(-0.5,
                (new Fracao(3, -6)).getValorNumerico());
        assertEquals(-0.5,
                (new Fracao(3, 6, false)).getValorNumerico());
        assertEquals(0,
                (new Fracao(0, -6)).getValorNumerico());
    }

    @Test
    public void testarGetFracaoIrredutivelParaFracaoJaIrredutivel() {
        Fracao f = new Fracao(2, 7);
        Fracao resultado = f.getFracaoIrredutivel();
        assertTrue(resultado == f);  // precisam de fato ser o mesmo objeto!!!
    }

    @Test
    public void testarGetFracaoIrredutivelParaFracaoRedutivel() {
        Fracao f = new Fracao(20, 70);

        Fracao resultado = f.getFracaoIrredutivel();
        assertEquals(2, resultado.getNumerador());
        assertEquals(7, resultado.getDenominador());
        assertTrue(resultado.getSinal());

        Fracao resultado2 = f.getFracaoIrredutivel();

        assertTrue(resultado == resultado2);  // quero que sempre retorne o mesmo objeto
    }
}
