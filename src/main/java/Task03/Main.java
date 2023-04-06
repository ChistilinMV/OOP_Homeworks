package Task03;
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
        Person adam = new Person("Adam", 'M');
        ft.append(adam);
        Person eve = new Person("Eve", 'F');
        ft.append(eve);
        adam.coition(eve);
        Person cain = new Person("Cain", 'M', eve, adam);
        ft.append(cain);
        adam.coition(eve);
        Person abel = new Person("Abel", 'M', eve, adam);
        ft.append(abel);
        adam.coition(eve);
        Person seth = new Person("Seth", 'M', eve, adam);
        ft.append(seth);

        System.out.println(new Heritage(ft).childs(adam));
        System.out.println(new Heritage(ft).parents(seth));
        System.out.println(new Heritage(ft).parents(adam));

        Implementer writer = new Implementer();
        writer.savefile(ft.getTree().toString());
    }
}
