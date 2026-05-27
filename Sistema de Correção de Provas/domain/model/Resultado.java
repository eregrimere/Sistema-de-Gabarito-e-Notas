package domain.model;

public class Resultado {

    private final String aluno;
    private final int nota;

    public Resultado(
            String aluno,
            int nota) {

        this.aluno = aluno;
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public int getNota() {
        return nota;
    }
}