package domain.exception;

public class RespostaInvalidaException
        extends RuntimeException {

    public RespostaInvalidaException(
            String mensagem) {

        super(mensagem);
    }
}