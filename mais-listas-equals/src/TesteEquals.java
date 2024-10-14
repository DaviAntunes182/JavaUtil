import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteEquals {
    public static void main(String[] args) {
        //Desvantagem -> Quando enche deve-se criar um array maior e copiar o itens para ele
        // -> Quando apagamos um item os itens posteriores são deslocados para trás
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(22, 33);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 33);

        for (Conta conta : lista) {
            // == e contains comparam referências e não os valores
            if(conta.equals(cc3)){
                //o metodo equals compara as referencias!
                System.out.println("Já tenho essa conta");
            }else {
                System.out.println("Não tenho essa conta");
            }
        }
    }
}
