package domain.validator;

import domain.exception.GabaritoInvalidoException;

public class GabaritoValidator {

    private static final String REGEX =
            "[VF]{10}";

    private GabaritoValidator() {
    }

    public static void validar(
            String gabarito) {

        validarNulo(gabarito);

        validarFormato(gabarito);
    }

    private static void validarNulo(
            String gabarito) {

        if (gabarito == null) {

            throw new GabaritoInvalidoException(
                    "Gabarito não pode ser nulo.");
        }
    }

    private static void validarFormato(
            String gabarito) {

        if (!gabarito.matches(REGEX)) {

            throw new GabaritoInvalidoException(
                    """
                    Gabarito inválido.
                    Use exatamente 10 caracteres V/F.
                    """);
        }
    }
}