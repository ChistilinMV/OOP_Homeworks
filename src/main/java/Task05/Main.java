package Task05;

// Проделать код ревью своих работ. Продумать, какие компоненты можно и нужно переписать.
//
// Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом.
// Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей
// и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат,
// свекровь, сестра и т. д. компонент для проведения исследований дополнительные компоненты, например
// отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных
// моделей человека Под “проведением исследования” можно понимать получение всех детей выбранного человека.
// Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек.
// Какие члены должны быть у каждого из классов (у меня на семинаре студенты пришли к тому, чтобы продумать
// логику взаимодействия жена разрешает открыть дверцу шкафа мужу, после чего эту дверцу можно открыть)
//
public class Main {
    public static void main(String[] args) {
        Tree ft = new Tree();
        Heritage heritage = new Heritage(ft);

        ft.newTreePerson(heritage,"Adam", 'M', null, null);
        ft.newTreePerson(heritage,"Eve", 'F', null, null);
        ft.newTreePerson(heritage,"Cain", 'M', "Eve", "Adam");
        ft.newTreePerson(heritage,"Abel", 'M', "Eve", "Adam");
        ft.newTreePerson(heritage,"Avan", 'F', "Eve", "Adam");
        ft.newTreePerson(heritage,"Seth", 'M', "Eve", "Adam");
        ft.newTreePerson(heritage,"Azura", 'F', "Eve", "Adam");
        ft.newTreePerson(heritage,"Enos", 'M', "Azura", "Seth");
        ft.newTreePerson(heritage,"Enoch", 'M', "Avan", "Cain");

        heritage.printParents("Adam");
        heritage.printChild("Adam");
        heritage.printParents("Seth");
        heritage.printParents("Enos");
        heritage.printParents("Enoch");

        Implementer writer = new Implementer();
        writer.savefile(ft.getTree().toString());
    }
}
