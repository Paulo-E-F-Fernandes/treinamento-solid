package br.com.paulofernandes.solid.singleresponsibilityprinciple.solution;

import java.util.logging.Logger;

public class ConectarAPI {

    protected static final String CONECTA_API_INFO = "Conectando API";
    protected static final String CONECTA_API_RETORNO = "Conectado";

    private final Logger logger = Logger.getLogger(getClass().getName());

    public String conectaAPI() {
        logger.info(CONECTA_API_INFO);
        return CONECTA_API_RETORNO;
    }

}
