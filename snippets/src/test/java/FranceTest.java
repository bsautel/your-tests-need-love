import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class FranceTest {
    private France france;

    @Before
    public void setUp() {
        france = new France();
    }

    @Test
    public void shouldReturnTheCapital() {
        assertThat(france.getCapital(), is("Paris"));
    }

    @Test
    public void shouldReturnTheThreeBiggestCities() {
        assertThat(france.getThreeBiggestCities(), contains("Paris", "Marseille", "Lyon"));
        assertThat(france.getThreeBiggestCities(), containsInAnyOrder("Marseille", "Lyon", "Paris"));
    }
}
