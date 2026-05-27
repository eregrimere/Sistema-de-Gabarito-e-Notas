package application.usecase;

import domain.repository.DisciplinaRepository;
import domain.validator.GabaritoValidator;

public class CriarGabaritoUseCase {

    private final DisciplinaRepository repository;

    public CriarGabaritoUseCase(
            DisciplinaRepository repository) {

        this.repository = repository;
    }

    public void executar(
            String disciplina,
            String gabarito) {

        GabaritoValidator
                .validar(gabarito);

        repository.salvarGabarito(
                disciplina,
                gabarito);
    }
}