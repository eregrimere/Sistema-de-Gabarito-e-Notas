package domain.model;

public class Aluno {

    private final String nome;
    private final String respostas;

    public Aluno(String nome, String respostas) {
        this.nome = nome;
        this.respostas = respostas;
    }

    public String getNome() {
        return nome;
    }

    public String getRespostas() {
        return respostas;
    }
}