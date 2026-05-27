package domain.repository;

import domain.model.Aluno;

import java.util.List;

public interface DisciplinaRepository {

    void salvarAlunos(
            String disciplina,
            List<Aluno> alunos);

    List<Aluno> buscarAlunos(
            String disciplina);

    void salvarGabarito(
            String disciplina,
            String gabarito);

    String buscarGabarito(
            String disciplina);
}