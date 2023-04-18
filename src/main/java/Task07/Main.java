package Task07;

/*Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования.*/
public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View());
        presenter.menu();
    }
}
