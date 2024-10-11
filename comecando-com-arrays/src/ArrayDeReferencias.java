import modelo.ContaCorrente;

public class ArrayDeReferencias {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        for (int i = 0; i < contas.length; i++) {
            ContaCorrente conta = new ContaCorrente((i+1) * 111, (i+1) * 1111);
            contas[i] = conta;
            contas[i].depositar(""+(i + 1)*100);
        }
        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i].toString());
        }
    }
}
