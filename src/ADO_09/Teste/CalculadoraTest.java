package ADO_09.Teste;

import ADO_09.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testGetSoma() {

        Calculadora calculadora = new Calculadora(10,2);
        assertEquals(12, calculadora.getSoma());

    }

    @Test
    public void testGetSubtracao() {

        Calculadora calculadora = new Calculadora(15,5);
        assertEquals(10, calculadora.getSubtracao());

    }

    @Test
    public void testGetMultiplicacao() {

        Calculadora calculadora = new Calculadora(15,2);
        assertEquals(30, calculadora.getMultiplicacao());

    }

    /*TESTADO COM JUNIT 5, (EXPECTED = ...) NÃO FUNCIONA*/

    @Test
    public void testDivisao() {

        Calculadora calculadora = new Calculadora(14,2);
        assertEquals(7, calculadora.getDivisao());

    }

    @Test
    public void testDivisaoExcecao() {

        Calculadora calculadora = new Calculadora(5,0);
        assertThrows(ArithmeticException.class, calculadora::getDivisao);

    }

}
