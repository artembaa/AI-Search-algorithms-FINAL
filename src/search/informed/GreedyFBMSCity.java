package search.informed;

import java.util.HashSet;

public class GreedyFBMSCity {
    private final String name;
    private HashSet<String> triedCities;

    GreedyFBMSCity(String name) {
        this.name = name;
        triedCities = new HashSet<>();
    }

    String getName() {
        return name;
    }

    boolean addTriedCity(String triedCity) {
        return triedCities.add(triedCity);
    }

    boolean tried(String city) {
        return triedCities.contains(city);
    }
}
