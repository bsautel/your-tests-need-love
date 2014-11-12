package assertions;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class France {
    public List<String> getThreeBiggestCities() {
        return newArrayList("Paris", "Marseille", "Lyon");
    }

    public String getCapital() {
        return "Paris";
    }

    public int getPopulation() {
        return 66_616_416;
    }
}
