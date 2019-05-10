package no.soprasteria;

import java.math.BigDecimal;

public interface DemoInterface {
    default BigDecimal getSquareNumber(BigDecimal number) {
        return calculateSquareNumber(number);
    }

    private BigDecimal calculateSquareNumber(BigDecimal number) {
        // https://en.wikipedia.org/wiki/Square_number
        // TODO: implementer her
        return number;
    }


}