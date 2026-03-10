package br.com.paulofernandes.solid.singleresponsibilityprinciple.solution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GerenciadorTarefasTest {

   private GerenciadorTarefas gerenciadorTarefasSolution;

    @BeforeEach
    void setUp() {
        gerenciadorTarefasSolution = new GerenciadorTarefas();
    }

    @AfterEach
    void tearDown() {
        gerenciadorTarefasSolution = null;
    }

    @Test
    void testMethodCriaTarefa() {
        final String result = gerenciadorTarefasSolution.criaTarefa();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.CRIA_TAREFA_RETORNO, result);
    }

    @Test
    void testMethodAtualizaTarefa() {
        final String result = gerenciadorTarefasSolution.atualizaTarefa();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.ATUALIZA_TAREFA_RETORNO, result);
    }

    @Test
    void testMethodRemoveTarefa() {
        final String result = gerenciadorTarefasSolution.removeTarefa();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.REMOVE_TAREFA_RETORNO, result);
    }

}