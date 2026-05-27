package domain.service;

public class CorrecaoService {

    public int calcularNota(
            String respostas,
            String gabarito) {

        validarMesmoTamanho(
                respostas,
                gabarito);

        int acertos = 0;

        for (int i = 0; i < gabarito.length(); i++) {

            if (respostas.charAt(i)
                    == gabarito.charAt(i)) {

                acertos++;
            }
        }

        return acertos;
    }

    private void validarMesmoTamanho(
            String respostas,
            String gabarito) {

        if (respostas.length()
                != gabarito.length()) {

            throw new IllegalArgumentException(
                    "Quantidade de respostas inválida.");
        }
    }
}