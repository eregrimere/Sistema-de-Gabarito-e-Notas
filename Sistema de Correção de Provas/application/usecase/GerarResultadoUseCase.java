package application.usecase;

import domain.model.Aluno;
import domain.model.Resultado;
import domain.repository.DisciplinaRepository;
import domain.service.CorrecaoService;
import domain.service.MediaService;
import domain.service.OrdenacaoService;

import java.util.ArrayList;
import java.util.List;

public class GerarResultadoUseCase {

    private final DisciplinaRepository repository;

    private final CorrecaoService
            correcaoService;

    private final MediaService
            mediaService;

    private final OrdenacaoService
            ordenacaoService;

    public GerarResultadoUseCase(
            DisciplinaRepository repository) {

        this.repository = repository;

        this.correcaoService =
                new CorrecaoService();

        this.mediaService =
                new MediaService();

        this.ordenacaoService =
                new OrdenacaoService();
    }

    public void executar(String disciplina) {

        List<Aluno> alunos =
                repository.buscarAlunos(
                        disciplina);

        String gabarito =
                repository.buscarGabarito(
                        disciplina);

        List<Resultado> resultados =
                new ArrayList<>();

        for (Aluno aluno : alunos) {

            int nota =
                    correcaoService.calcularNota(
                            aluno.getRespostas(),
                            gabarito);

            resultados.add(
                    new Resultado(
                            aluno.getNome(),
                            nota));
        }

        ordenacaoService
                .ordenarPorNota(resultados);

        double media =
                mediaService
                        .calcularMedia(resultados);

        exibirResultados(
                resultados,
                media);
    }

    private void exibirResultados(
            List<Resultado> resultados,
            double media) {

        System.out.println(
                "\nRESULTADOS\n");

        for (Resultado resultado
                : resultados) {

            System.out.println(
                    resultado.getAluno()
                    + " - "
                    + resultado.getNota());
        }

        System.out.println(
                "\nMédia da turma: "
                + media);
    }
}