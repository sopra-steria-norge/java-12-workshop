package no.soprasteria;

import no.soprasteria.SwitchExprExample.Bokstav;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchExprExampleTest {

    @Test
    public void gir_tall_som_forventet() {
        SwitchExprExample exprExample = new SwitchExprExample();
        assertThat(exprExample.finnTall(Bokstav.A)).isEqualTo(2);
        assertThat(exprExample.finnTall(Bokstav.B)).isEqualTo(2);
        assertThat(exprExample.finnTall(Bokstav.C)).isEqualTo(2);
        assertThat(exprExample.finnTall(Bokstav.D)).isEqualTo(7);
        assertThat(exprExample.finnTall(Bokstav.E)).isEqualTo(8);
    }
}