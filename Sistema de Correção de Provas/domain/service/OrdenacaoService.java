package domain.service;

import domain.model.Resultado;

import java.util.Comparator;
import java.util.List;

public class OrdenacaoService {

    public void ordenarPorNome(
            List<Resultado> resultados) {

        resultados.sort(
                Comparator.comparing(
                        Resultado::getAluno));
    }

    public void ordenarPorNota(
            List<Resultado> resultados) {

        resultados.sort(
                Comparator.comparing(
                        Resultado::getNota)
                        .reversed());
    }
}