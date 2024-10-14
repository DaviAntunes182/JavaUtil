import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparandoStrings {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 11);
        Cliente cli1 = new Cliente();
        cli1.setNome("Davi");
        cc1.setTitular(cli1);
        cc1.depositar("300");

        Conta cc2 = new ContaCorrente(22, 22);
        Cliente cli2 = new Cliente();
        cli2.setNome("Paulo");
        cc2.setTitular(cli2);
        cc2.depositar("400");

        Conta cc3 = new ContaCorrente(22, 33);
        Cliente cli3 = new Cliente();
        cli3.setNome("Peter");
        cc3.setTitular(cli3);
        cc3.depositar("500");

        Conta cc4 = new ContaCorrente(22, 33);
        Cliente cli4 = new Cliente();
        cli4.setNome("Gaúcho");
        cc4.setTitular(cli4);
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

        list.sort(new TitularContaComparator());//O metodo sort pede um comparador como parâmetro, um critério de desempate

        for(Conta conta : list){
            System.out.println(conta);
            System.out.println(conta.getTitular().getNome());
        }
    }
}
class TitularContaComparator implements Comparator<Conta>{
    @Override
    public int compare(Conta c1, Conta c2) {

        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();

        //Metodo para comparar strings
        return nomeC1.compareTo(nomeC2);
    }
}
