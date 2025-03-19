public class Operadores {
    public static void main(String[] args) {
        
        /*
        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1"; // 31
        concatenacao = 1+"1"+1+"1"; // 1111
        concatenacao = "1"+1+1+1; // 1111
        concatenacao = "1"+(1+1+1); // 13
        */

        /*
        int numero = 5;
        System.out.println(- numero); // vira negativo
        System.out.println(-- numero); // reduz 1
        System.out.println(++ numero); // aumenta 1
        System.out.println(numero==5); //verdadeiro
        System.out.println(!(numero==5)); // falso

        numero = - numero; // vira negativo
        System.out.println(numero);
        numero = + numero; // permanece negativo
        System.out.println(numero);
        numero = numero * (-1); // vira positivo
        System.out.println(numero);
        System.out.println(numero ++); // imprime depois incremente
        System.out.println(++ numero); // incrementa depois imprime
        */

        /*
        int a,b;
        
        a = 5;
        b = 6;
        String resultado = a==b ? "true" : "false";
        System.out.println(resultado);
        resultado = a!=b ? "true" : "false";
        System.out.println(resultado);
        */

        /*
        int numero1 = 1;
        int numero2= 2;
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);
        */

        /*
        String nomeUm = "Dust";
        String nomeDois = "Dust";
        System.out.println(nomeUm==nomeDois); // true
        nomeDois = new String("Dust");
        System.out.println(nomeUm==nomeDois); // false
        System.out.println(nomeUm.equals(nomeDois)); // true
            
            //nomeDois virou um objeto, por isso precisa de .equals para ser
            //comparado com nomeUm
            
        */

        boolean condicao1= true;
        boolean condicao2 = false;
        System.out.println(condicao1==true&&condicao2==true); // false
        System.out.println(condicao1==true&&condicao2==false); // true
        System.out.println(condicao1==false&&condicao2==false); // false
        System.out.println(condicao1==true||condicao2==true); // true
        System.out.println(condicao1==true||condicao2==false); // true
        System.out.println(condicao1==false||condicao2==false); //true
        System.out.println(condicao1==false||condicao2==true); // false
        

    }
}

