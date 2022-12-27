package search.informed;

import java.util.Comparator;

class MTESItemComparator implements Comparator<MTESItem> {
    @Override
    public int compare(MTESItem item1, MTESItem item2) {
        if (item1.getSumEstimate() > item2.getSumEstimate())
            return 1;
        else if (item1.getSumEstimate() == item2.getSumEstimate())
            return 0;
        else
            return -1;
    }
}