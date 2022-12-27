package search.informed;

import java.util.ArrayList;

/*
* Minimizing the Total Estimate Search
* 1. Откат ВСЕГДА происходит на 1 уровень выше по дереву решения
* 2. При формировании списка смежных вершин на каждом уровне мы не добавляем те вершины, которые
*    уже встречались раньше и у которых функция оценки f(n) была меньше
 */
public class MTES_2 {
    public static void main(String[] args) {
        InformedConnectionArray informedConnectionArray = new InformedConnectionArray();
        InformedConnection[] informedConnections = informedConnectionArray.getConnections();

        DistanceToDestinationArray distanceToDestinationArray = new DistanceToDestinationArray();

        final String startingPoint = "Рига";
        final String destinationPoint = "Уфа";
//        TEST
//        final String startingPoint = "Таллин";
//        final String destinationPoint = "Москва";

        ArrayList<MTESCity> result = new ArrayList<>();
        result.add(new MTESCity(startingPoint, 0));

        while(true) {
            MTESCity lastResultCity = result.get(result.size() - 1);

            if (lastResultCity.neighbourSearchDone()) {
                if (!lastResultCity.hasNext()) {
                    result.remove(result.size() - 1);
                    if (result.isEmpty())
                        break;
                    continue;
                } else {
                    MTESItem item = lastResultCity.getNextNeighbour();
                    result.add(new MTESCity(item.getName(), item.getSumEstimate()));
                    if (result.get(result.size() - 1).getName().equals(destinationPoint))
                        break;
                    lastResultCity = result.get(result.size() - 1);
                }
            }

            for (InformedConnection informedConnection : informedConnections) {
                String city1 = informedConnection.getCity1();
                String city2 = informedConnection.getCity2();
                String city;

                if (city1.equals(lastResultCity.getName()) || city2.equals(lastResultCity.getName())) {
                    if (city1.equals(lastResultCity.getName()))
                        city = city2;
                    else
                        city = city1;

                    int sumEstimate;
                    sumEstimate =   lastResultCity.getSumEstimate() +
                                    informedConnection.getDistanceKm() +
                                    distanceToDestinationArray.getDistanceByName(city);
                    if (result.size() > 1)
                        sumEstimate = sumEstimate - distanceToDestinationArray.getDistanceByName(lastResultCity.getName());

                    MTESItem item = new MTESItem(city, sumEstimate);
                    boolean found = false;
                    for (MTESCity mtesCity : result)
                        if (mtesCity.has(city)) {
                            found = true;
                            break;
                        }
                    if (!found)
                        lastResultCity.addNeighbour(item);
                }
            }
            MTESItem item = lastResultCity.getNextNeighbour();
            result.set(result.size() - 1, lastResultCity);

            if (item != null) {
                result.add(new MTESCity(item.getName(), item.getSumEstimate()));
                if (result.get(result.size() - 1).getName().equals(destinationPoint))
                    break;
            }
            else {
                result.remove(result.size() - 1);
                if (result.isEmpty())
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
