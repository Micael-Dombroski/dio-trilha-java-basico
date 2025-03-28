public class ExemploBreakContinue {
    public static void main(String[] args) {
        //Experimentando Break e Continue
        for (int numero = 0; numero <= 6; numero++) {
            if (numero == 3) {
                continue; //ignora a iteração atual
            }
            if (numero == 5) {
                break; //sai do bloco de comando atual
            }
            System.out.println(numero);
        }
    }
}
