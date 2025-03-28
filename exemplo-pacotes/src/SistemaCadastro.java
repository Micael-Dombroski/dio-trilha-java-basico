public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos", "123.456.789-00");

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do marcos ?

        //imprimindo o marcos sem nome e cpf
        System.out.println(marcos.getNome() + "-" + marcos.getCpf() + "-" + marcos.getEndereco());
    }
}
