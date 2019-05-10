package no.soprasteria;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeUnitConverterTest {
    @Test
    public void konverterer_varighet_til_angitt_tidseenhet() {
        Assertions.assertThat(TimeUnitConverter.antall(TimeUnit.DAYS, Duration.ofHours(49))).isEqualTo(2);
        Assertions.assertThat(TimeUnitConverter.antall(TimeUnit.MINUTES, Duration.ofHours(2))).isEqualTo(120);
        Assertions.assertThat(TimeUnitConverter.antall(TimeUnit.SECONDS, Duration.ofHours(48))).isEqualTo(172800);
    }
}