package no.soprasteria;

import java.math.BigDecimal;

public interface DemoInterface {


    default BigDecimal getTriangelNumber(BigDecimal number) {
        return calculateTriangelNumber(number);
    }

    private BigDecimal calculateTriangelNumber(BigDecimal number) {
        // https://en.wikipedia.org/wiki/Triangular_number
        // TODO: Implementer her
        return number;
    }

    default BigDecimal getSquareNumber(BigDecimal number) {
        return calculateSquareNumber(number);
    }

    private BigDecimal calculateSquareNumber(BigDecimal number) {
        // https://en.wikipedia.org/wiki/Square_number
        // TODO: implementer her
        return number;
    }


}