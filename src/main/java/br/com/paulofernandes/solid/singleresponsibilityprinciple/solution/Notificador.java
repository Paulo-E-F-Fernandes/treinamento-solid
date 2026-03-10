package br.com.paulofernandes.solid.singleresponsibilityprinciple.solution;

import java.util.logging.Logger;

public class Notificador {

    protected static final String ENVIA_NOTIFICACAO_INFO = "Enviando Notificação";
    protected static final String ENVIA_NOTIFICACAO_RETORNO = "Notificação enviada";

    private final Logger logger = Logger.getLogger(getClass().getName());

    public String enviaNotificacao() {
        logger.info(ENVIA_NOTIFICACAO_INFO);
        return ENVIA_NOTIFICACAO_RETORNO;
    }

}
