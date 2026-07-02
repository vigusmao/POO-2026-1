import exception.SaldoInsuficienteException;
import exception.SenhaInvalidaException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContaCorrenteTest {

    private static float FLOAT_DELTA = 0.00001f;
    private ContaCorrente conta;

    @Before
    public void setUp() {
        Pessoa joao = new Pessoa(12324, "João");
        conta = new ContaCorrente(111, joao);
    }

    @Test
    public void testarSaqueBemSucedido() throws SaldoInsuficienteException, SenhaInvalidaException {
        float saldoAnterior = conta.getSaldoEmReais();
        assertTrue(saldoAnterior >= 1);  // senão não consigo testar
        conta.sacar(1, 1234);
        float novoSaldo = conta.getSaldoEmReais();
        assertEquals(saldoAnterior - 1, novoSaldo, FLOAT_DELTA);
    }

    @Test
    public void testarSenhaInvalida() throws SaldoInsuficienteException {
        float saldoAnterior = conta.getSaldoEmReais();
        assertTrue(saldoAnterior >= 1);  // senão não consigo testar
        try {
            conta.sacar(1, 1234);  // senha errada de propósito
            fail("Era para lançar SenhaInvalidaException!!!");
        } catch (SenhaInvalidaException e) {
            // deu bom! tomei a exceção que era para tomar (estava sendo testada)
        }
        // tchau
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testarSaldoInsuficiente() throws SenhaInvalidaException, SaldoInsuficienteException {
        float saldoAnterior = conta.getSaldoEmReais();
        assertTrue(saldoAnterior >= 1);  // senão não consigo testar
        conta.sacar(50000, 1234);  // valor muito alto de propósito
    }
}