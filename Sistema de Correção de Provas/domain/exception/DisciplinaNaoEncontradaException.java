package domain.exception;

public class DisciplinaNaoEncontradaException
        extends RuntimeException {

    public DisciplinaNaoEncontradaException(
            String disciplina) {

        super(
            "Disciplina não encontrada: "
                    + disciplina);
    }
}