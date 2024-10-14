import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 11);
        cc1.depositar("300");
        Conta cc2 = new ContaCorrente(22, 22);
        cc2.depositar("400");
        Conta cc3 = new ContaCorrente(22, 33);
        cc3.depositar("500");
        Conta cc4 = new ContaCorrente(22, 33);
        cc4.depositar("600");

        List<Conta> list = new ArrayList<>();
        list.add(cc1);
        list.add(cc2);
        list.add(cc3);
        list.add(cc4);

        for(Conta conta : list){
            System.out.println(conta);
        }
        System.out.println("----------Comparador-------------");

        //Classes anônimas, que não tem nome, e servem para coisas específicas
        list.sort(new Comparator<Conta>(){
            @Override
            public int compare(Conta c1, Conta c2) {
                return c1.getNumero() - c2.getNumero();
            }
        });

        //Podemos guardar em uma variável se quisermos
        Comparator<Conta> comp = new Comparator<Conta>(){
            @Override
            public int compare(Conta c1, Conta c2) {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();
                return nomeC1.compareTo(nomeC2);
            }
        };

        for(Conta conta : list){
            System.out.println(conta);
        }
    }
}
