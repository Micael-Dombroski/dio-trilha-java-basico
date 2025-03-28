package exercicio2.ingressos;

public class IngressoFamilia extends Ingresso {
    //disconto de 5% a partir de 3 pessoas
    public double getValor(int nPessoas) {
        if (aplicarDisconto(nPessoas)) {
            setValor(getValor()*0.95);
        }
        return getValor();
    }
    public boolean aplicarDisconto (int nPessoas) {
        if (nPessoas < 3) {
            return false;
        }
        return true;
    }

}
