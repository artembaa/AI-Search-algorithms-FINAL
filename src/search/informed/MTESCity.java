package search.informed;

import java.util.TreeSet;

public class MTESCity {
    private final String name;
    private final int sumEstimate;
    private final TreeSet<MTESItem> neighbours;
    private int index;

    MTESCity(String name, int sumEstimate) {
        this.name = name;
        this.sumEstimate = sumEstimate;
        neighbours = new TreeSet<>(new MTESItemComparator());
        this.index = -1;
    }

    String getName() {
        return name;
    }

    int getSumEstimate() {
        return sumEstimate;
    }

    void addNeighbour(MTESItem item) {
        neighbours.add(item);
    }

    MTESItem getNextNeighbour() {
         index++;
         if(index >= neighbours.size())
            return null;

         MTESItem[] arr = new MTESItem[neighbours.size()];
         arr = neighbours.toArray(arr);
         return arr[index];
    }

    boolean has(String name) {
        for (MTESItem item : neighbours)
            if (item.getName().equals(name))
                return true;
        return name.equals(this.name);// check starting point city
    }

    boolean hasNext() {
        if(index >= neighbours.size() - 1)
            return false;
        return true;
    }

    boolean neighbourSearchDone() {
        if (index < 0)
            return false;
        return true;
    }
}
