package domain.model;

public class Gabarito {

    private final String respostas;

    public Gabarito(String respostas) {

        validar(respostas);

        this.respostas = respostas;
    }

    private void validar(String respostas) {

        if (!respostas.matches("[VF]{10}")) {
            throw new IllegalArgumentException(
                    "Gabarito inválido.");
        }
    }

    public String getRespostas() {
        return respostas;
    }
}