package keywords;

import keywords.keyword.Client;

public class Manager extends Client {
    public Manager() {
        //consegue acessar atributos e métodos do Client mesmo não estando no 
        //mesmo package pois eles são protected e Manager herda de Client
        //Se eles fossem default isso não seria possível
        this.setName("Jão");
    }
}
