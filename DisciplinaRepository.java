public interface DisciplinaRepository {

    void salvarRespostas(String disciplina, List<Aluno> alunos);

    List<Aluno> buscarRespostas(String disciplina);

    void salvarGabarito(String disciplina, String gabarito);

    String buscarGabarito(String disciplina);
}
