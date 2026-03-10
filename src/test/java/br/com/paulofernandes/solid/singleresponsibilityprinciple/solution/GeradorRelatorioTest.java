package br.com.paulofernandes.solid.singleresponsibilityprinciple.solution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GeradorRelatorioTest {

    private GeradorRelatorio geradorRelatorio;

    @BeforeEach
    void setUp() {
        geradorRelatorio = new GeradorRelatorio();
    }

    @AfterEach
    void tearDown() {
        geradorRelatorio = null;
    }

    @Test
    void testMethodGeraRelatorio() {
        final String result = geradorRelatorio.geraRelatorio();
        assertNotNull(result);
        assertEquals(GeradorRelatorio.GERA_RELATORIO_RETORNO, result);
    }

    @Test
    void testMethodEnviaRelatorio() {
        final String result = geradorRelatorio.enviaRelatorio();
        assertNotNull(result);
        assertEquals(GeradorRelatorio.ENVIA_RELATORIO_RETORNO, result);
    }

}