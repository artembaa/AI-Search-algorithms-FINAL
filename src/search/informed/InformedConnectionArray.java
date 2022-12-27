package search.informed;

// проверено
public class InformedConnectionArray {
    final InformedConnection[] informedConnections = new InformedConnection[] {
            new InformedConnection("Вильнюс", " Брест", 531),
            new InformedConnection("Витебск", "Брест", 638),
            new InformedConnection("Витебск", "Вильнюс", 360),
            new InformedConnection("Воронеж", "Витебск", 869),
            new InformedConnection("Воронеж", "Волгоград", 581),
            new InformedConnection("Волгоград", "Витебск", 1455),
            new InformedConnection("Витебск", "Ниж.Новгород", 911),
            new InformedConnection("Вильнюс", "Даугавпилс", 211),
            new InformedConnection("Калининград", "Брест", 699),
            new InformedConnection("Калиниград", "Вильнюс", 333),
            new InformedConnection("Каунас", "Вильнюс", 102),
            new InformedConnection("Киев", "Вильнюс", 734),
            new InformedConnection("Киев", "Житомир", 131),
            new InformedConnection("Житомир", "Донецк", 863),
            new InformedConnection("Житомир", "Волгоград", 1493),
            new InformedConnection("Кишинев", "Киев", 467),
            new InformedConnection("Кишинев", "Донецк", 812),
            new InformedConnection("С.Петербург", "Витебск", 602),
            new InformedConnection("С.Петербург", "Калининград", 739),
            new InformedConnection("С.Петербург", "Рига", 641),
            new InformedConnection("Москва", "Казань", 815),
            new InformedConnection("Москва", "Ниж.Новгород", 411),
            new InformedConnection("Москва", "Минск", 690),
            new InformedConnection("Москва", "Донецк", 1084),
            new InformedConnection("Москва", "С.Петербург", 664),
            new InformedConnection("Мурманск", "С.Петербург", 1412),
            new InformedConnection("Мурманск", "Минск", 2238),
            new InformedConnection("Орел", "Витебск", 522),
            new InformedConnection("Орел", "Донецк", 709),
            new InformedConnection("Орел", "Москва", 368),
            new InformedConnection("Одесса", "Киев", 487),
            new InformedConnection("Рига", "Каунас", 267),
            new InformedConnection("Таллин", "Рига", 308),
            new InformedConnection("Харьков", "Киев", 471),
            new InformedConnection("Харьков", "Симферополь", 639),
            new InformedConnection("Ярославль", "Воронеж", 739),
            new InformedConnection("Ярославль", "Минск", 940),
            new InformedConnection("Уфа", "Казань", 525),
            new InformedConnection("Уфа", "Самара", 461)

            // TEST
//            new InformedConnection("Хельсинки", "Таллин", 100),
//            new InformedConnection("Хельсинки", "С.Петербург", 295),
//            new InformedConnection("Хельсинки", "Рига", 377),
//            new InformedConnection("Таллин", "С.Петербург", 313),
//            new InformedConnection("Таллин", "Рига", 276),
//            new InformedConnection("Рига", "С.Петербург", 476),
//            new InformedConnection("С.Петербург", "Тверь", 483),
//            new InformedConnection("Рига", "Тверь", 716),
//            new InformedConnection("Рига", "Москва", 839)
    };

    InformedConnection[] getConnections() {
        return informedConnections;
    }
}
