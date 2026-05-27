package domain.validator;

import domain.exception.RespostaInvalidaException;

public class RespostaValidator {

    private static final String REGEX =
            "[VF]{10}";

    private RespostaValidator() {
    }

    public static void validar(
            String respostas) {

        if (respostas == null
                || !respostas.matches(REGEX)) {

            throw new RespostaInvalidaException(
                    "Resposta inválida. Use apenas V/F.");
        }
    }
}