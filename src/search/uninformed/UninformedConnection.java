package search.uninformed;

class UninformedConnection {
    private final String city1;
    private final String city2;

    UninformedConnection(String city1, String city2) {
        this.city1 = city1;
        this.city2 = city2;
    }

    String getCity1() {
        return city1;
    }

    String getCity2() {
        return city2;
    }
}
