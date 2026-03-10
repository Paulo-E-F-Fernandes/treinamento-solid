package br.com.paulofernandes.solid.singleresponsibilityprinciple.solution;

import java.util.logging.Logger;

public class GerenciadorTarefas {

    protected static final String ATUALIZA_TAREFA_INFO = "Atualizando Tarefa";
    protected static final String ATUALIZA_TAREFA_RETORNO = "Tarefa atualizada";
    protected static final String CRIA_TAREFA_INFO = "Criando Tarefa";
    protected static final String CRIA_TAREFA_RETORNO = "Tarefa criada";
    protected static final String REMOVE_TAREFA_INFO = "Removendo Tarefa";
    protected static final String REMOVE_TAREFA_RETORNO = "Tarefa removida";

    private final Logger logger = Logger.getLogger(getClass().getName());

    public String criaTarefa() {
        logger.info(CRIA_TAREFA_INFO);
        return CRIA_TAREFA_RETORNO;
    }

    public String atualizaTarefa() {
        logger.info(ATUALIZA_TAREFA_INFO);
        return ATUALIZA_TAREFA_RETORNO;
    }

    public String removeTarefa() {
        logger.info(REMOVE_TAREFA_INFO);
        return REMOVE_TAREFA_RETORNO;
    }

}
