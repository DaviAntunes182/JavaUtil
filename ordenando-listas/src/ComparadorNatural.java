import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class ComparadorNatural {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 11);
        Cliente cli1 = new Cliente();
        cli1.setNome("Davi");
        cc1.setTitular(cli1);
        cc1.depositar("550");

        Conta cc2 = new ContaCorrente(22, 22);
        Cliente cli2 = new Cliente();
        cli2.setNome("Paulo");
        cc2.setTitular(cli2);
        cc2.depositar("1120");

        Conta cc3 = new ContaCorrente(22, 33);
        Cliente cli3 = new Cliente();
        cli3.setNome("Peter");
        cc3.setTitular(cli3);
        cc3.depositar("500");

        Conta cc4 = new ContaCorrente(22, 33);
        Cliente cli4 = new Cliente();
        cli4.setNome("Gaúcho");
        cc4.setTitular(cli4);
        cc4.depositar("100");

        List<Conta> list = new ArrayList<>();
        list.add(cc1);
        list.add(cc2);
        list.add(cc3);
        list.add(cc4);

        for(Conta conta : list){
            System.out.println(conta);
        }
        System.out.println("----------Comparador-------------");

        //Para utilizar o comparador natural passamos null no parâmetro
        list.sort(null);

        //É ordenado do menor pro maior
        for(Conta conta : list){
            System.out.println(conta);
            System.out.println(conta.getTitular().getNome());
        }
    }
}
