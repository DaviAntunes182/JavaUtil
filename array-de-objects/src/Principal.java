import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        //Guardando qualquer referência
        Object[] refs = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        refs[0] = cc1;

        ContaPoupanca cp1 = new ContaPoupanca(22, 22);
        refs[1] = cp1;

        Cliente cliente = new Cliente();
        refs[2] = cliente;

        ContaPoupanca ref = (ContaPoupanca) refs[1];
        System.out.println(ref.getNumero());

    }


}
