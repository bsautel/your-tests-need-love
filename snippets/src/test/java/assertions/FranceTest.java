package assertions;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FranceTest {
    private France france;

    @Before
    public void setUp() {
        france = new France();
    }

    @Test
    public void shouldReturnTheCapital() {
        assertThat(france.getCapital()).isEqualTo("Paris");
    }

    @Test
    public void shouldReturnThePopulation() {
        assertThat(france.getPopulation()).isGreaterThan(65_000_000).isLessThan(70_000_000);
    }

    @Test
    public void shouldReturnTheThreeBiggestCities() {
        List<String> biggestCities = france.getThreeBiggestCities();
        assertThat(biggestCities).contains("Paris", "Marseille");
        assertThat(biggestCities).containsExactly("Paris", "Marseille", "Lyon");
        assertThat(biggestCities).containsOnly("Marseille", "Lyon", "Paris");
    }
}
