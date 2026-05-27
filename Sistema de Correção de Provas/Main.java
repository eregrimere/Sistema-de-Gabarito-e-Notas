import application.usecase.CriarGabaritoUseCase;
import application.usecase.GerarResultadoUseCase;
import application.usecase.RegistrarRespostasUseCase;

import infrastructure.persistence
        .ArquivoDisciplinaRepository;

import presentation.console.ConsoleMenu;

public class Main {

    public static void main(String[] args) {

        var repository =
                new ArquivoDisciplinaRepository();

        var registrarUseCase =
                new RegistrarRespostasUseCase(
                        repository);

        var gabaritoUseCase =
                new CriarGabaritoUseCase(
                        repository);

        var resultadoUseCase =
                new GerarResultadoUseCase(
                        repository);

        var menu =
                new ConsoleMenu(
                        registrarUseCase,
                        gabaritoUseCase,
                        resultadoUseCase);

        menu.iniciar();
    }
}