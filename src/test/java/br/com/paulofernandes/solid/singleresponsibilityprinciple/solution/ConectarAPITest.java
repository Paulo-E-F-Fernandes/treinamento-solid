package br.com.paulofernandes.solid.singleresponsibilityprinciple.solution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConectarAPITest {

    private ConectarAPI conectarAPI;

    @BeforeEach
    void setUp() {
        conectarAPI = new ConectarAPI();
    }

    @AfterEach
    void tearDown() {
        conectarAPI = null;
    }

    @Test
    void testMethodConectaAPI() {
        final String result = conectarAPI.conectaAPI();
        assertNotNull(result);
        assertEquals(ConectarAPI.CONECTA_API_RETORNO, result);
    }

}