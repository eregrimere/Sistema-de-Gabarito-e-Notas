package application.usecase;

import domain.model.Aluno;
import domain.repository.DisciplinaRepository;
import domain.validator.RespostaValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrarRespostasUseCase {

    private final DisciplinaRepository repository;

    public RegistrarRespostasUseCase(
            DisciplinaRepository repository) {

        this.repository = repository;
    }

    public void executar(String disciplina) {

        Scanner scanner =
                new Scanner(System.in);

        List<Aluno> alunos =
                new ArrayList<>();

        while (true) {

            System.out.print(
                    "Nome do aluno (fim para sair): ");

            String nome =
                    scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print(
                    "Respostas: ");

            String respostas =
                    scanner.nextLine();

            RespostaValidator
                    .validar(respostas);

            alunos.add(
                    new Aluno(
                            nome,
                            respostas));
        }

        repository.salvarAlunos(
                disciplina,
                alunos);
    }
}