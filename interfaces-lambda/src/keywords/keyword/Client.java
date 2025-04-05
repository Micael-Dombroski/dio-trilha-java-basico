package keywords.keyword;

//como não é public, private ou protected ela é default
//classes default não podem ser acessadas de fora de seus pacotes, 
//somente se estiverem no mesmo nível de package
public class Client {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String staticName;

    protected int age;

    protected Address address = new Address();

    public String getStaticName() {
        //System.out.println(address.description);
        return staticName;
    }

    public void setStaticName(String param) {
        staticName = param;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public class Nested {
        public void test() {
            name = "";
        }
    }

}
