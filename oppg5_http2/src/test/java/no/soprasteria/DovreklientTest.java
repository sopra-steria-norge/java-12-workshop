package no.soprasteria;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DovreklientTest {

    @Test
    public void harDovreFalt() {
        Assertions.assertThat(new Dovreklient().harDovreFalt()).isFalse();
    }
}