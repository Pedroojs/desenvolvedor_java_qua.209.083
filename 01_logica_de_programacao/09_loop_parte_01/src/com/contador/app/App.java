import java.math.BigInteger;

public class App {
    public static void contarDecrescente(BigInteger inicio, BigInteger fim) {
        for (BigInteger i = inicio; i.compareTo(fim) >= 0; i = i.subtract(BigInteger.ONE)) {
            // processar aqui
            System.out.println(i); // cuidado: muito lento para intervalos grandes
        }
    }

    public static void main(String[] args) {
        contarDecrescente(new BigInteger("999"), BigInteger.valueOf(0));
    }
}
