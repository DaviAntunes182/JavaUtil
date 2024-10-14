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
        ComparadorConta comparador = new ComparadorConta();
        list.sort(comparador);//O metodo sort pede um comparador como parâmetro, um critério de desempate

        for(Conta conta : list){
            System.out.println(conta);
        }
    }
}

class ComparadorConta implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {

        return c1.getNumero() - c2.getNumero();

//        return Integer.compare(c1.getNumero(), c2.getNumero());

        //O que define uma conta ser maior que a outra?
        //O que compararemos? Usaremos o número
//        if(c1.getNumero() < c2.getNumero()){
//            // c2 > c1
//            return -1;
//        }
//        if(c1.getNumero() > c2.getNumero()){
//            //c1 > c2
//            return 1;
//        }
//        //iguais
//        return 0;
    }
}