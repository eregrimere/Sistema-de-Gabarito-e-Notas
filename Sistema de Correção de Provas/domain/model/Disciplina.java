package domain.model;

import java.util.List;

public class Disciplina {

    private final String nome;
    private final Gabarito gabarito;
    private final List<Aluno> alunos;

    public Disciplina(
            String nome,
            Gabarito gabarito,
            List<Aluno> alunos) {

        this.nome = nome;
        this.gabarito = gabarito;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public Gabarito getGabarito() {
        return gabarito;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}