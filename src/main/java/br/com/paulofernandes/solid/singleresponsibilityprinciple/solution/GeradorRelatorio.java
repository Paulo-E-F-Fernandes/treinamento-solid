package br.com.paulofernandes.solid.singleresponsibilityprinciple.solution;

import java.util.logging.Logger;

public class GeradorRelatorio {

    protected static final String ENVIA_RELATORIO_INFO = "Enviando o Relatório";
    protected static final String ENVIA_RELATORIO_RETORNO = "Relatório enviado";
    protected static final String GERA_RELATORIO_INFO = "Gerando Relatório";
    protected static final String GERA_RELATORIO_RETORNO = "Relatório gerada";

    private final Logger logger = Logger.getLogger(getClass().getName());

    public String geraRelatorio() {
        logger.info(GERA_RELATORIO_INFO);
        return GERA_RELATORIO_RETORNO;
    }

    public String enviaRelatorio() {
        logger.info(ENVIA_RELATORIO_INFO);
        return ENVIA_RELATORIO_RETORNO;
    }

}
