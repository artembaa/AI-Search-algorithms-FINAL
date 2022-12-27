package search.informed;

import java.util.ArrayList;

// greedy first best-match search
public class GreedyFBMS_1 {
    public static void main(String[] args) {
        InformedConnectionArray informedConnectionArray = new InformedConnectionArray();
        InformedConnection[] informedConnections = informedConnectionArray.getConnections();

        DistanceToDestinationArray distanceToDestinationArray = new DistanceToDestinationArray();

        final String startingPoint = "Рига";
        final String destinationPoint = "Уфа";

        ArrayList<GreedyFBMSCity> result = new ArrayList<>();
        result.add(new GreedyFBMSCity(startingPoint));

        while(true) {
            GreedyFBMSCity lastResultCity = result.get(result.size() - 1);

            boolean added = false;
            int minDist = Integer.MAX_VALUE;
            String nearestCity = null;
            for (InformedConnection informedConnection : informedConnections) {
                String city1 = informedConnection.getCity1();
                String city2 = informedConnection.getCity2();
                String city;

                if (city1.equals(lastResultCity.getName()) || city2.equals(lastResultCity.getName())) {
                    if (city1.equals(lastResultCity.getName()))
                        city = city2;
                    else
                        city = city1;

                    if (minDist >= distanceToDestinationArray.getDistanceByName(city) && !lastResultCity.tried(city)) {
                        minDist = distanceToDestinationArray.getDistanceByName(city);
                        nearestCity = city;
                    }
                }
            }

            if (nearestCity != null) {
                int i;
                for (i = result.size() - 1; i >= 0; i--)
                    if (nearestCity.equals(result.get(i).getName()))
                        break;
                if (i >= 0)
                    continue;

                lastResultCity.addTriedCity(nearestCity);
                result.set(result.size() - 1, lastResultCity);

                result.add(new GreedyFBMSCity(nearestCity));
                added = true;
            }

            if (!added) {
                result.remove(result.size() - 1);
                if (result.isEmpty())
                    break;
            }
            else {
                if (result.get(result.size() - 1).getName().equals(destinationPoint))
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
