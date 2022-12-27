package search.uninformed;

import java.util.ArrayList;

/*
Двунаправленный поиск (Bidirectional Search)
 */
public class BDS_5 {
    public static void main(String[] args) {
        UninformedConnectionArray uninformedConnectionArray = new UninformedConnectionArray();
        UninformedConnection[] uninformedConnections = uninformedConnectionArray.getConnectionsArray();

        final String startingPoint = "Рига";
        final String destinationPoint = "Уфа";

        ArrayList<BSCity> cities1 = new ArrayList<>();
        cities1.add(new BSCity(-1, startingPoint));

        ArrayList<BSCity> cities2 = new ArrayList<>();
        cities2.add(new BSCity(-1, destinationPoint));

        int idx = 0, idx1 = 0, idx2 = 0;
        boolean destinationReached = false;
        while (!destinationReached) {
            expandCities(idx, cities1, uninformedConnections);
            expandCities(idx, cities2, uninformedConnections);
            idx++;
            if (idx > uninformedConnections.length)
                break;

            for (idx1 = 0; idx1 < cities1.size(); idx1++) {
                for (idx2 = 0; idx2 < cities2.size(); idx2++) {
                    if (cities1.get(idx1).getName().equals(cities2.get(idx2).getName())) {
                        destinationReached = true;
                        break;
                    }
                }
                if (destinationReached)
                    break;
            }
        }

        printResult(destinationReached, cities1, idx1, cities2, idx2);
    }

    private static void expandCities(int idx, ArrayList<BSCity> cities, UninformedConnection[] uninformedConnections) {
        String curCity = cities.get(idx).getName();

        for (UninformedConnection uninformedConnection : uninformedConnections) {
            String city1 = uninformedConnection.getCity1();
            String city2 = uninformedConnection.getCity2();

            if (city1.equals(curCity) || city2.equals(curCity)) {
                if (city1.equals(curCity))
                    cities.add(new BSCity(idx, city2));
                else
                    cities.add(new BSCity(idx, city1));
            }
        }
    }

    private static void printResult(boolean destinationReached, ArrayList<BSCity> cities1, int idx1, ArrayList<BSCity> cities2, int idx2) {
        if (destinationReached) {
            StringBuilder result = new StringBuilder();
            BSCity city;

            do {
                city = cities1.get(idx1);
                result.insert(0, city.getPrevCityIdx() != -1 ? (" -> " + city.getName()) : (city.getName()));
                idx1 = city.getPrevCityIdx();
            } while (idx1 != -1);

            idx2 = cities2.get(idx2).getPrevCityIdx();
            while (idx2 != -1) {
                city = cities2.get(idx2);
                result.append(" -> ").append(city.getName());
                idx2 = city.getPrevCityIdx();
            }

            System.out.println(result);
        }
        else
            System.out.println("Путь не найден.");
    }

}
