package infrastructure.persistence;

import domain.model.Aluno;
import domain.repository.DisciplinaRepository;
import infrastructure.config.FileConstants;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ArquivoDisciplinaRepository
        implements DisciplinaRepository {

@Override
public void salvarAlunos(
        String disciplina,
        List<Aluno> alunos) {

    String arquivo =
            FileConstants.DATA
            + disciplina
            + ".txt";

    try (BufferedWriter writer =
                 new BufferedWriter(
                         new FileWriter(arquivo))) {

        for (Aluno aluno : alunos) {

            writer.write(
                    aluno.getNome()
                    + ";"
                    + aluno.getRespostas());

            writer.newLine();
        }

    } catch (IOException e) {

        throw new RuntimeException(
                "Erro ao salvar alunos.");
    }
}

    @Override
    public List<Aluno> buscarAlunos(
            String disciplina) {

        criarDiretorio();

        String arquivo =
                FileConstants.DATA
                + disciplina
                + ".txt";

        List<Aluno> alunos =
                new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(arquivo))) {

            String linha;

            while ((linha = reader.readLine())
                    != null) {

                String[] dados =
                        linha.split(";");

                alunos.add(
                        new Aluno(
                                dados[0],
                                dados[1]));
            }

        } catch (IOException e) {

            throw new RuntimeException(
                    "Erro ao buscar alunos.");
        }

        return alunos;
    }

    @Override
    public void salvarGabarito(
            String disciplina,
            String gabarito) {

        criarDiretorio();

        String arquivo =
                FileConstants.DATA
                + disciplina
                + "_gabarito.txt";

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(arquivo))) {

            writer.write(gabarito);

        } catch (IOException e) {

            throw new RuntimeException(
                    "Erro ao salvar gabarito.");
        }
    }

    @Override
    public String buscarGabarito(
            String disciplina) {

        criarDiretorio();

        String arquivo =
                FileConstants.DATA
                + disciplina
                + "_gabarito.txt";

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(arquivo))) {

            return reader.readLine();

        } catch (IOException e) {

            throw new RuntimeException(
                    "Erro ao buscar gabarito.");
        }
    }

    private void criarDiretorio() {

        try {

            Files.createDirectories(
                    Path.of(FileConstants.DATA));

        } catch (IOException e) {

            throw new RuntimeException(
                    "Erro ao criar diretório.");
        }
    }
}