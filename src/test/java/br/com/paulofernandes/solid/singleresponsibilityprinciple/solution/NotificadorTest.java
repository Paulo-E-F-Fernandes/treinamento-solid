package br.com.paulofernandes.solid.singleresponsibilityprinciple.solution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificadorTest {

    private Notificador notificador;

    @BeforeEach
    void setUp() {
        notificador = new Notificador();
    }

    @AfterEach
    void tearDown() {
        notificador = null;
    }

    @Test
    void testMethodEnviaNotificacao() {
        final String result = notificador.enviaNotificacao();
        assertNotNull(result);
        assertEquals(Notificador.ENVIA_NOTIFICACAO_RETORNO, result);
    }

}