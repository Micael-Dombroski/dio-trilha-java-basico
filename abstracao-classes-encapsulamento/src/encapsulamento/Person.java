package encapsulamento;
import java.time.OffsetDateTime;

public class Person {
    private String name;
    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public int getAge() {
        return age;
    }
    /*
    public void setAge(int age) {
        this.age = age;
    }
    */
    public String getName() {
        return name;
    }
    //Removendo a possibilidade de edição do nome
    /*
        public void setName(String name) {
            this.name = name;
        }
    */
    //Agora o nome é definido na criação do objeto por meio de um construtor e não poderá ser alterado
    public Person(String name) {
        this.name = name;
        //agora a idade não pode ser alterada pelo usuário
        this.age = 1;
    }

    public void incAge() {
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}