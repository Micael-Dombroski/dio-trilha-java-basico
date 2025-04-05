package keywords;

import keywords.keyword.Client;

public class Main {
    public static void main(String[] args) {
        var client = new Client();
        //client.setName("Jão");
        //System.out.println(client.getName());
        client.setName("name");
        client.setStaticName("staticName");
        System.out.println(client.getName());
        System.out.println(client.getStaticName());
        System.out.println("=======================");

        var client2 = new Client();
        System.out.println(client2.getName());
        System.out.println(client2.getStaticName());
        
    }
}
