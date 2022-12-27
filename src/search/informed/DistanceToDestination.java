package search.informed;

public class DistanceToDestination {
    private final String startCity;
    private final String destCity;
    private final int linearDistanceKm;

    DistanceToDestination(String startCity, String destCity, int linearDistanceKm) {
        this.startCity = startCity;
        this.destCity = destCity;
        this.linearDistanceKm = linearDistanceKm;
    }

    String getStartCity() {
        return startCity;
    }

    String getDestCity() {
        return destCity;
    }

    int getLinearDistanceKm() {
        return linearDistanceKm;
    }
}
