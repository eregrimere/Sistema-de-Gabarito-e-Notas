package presentation.console;

import application.usecase.CriarGabaritoUseCase;
import application.usecase.GerarResultadoUseCase;
import application.usecase.RegistrarRespostasUseCase;

import java.util.Scanner;

public class ConsoleMenu {

    private final Scanner scanner;

    private final RegistrarRespostasUseCase
            registrarRespostasUseCase;

    private final CriarGabaritoUseCase
            criarGabaritoUseCase;

    private final GerarResultadoUseCase
            gerarResultadoUseCase;

    public ConsoleMenu(
            RegistrarRespostasUseCase
                    registrarRespostasUseCase,

            CriarGabaritoUseCase
                    criarGabaritoUseCase,

            GerarResultadoUseCase
                    gerarResultadoUseCase) {

        this.scanner = new Scanner(System.in);

        this.registrarRespostasUseCase =
                registrarRespostasUseCase;

        this.criarGabaritoUseCase =
                criarGabaritoUseCase;

        this.gerarResultadoUseCase =
                gerarResultadoUseCase;
    }

    public void iniciar() {

        while (true) {

            exibirMenu();

            int opcao =
                    Integer.parseInt(
                            scanner.nextLine());

            switch (opcao) {

                case 1 -> registrarRespostas();

                case 2 -> criarGabarito();

                case 3 -> gerarResultado();

                case 4 -> {
                    System.out.println("Saindo...");
                    return;
                }

                default ->
                        System.out.println(
                                "Opção inválida.");
            }
        }
    }

    private void exibirMenu() {

        System.out.println("""
                
                1 - Registrar respostas
                2 - Criar gabarito
                3 - Gerar resultados
                4 - Sair
                
                """);

        System.out.print("Escolha: ");
    }

    private void registrarRespostas() {

        System.out.print(
                "Disciplina: ");

        String disciplina =
                scanner.nextLine();

        registrarRespostasUseCase
                .executar(disciplina);

        System.out.println(
                "Respostas registradas.");
    }

    private void criarGabarito() {

        System.out.print(
                "Disciplina: ");

        String disciplina =
                scanner.nextLine();

        System.out.print(
                "Gabarito: ");

        String gabarito =
                scanner.nextLine();

        criarGabaritoUseCase
                .executar(
                        disciplina,
                        gabarito);

        System.out.println(
                "Gabarito salvo.");
    }

    private void gerarResultado() {

        System.out.print(
                "Disciplina: ");

        String disciplina =
                scanner.nextLine();

        gerarResultadoUseCase
                .executar(disciplina);

        System.out.println(
                "Resultados gerados.");
    }
}