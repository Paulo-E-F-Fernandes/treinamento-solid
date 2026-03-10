package br.com.paulofernandes.solid.singleresponsibilityprinciple.problem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorTarefasTest {

    private GerenciadorTarefas gerenciadorTarefasProblem;

    @BeforeEach
    void setUp() {
        gerenciadorTarefasProblem = new GerenciadorTarefas();
    }

    @AfterEach
    void tearDown() {
        gerenciadorTarefasProblem = null;
    }

    @Test
    void testMethodConectaAPI() {
        final String result = gerenciadorTarefasProblem.conectaAPI();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.CONECTA_API_RETORNO, result);
    }

    @Test
    void testMethodCriaTarefa() {
        final String result = gerenciadorTarefasProblem.criaTarefa();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.CRIA_TAREFA_RETORNO, result);
    }

    @Test
    void testMethodAtualizaTarefa() {
        final String result = gerenciadorTarefasProblem.atualizaTarefa();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.ATUALIZA_TAREFA_RETORNO, result);
    }

    @Test
    void testMethodRemoveTarefa() {
        final String result = gerenciadorTarefasProblem.removeTarefa();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.REMOVE_TAREFA_RETORNO, result);
    }

    @Test
    void testMethodEnviaNotificacao() {
        final String result = gerenciadorTarefasProblem.enviaNotificacao();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.ENVIA_NOTIFICACAO_RETORNO, result);
    }

    @Test
    void testMethodGeraRelatorio() {
        final String result = gerenciadorTarefasProblem.geraRelatorio();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.GERA_RELATORIO_RETORNO, result);
    }

    @Test
    void testMethodEnviaRelatorio() {
        final String result = gerenciadorTarefasProblem.enviaRelatorio();
        assertNotNull(result);
        assertEquals(GerenciadorTarefas.ENVIA_RELATORIO_RETORNO, result);
    }

}