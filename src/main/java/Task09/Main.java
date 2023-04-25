package Task09;

/*Рефакторинг и\или оптимизация проекта предыдущего дз с учетом теоретических основ SOLID’а 4,5 - принцип.*/
public class Main {
    public static void main(String[] args) {
        new ComplexNumberFactory();
        new RationalNumberFactory();
        Presenter presenter = new Presenter(new View());
        presenter.menu();
    }
}
