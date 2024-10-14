import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(22, 33);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 33);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for (Conta conta : lista) {
            //ToString implícito
            System.out.println(conta);
        }
    }
}
