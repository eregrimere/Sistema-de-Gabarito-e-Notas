package domain.exception;

public class GabaritoInvalidoException
        extends RuntimeException {

    public GabaritoInvalidoException(
            String mensagem) {

        super(mensagem);
    }
}