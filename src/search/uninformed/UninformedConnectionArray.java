package search.uninformed;

// проверено, 39 связей
class UninformedConnectionArray {
    final UninformedConnection[] uninformedConnectionsArray = new UninformedConnection[] {
            new UninformedConnection("Вильнюс", " Брест"),
            new UninformedConnection("Витебск", "Брест"),
            new UninformedConnection("Витебск", "Вильнюс"),
            new UninformedConnection("Воронеж", "Витебск"),
            new UninformedConnection("Воронеж", "Волгоград"),
            new UninformedConnection("Волгоград", "Витебск"),
            new UninformedConnection("Витебск", "Ниж.Новгород"),
            new UninformedConnection("Вильнюс", "Даугавпилс"),
            new UninformedConnection("Калининград", "Брест"),
            new UninformedConnection("Калиниград", "Вильнюс"),
            new UninformedConnection("Каунас", "Вильнюс"),
            new UninformedConnection("Киев", "Вильнюс"),
            new UninformedConnection("Киев", "Житомир"),
            new UninformedConnection("Житомир", "Донецк"),
            new UninformedConnection("Житомир", "Волгоград"),
            new UninformedConnection("Кишинев", "Киев"),
            new UninformedConnection("Кишинев", "Донецк"),
            new UninformedConnection("С.Петербург", "Витебск"),
            new UninformedConnection("С.Петербург", "Калининград"),
            new UninformedConnection("С.Петербург", "Рига"),
            new UninformedConnection("Москва", "Казань"),
            new UninformedConnection("Москва", "Ниж.Новгород"),
            new UninformedConnection("Москва", "Минск"),
            new UninformedConnection("Москва", "Донецк"),
            new UninformedConnection("Москва", "С.Петербург"),
            new UninformedConnection("Мурманск", "С.Петербург"),
            new UninformedConnection("Мурманск", "Минск"),
            new UninformedConnection("Орел", "Витебск"),
            new UninformedConnection("Орел", "Донецк"),
            new UninformedConnection("Орел", "Москва"),
            new UninformedConnection("Одесса", "Киев"),
            new UninformedConnection("Рига", "Каунас"),
            new UninformedConnection("Таллин", "Рига"),
            new UninformedConnection("Харьков", "Киев"),
            new UninformedConnection("Харьков", "Симферополь"),
            new UninformedConnection("Ярославль", "Воронеж"),
            new UninformedConnection("Ярославль", "Минск"),
            new UninformedConnection("Уфа", "Казань"),
            new UninformedConnection("Уфа", "Самара")
    };

    UninformedConnection[] getConnectionsArray() {
        return uninformedConnectionsArray;
    }
}
