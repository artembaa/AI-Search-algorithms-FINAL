package search.informed;

public class InformedConnection {
    private final String city1;
    private final String city2;
    private final int distanceKm;

    InformedConnection(String city1, String city2, int distanceKm) {
        this.city1 = city1;
        this.city2 = city2;
        this.distanceKm = distanceKm;
    }

    String getCity1() { return city1; }

    String getCity2() { return city2; }

    int getDistanceKm() { return distanceKm; }
}
