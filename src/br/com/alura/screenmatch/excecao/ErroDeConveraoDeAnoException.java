package br.com.alura.screenmatch.excecao;

public class ErroDeConveraoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConveraoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
