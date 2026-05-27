package domain.service;

import domain.model.Resultado;

import java.util.List;

public class MediaService {

    public double calcularMedia(
            List<Resultado> resultados) {

        return resultados.stream()
                .mapToInt(Resultado::getNota)
                .average()
                .orElse(0);
    }
}