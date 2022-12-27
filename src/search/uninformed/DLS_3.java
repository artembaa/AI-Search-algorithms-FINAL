package search.uninformed;

import java.util.ArrayList;

/*
Поиск с ограничением глубины (depth-limited search, DLS)
Отличается от DFS только одной проверкой на DEPTH_LIMIT
 */
public class DLS_3 {
    public static void main(String[] args) {
        UninformedConnectionArray uninformedConnectionArray = new UninformedConnectionArray();
        UninformedConnection[] uninformedConnections = uninformedConnectionArray.getConnectionsArray();

        final String startingPoint = "Рига";
        final String destinationPoint = "Уфа";
        final int DEPTH_LIMIT = 4;

        ArrayList<DSCity> result = new ArrayList<>();
        result.add(new DSCity(-1, startingPoint));

        while(true) {
            DSCity lastResultCity = result.get(result.size() - 1);

            boolean added = false;
            if (result.size() <= DEPTH_LIMIT) {
                for (int connIdx = lastResultCity.getLastTriedConnIdx() + 1; connIdx < uninformedConnections.length; connIdx++) {
                    String city1 = uninformedConnections[connIdx].getCity1();
                    String city2 = uninformedConnections[connIdx].getCity2();
                    String city;

                    if (city1.equals(lastResultCity.getName()) || city2.equals(lastResultCity.getName())) {
                        if (city1.equals(lastResultCity.getName()))
                            city = city2;
                        else
                            city = city1;

                        int i;
                        for (i = result.size() - 1; i >= 0; i--)
                            if (city.equals(result.get(i).getName()))
                                break;
                        if (i >= 0)
                            continue;

                        lastResultCity.setLastTriedConnIdx(connIdx);
                        result.set(result.size() - 1, lastResultCity);

                        result.add(new DSCity(-1, city));
                        added = true;
                        break;
                    }
                }
            }

            if (!added) {
                result.remove(result.size() - 1);
                if (result.isEmpty())
                    break;
            }
            else
            if (result.get(result.size() - 1).getName().equals(destinationPoint)) {
                break;
            }
        }

        if (!result.isEmpty())
            for (int i = 0; i < result.size(); i++) {
                if (i != result.size() - 1)
                    System.out.print(result.get(i).getName() + " -> ");
                else
                    System.out.print(result.get(i).getName());
            }
        else
            System.out.println("Путь не найден.");
    }
}
