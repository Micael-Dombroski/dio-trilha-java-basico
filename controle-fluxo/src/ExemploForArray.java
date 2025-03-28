public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        
        /*
        //Estrutura de repetição for com arrays
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }
        */

        //Abreviando usando For Each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
