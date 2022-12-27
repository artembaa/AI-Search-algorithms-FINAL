package search.uninformed;

import java.util.ArrayList;

// Поиск в ширину (breadth-first search, BFS)
public class BFS_1 {
    public static void main(String[] args) {
        UninformedConnectionArray uninformedConnectionArray = new UninformedConnectionArray();
        UninformedConnection[] uninformedConnections = uninformedConnectionArray.getConnectionsArray();

        final String startingPoint = "Рига";
        final String destinationPoint = "Уфа";
        int curCityIdx = 0;

        ArrayList<BSCity> cities = new ArrayList<>();
        cities.add(new BSCity(-1, startingPoint));

        boolean destinationReached = false;
        while (true) {
            String curCity = cities.get(curCityIdx).getName();

            for (UninformedConnection uninformedConnection : uninformedConnections) {
                String city1 = uninformedConnection.getCity1();
                String city2 = uninformedConnection.getCity2();

                if (city1.equals(curCity) || city2.equals(curCity)) {
                    if (city1.equals(curCity))
                        cities.add(new BSCity(curCityIdx, city2));
                    else
                        cities.add(new BSCity(curCityIdx, city1));

                    String lastAddedCity = cities.get(cities.size() - 1).getName();
                    if (lastAddedCity.equals(destinationPoint)) {
                        destinationReached = true;
                        break;
                    }
                }
            }

            if (destinationReached)
                break;
            curCityIdx++;
        }

        StringBuilder result = new StringBuilder();
        int displayIdx = cities.size() - 1;
        BSCity city;

        do {
            city = cities.get(displayIdx);
            result.insert(0, city.getPrevCityIdx() != -1 ? (" -> " + city.getName()) : (city.getName()));
            displayIdx = city.getPrevCityIdx();
        } while (displayIdx != -1);

        System.out.println(result);
    }
}
