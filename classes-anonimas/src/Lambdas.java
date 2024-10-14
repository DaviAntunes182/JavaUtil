import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {
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

        //As coisas são implícitas, estamos usando conta e queremos retornar algo
        list.sort(
                (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero())
        );

        Comparator<Conta> comp = (Conta c1, Conta c2) ->{
            String nomeC1 = c1.getTitular().getNome();
            String nomeC2 = c2.getTitular().getNome();
            return nomeC1.compareTo(nomeC2);
        };
        //foreach com lambdas
        list.forEach(c -> System.out.println(c));
        list.forEach(System.out::println);
    }
}
