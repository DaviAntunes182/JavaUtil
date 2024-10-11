import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteGenerics {
    public static void main(String[] args) {
        //Colocando tipo, especificamos que o array só pode ter contas
        ArrayList<Conta> contas = new ArrayList<Conta>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Conta cc = new ContaCorrente(22, 11);
        contas.add(cc);

        //Cada lista tem seu tipo, se passar errado vai dar erro

        Cliente cli = new Cliente();
        clientes.add(cli);



    }
}
