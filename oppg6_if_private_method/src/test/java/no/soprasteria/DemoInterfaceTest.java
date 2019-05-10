package no.soprasteria;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoInterfaceTest implements DemoInterface {
    @Test
    public void skal_ikke_utvide_interfacet() {
        assertThat(DemoInterface.class.getMethods()).hasSize(2);
    }

    @Test
    public void triangelNumber() {
        DemoInterfaceTest demoInterface = new DemoInterfaceTest();
        assertThat(demoInterface.getTriangelNumber(BigDecimal.ZERO)).isEqualTo(BigDecimal.ZERO);
        assertThat(demoInterface.getTriangelNumber(BigDecimal.ONE)).isEqualTo(BigDecimal.ONE);
        assertThat(demoInterface.getTriangelNumber(BigDecimal.valueOf(2))).isEqualTo(BigDecimal.valueOf(3));
        assertThat(demoInterface.getTriangelNumber(BigDecimal.valueOf(3))).isEqualTo(BigDecimal.valueOf(6));
        assertThat(demoInterface.getTriangelNumber(BigDecimal.valueOf(5))).isEqualTo(BigDecimal.valueOf(15));
        assertThat(demoInterface.getTriangelNumber(BigDecimal.valueOf(7))).isEqualTo(BigDecimal.valueOf(28));
        assertThat(demoInterface.getTriangelNumber(BigDecimal.TEN)).isEqualTo(BigDecimal.valueOf(55));
        assertThat(demoInterface.getTriangelNumber(BigDecimal.valueOf(25))).isEqualTo(BigDecimal.valueOf(325));
        assertThat(demoInterface.getTriangelNumber(BigDecimal.valueOf(23))).isEqualTo(BigDecimal.valueOf(276));
    }

    @Test
    public void squareNumbers() {
        DemoInterfaceTest demoInterface = new DemoInterfaceTest();
        assertThat(demoInterface.getSquareNumber(BigDecimal.ZERO)).isEqualTo(BigDecimal.ZERO);
        assertThat(demoInterface.getSquareNumber(BigDecimal.ONE)).isEqualTo(BigDecimal.ONE);
        assertThat(demoInterface.getSquareNumber(BigDecimal.valueOf(2))).isEqualTo(BigDecimal.valueOf(4));
        assertThat(demoInterface.getSquareNumber(BigDecimal.valueOf(3))).isEqualTo(BigDecimal.valueOf(9));
        assertThat(demoInterface.getSquareNumber(BigDecimal.valueOf(5))).isEqualTo(BigDecimal.valueOf(25));
        assertThat(demoInterface.getSquareNumber(BigDecimal.valueOf(7))).isEqualTo(BigDecimal.valueOf(49));
        assertThat(demoInterface.getSquareNumber(BigDecimal.TEN)).isEqualTo(BigDecimal.valueOf(100));
        assertThat(demoInterface.getSquareNumber(BigDecimal.valueOf(25))).isEqualTo(BigDecimal.valueOf(625));
        assertThat(demoInterface.getSquareNumber(BigDecimal.valueOf(23))).isEqualTo(BigDecimal.valueOf(529));
    }
}