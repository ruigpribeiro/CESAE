package ex_01;

public class Person {
    private String name;
    private int age;
    private double height;


    /**
     * Método construtor para Person
     * @param name Nome
     * @param age Idade
     * @param height Altura
     */
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
