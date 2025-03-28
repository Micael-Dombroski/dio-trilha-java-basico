package record;

public record Person(String name, int age) {
    //private static String name;

    public Person{
        System.out.println("=================");
        System.out.println(name);
        System.out.println(age);
        System.out.println("=================");
    }
    public Person(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " | Age: " + age;
    }
}
