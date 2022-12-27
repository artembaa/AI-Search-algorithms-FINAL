package search.informed;

public class MTESItem {
    private final String name;
    private final int sumEstimate;

    MTESItem(String name, int sumEstimate) {
        this.name = name;
        this.sumEstimate = sumEstimate;
    }

    String getName() {
        return name;
    }

    int getSumEstimate() {
        return sumEstimate;
    }
}
