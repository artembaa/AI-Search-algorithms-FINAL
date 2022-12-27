package search.uninformed;

class BSCity {
    private final int prevCityIdx;
    private final String name;

    BSCity(int prevCityIdx, String name) {
        this.prevCityIdx = prevCityIdx;
        this.name = name;
    }

    int getPrevCityIdx() {
        return prevCityIdx;
    }

    String getName() {
        return name;
    }
}
