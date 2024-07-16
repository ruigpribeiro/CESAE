package ex_01;

public class Main {
    public static void main(String[] args) {

        Person rui = new Person("Rui", 26, 1.7);
        Person vitor = new Person("Vitor", 24, 1.7);

        System.out.println(rui.getName());
        System.out.println(rui.getAge());
        System.out.println(rui.getHeight());

        System.out.println(vitor.getAge());
        System.out.println(vitor.getAge());
        System.out.println(vitor.getHeight());
    }
}