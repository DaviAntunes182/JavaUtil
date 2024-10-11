import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();
        Conta cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);
        Conta cc2 = new ContaCorrente(22, 33);
        lista.add(cc2);

        System.out.println("Tamanho " + lista.size());

        Conta ref =(Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho " + lista.size());
        Conta cc3 = new ContaCorrente(33, 44);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(44, 55);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("---------For each-------------");
        // Foreach
        for(Object o : lista){
            System.out.println(o);
        }
    }
}
