package search.informed;

public class DistanceToDestinationArray {
    /*
    * Расстояния по прямой от каждого города до пункта назначения.
    * Всего 27 уникальных городов, включая пункт назначения. Значит 26 расстояний.
    */
    final String destination = "Уфа";
    final DistanceToDestination[] distancesArray = new DistanceToDestination[] {
            new DistanceToDestination("Самара", destination, 461),
            new DistanceToDestination("Казань", destination, 525),
            new DistanceToDestination("Москва", destination, 1166),
            new DistanceToDestination("Минск", destination, 1829),
            new DistanceToDestination("Мурманск", destination, 1963),
            new DistanceToDestination("Таллин", destination, 1939),
            new DistanceToDestination("Рига", destination, 1987),
            new DistanceToDestination("С.Петербург", destination, 1632),
            new DistanceToDestination("Калининград", destination, 2255),
            new DistanceToDestination("Каунас", destination, 2037),
            new DistanceToDestination("Вильнюс", destination, 1953),
            new DistanceToDestination("Брест", destination, 2131),
            new DistanceToDestination("Ниж.Новгород", destination, 771),
            new DistanceToDestination("Ярославль", destination, 1038),
            new DistanceToDestination("Даугавпилс", destination, 1850),
            new DistanceToDestination("Витебск", destination, 1637),
            new DistanceToDestination("Волгоград", destination, 1031),
            new DistanceToDestination("Воронеж", destination, 1164),
            new DistanceToDestination("Орел", destination, 1317),
            new DistanceToDestination("Симферополь", destination, 1894),
            new DistanceToDestination("Харьков", destination, 1434),
            new DistanceToDestination("Одесса", destination, 1987),
            new DistanceToDestination("Киев", destination, 1772),
            new DistanceToDestination("Кишенев", destination, 2069),
            new DistanceToDestination("Житомир", destination, 1902),
            new DistanceToDestination("Донецк", destination, 1309)

            // TEST
//            new DistanceToDestination("Таллин", "Москва", 864),
//            new DistanceToDestination("Рига", "Москва", 839),
//            new DistanceToDestination("Хельсинки", "Москва", 897),
//            new DistanceToDestination("С.Петербург", "Москва", 634),
//            new DistanceToDestination("Тверь", "Москва", 161)
    };

    int getDistanceByName(String startCity) {
        for (DistanceToDestination distance : distancesArray)
            if (distance.getStartCity().equals(startCity))
                return distance.getLinearDistanceKm();
        return -1;
    }

    DistanceToDestination[] getDistancesArray() { return distancesArray; }
}
