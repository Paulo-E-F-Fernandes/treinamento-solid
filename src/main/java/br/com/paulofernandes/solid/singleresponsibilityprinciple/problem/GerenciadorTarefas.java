package br.com.paulofernandes.solid.singleresponsibilityprinciple.problem;

import java.util.logging.Logger;

public class GerenciadorTarefas {

    protected static final String ATUALIZA_TAREFA_INFO = "Atualizando Tarefa";
    protected static final String ATUALIZA_TAREFA_RETORNO = "Tarefa atualizada";
    protected static final String CONECTA_API_INFO = "Conectando API";
    protected static final String CONECTA_API_RETORNO = "Conectado";
    protected static final String CRIA_TAREFA_INFO = "Criando Tarefa";
    protected static final String CRIA_TAREFA_RETORNO = "Tarefa criada";
    protected static final String ENVIA_NOTIFICACAO_INFO = "Enviando Notificação";
    protected static final String ENVIA_NOTIFICACAO_RETORNO = "Notificação enviada";
    protected static final String ENVIA_RELATORIO_INFO = "Enviando o Relatório";
    protected static final String ENVIA_RELATORIO_RETORNO = "Relatório enviado";
    protected static final String GERA_RELATORIO_INFO = "Gerando Relatório";
    protected static final String GERA_RELATORIO_RETORNO = "Relatório gerada";
    protected static final String REMOVE_TAREFA_INFO = "Removendo Tarefa";
    protected static final String REMOVE_TAREFA_RETORNO = "Tarefa removida";

    private final Logger logger = Logger.getLogger(getClass().getName());

    public String conectaAPI() {
        logger.info(CONECTA_API_INFO);
        return CONECTA_API_RETORNO;
    }

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

    public String enviaNotificacao() {
        logger.info(ENVIA_NOTIFICACAO_INFO);
        return ENVIA_NOTIFICACAO_RETORNO;
    }

    public String geraRelatorio() {
        logger.info(GERA_RELATORIO_INFO);
        return GERA_RELATORIO_RETORNO;
    }

    public String enviaRelatorio() {
        logger.info(ENVIA_RELATORIO_INFO);
        return ENVIA_RELATORIO_RETORNO;
    }

}
