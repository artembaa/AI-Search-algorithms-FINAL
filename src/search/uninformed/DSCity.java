package search.uninformed;

public class DSCity {
    private int lastTriedConnIdx;
    private final String name;

    DSCity(int lastTriedConnIdx, String name) {
        this.lastTriedConnIdx = lastTriedConnIdx;
        this.name = name;
    }

    int getLastTriedConnIdx() {
        return lastTriedConnIdx;
    }

    void setLastTriedConnIdx(int lastTriedConnIdx) {
        this.lastTriedConnIdx = lastTriedConnIdx;
    }

    String getName() {
        return name;
    }
}
